package com.livelocationsharing;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import javax.inject.Inject;

@Slf4j
public class LiveLocationSharingDataManager {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @Inject
    private OkHttpClient okHttpClient;

    @Inject
    private Gson gson;

    @Inject
    private LiveLocationSharingPlugin plugin;

    private ArrayList<LiveLocationSharingData> parseData(JsonArray j)
    {
        ArrayList<LiveLocationSharingData> l = new ArrayList<>();
        for (JsonElement jsonElement : j)
        {
            JsonObject jObj = jsonElement.getAsJsonObject();
            if (!jObj.get("name").getAsString().equals(plugin.getPlayerName())) {
                LiveLocationSharingData d = new LiveLocationSharingData(jObj.get("name").getAsString(), jObj.get("x").getAsInt(),
                        jObj.get("y").getAsInt(), jObj.get("plane").getAsInt(), jObj.get("type").getAsString(),
                        jObj.get("title").getAsString(), jObj.get("world").getAsInt());
                l.add(d);
            }
        }
        return l;
    }

    protected void makePostRequest(Object temp)
    {
        try
        {
            Request r = new Request.Builder()
                    .url(plugin.getPostEndpoint())
                    .addHeader("Authorization", plugin.getSharedKey())
                    .post(RequestBody.create(JSON, gson.toJson(temp)))
                    .build();

            okHttpClient.newCall(r).enqueue(new Callback()
            {
                @Override
                public void onFailure(Call call, IOException e)
                {
                    log.error("Error sending player data");
                    plugin.setPostError(true);
                }

                @Override
                public void onResponse(Call call, Response response)
                {
                    if (response.isSuccessful())
                    {
                        try {
                            JsonArray j = new Gson().fromJson(response.body().string(), JsonArray.class);
                            plugin.setPlayerData(parseData(j));
                            log.debug(j.toString());
                            plugin.setPostError(false);
                            response.close();
                        }
                        catch (IOException | JsonSyntaxException e)
                        {
                            plugin.setGetError(true);
                            log.error(e.getMessage());
                        }
                    }
                    else
                    {
                        log.error("Post request unsuccessful");
                        plugin.setPostError(true);
                    }
                    response.close();
                }
            });
        }
        catch (IllegalArgumentException e)
        {
            log.error("Bad URL given: " + e.getLocalizedMessage());
            plugin.setPostError(true);
        }
    }

    protected void makeGetRequest()
    {
        try
        {
            Request r = new Request.Builder()
                    .url(plugin.getGetEndpoint())
                    .addHeader("Authorization", plugin.getSharedKey())
                    .build();
            okHttpClient.newCall(r).enqueue(new Callback()
            {
                @Override
                public void onFailure(Call call, IOException e)
                {
                    log.error("Error retrieving location data");
                    plugin.setGetError(true);
                }

                @Override
                public void onResponse(Call call, Response response)
                {
                    if (response.isSuccessful())
                    {
                        try
                        {
                            JsonArray j = new Gson().fromJson(response.body().string(), JsonArray.class);
                            plugin.setPlayerData(parseData(j));
                            log.debug(j.toString());
                            plugin.setGetError(false);
                            //plugin.updatePanelList();
                        }
                        catch (IOException | JsonSyntaxException e)
                        {
                            plugin.setGetError(true);
                            log.error(e.getMessage());
                        }
                    }
                    else
                    {
                        log.error("Get request unsuccessful");
                        plugin.setGetError(true);
                    }
                    response.close();
                }
            });
        }
        catch (IllegalArgumentException e)
        {
            log.error("Bad URL given: " + e.getLocalizedMessage());
        }
    }
}
