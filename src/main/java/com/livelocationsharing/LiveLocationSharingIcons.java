package com.livelocationsharing;

import java.awt.image.BufferedImage;
import net.runelite.client.util.ImageUtil;

public class LiveLocationSharingIcons {

    // Icons
    private static final BufferedImage NORMAL_ICON;
    private static final BufferedImage IM_ICON;
    private static final BufferedImage HCIM_ICON;
    private static final BufferedImage UIM_ICON;
    private static final BufferedImage GIM_ICON;
    private static final BufferedImage HCGIM_ICON;

    static
    {
        NORMAL_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/normal.png");
        NORMAL_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    static
    {
        IM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/im.png");
        IM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    static
    {
        HCIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/hcim.png");
        HCIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    static
    {
        UIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/uim.png");
        UIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    static
    {
        GIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/gim.png");
        GIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    static
    {
        HCGIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/hcgim.png");
        HCGIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }

    public static BufferedImage getAccountType(String type)
    {
        switch (type) {
            case "IRONMAN":
                return IM_ICON;
            case "HARDCORE_IRONMAN":
                return HCIM_ICON;
            case "ULTIMATE_IRONMAN":
                return UIM_ICON;
            case "GROUP_IRONMAN":
                return GIM_ICON;
            case "HARDCORE_GROUP_IRONMAN":
                return HCGIM_ICON;
            default:
                return NORMAL_ICON;
        }
    }


    // Icons
    private static final BufferedImage JAGEX_MODERATOR;
    static
    {
        JAGEX_MODERATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/jagex_moderator.png");
        JAGEX_MODERATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage OWNER;
    static
    {
        OWNER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/owner.png");
        OWNER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DEPUTY_OWNER;
    static
    {
        DEPUTY_OWNER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/deputy_owner.png");
        DEPUTY_OWNER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ADMINISTRATOR;
    static
    {
        ADMINISTRATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/administrator.png");
        ADMINISTRATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GUEST;
    static
    {
        GUEST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guest.png");
        GUEST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DOGSBODY;
    static
    {
        DOGSBODY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dogsbody.png");
        DOGSBODY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MINION;
    static
    {
        MINION = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/minion.png");
        MINION.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RECRUIT;
    static
    {
        RECRUIT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/recruit.png");
        RECRUIT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PAWN;
    static
    {
        PAWN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pawn.png");
        PAWN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PRIVATE;
    static
    {
        PRIVATE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/private.png");
        PRIVATE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CORPORAL;
    static
    {
        CORPORAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/corporal.png");
        CORPORAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NOVICE;
    static
    {
        NOVICE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/novice.png");
        NOVICE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SERGEANT;
    static
    {
        SERGEANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sergeant.png");
        SERGEANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CADET;
    static
    {
        CADET = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cadet.png");
        CADET.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PAGE;
    static
    {
        PAGE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/page.png");
        PAGE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NOBLE;
    static
    {
        NOBLE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/noble.png");
        NOBLE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ADEPT;
    static
    {
        ADEPT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adept.png");
        ADEPT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LEGIONNAIRE;
    static
    {
        LEGIONNAIRE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legionnaire.png");
        LEGIONNAIRE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LIEUTENANT;
    static
    {
        LIEUTENANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/lieutenant.png");
        LIEUTENANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PROSELYTE;
    static
    {
        PROSELYTE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/proselyte.png");
        PROSELYTE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CAPTAIN;
    static
    {
        CAPTAIN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/captain.png");
        CAPTAIN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MAJOR;
    static
    {
        MAJOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/major.png");
        MAJOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GENERAL;
    static
    {
        GENERAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/general.png");
        GENERAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MASTER;
    static
    {
        MASTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/master.png");
        MASTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage OFFICER;
    static
    {
        OFFICER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/officer.png");
        OFFICER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COMMANDER;
    static
    {
        COMMANDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/commander.png");
        COMMANDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COLONEL;
    static
    {
        COLONEL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/colonel.png");
        COLONEL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRIGADIER;
    static
    {
        BRIGADIER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brigadier.png");
        BRIGADIER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ADMIRAL;
    static
    {
        ADMIRAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/admiral.png");
        ADMIRAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MARSHAL;
    static
    {
        MARSHAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/marshal.png");
        MARSHAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage OPAL;
    static
    {
        OPAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/opal.png");
        OPAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage JADE;
    static
    {
        JADE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/jade.png");
        JADE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RED_TOPAZ;
    static
    {
        RED_TOPAZ = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/red_topaz.png");
        RED_TOPAZ.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SAPPHIRE;
    static
    {
        SAPPHIRE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sapphire.png");
        SAPPHIRE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EMERALD;
    static
    {
        EMERALD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/emerald.png");
        EMERALD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RUBY;
    static
    {
        RUBY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ruby.png");
        RUBY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DIAMOND;
    static
    {
        DIAMOND = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/diamond.png");
        DIAMOND.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DRAGONSTONE;
    static
    {
        DRAGONSTONE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dragonstone.png");
        DRAGONSTONE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ONYX;
    static
    {
        ONYX = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/onyx.png");
        ONYX.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ZENYTE;
    static
    {
        ZENYTE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zenyte.png");
        ZENYTE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage KITTEN;
    static
    {
        KITTEN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kitten.png");
        KITTEN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BOB;
    static
    {
        BOB = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bob.png");
        BOB.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WILY;
    static
    {
        WILY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wily.png");
        WILY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HELLCAT;
    static
    {
        HELLCAT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hellcat.png");
        HELLCAT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SKULLED;
    static
    {
        SKULLED = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/skulled.png");
        SKULLED.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GOBLIN;
    static
    {
        GOBLIN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/goblin.png");
        GOBLIN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BEAST;
    static
    {
        BEAST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/beast.png");
        BEAST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage IMP;
    static
    {
        IMP = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/imp.png");
        IMP.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GNOME_CHILD;
    static
    {
        GNOME_CHILD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gnome_child.png");
        GNOME_CHILD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GNOME_ELDER;
    static
    {
        GNOME_ELDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gnome_elder.png");
        GNOME_ELDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SHORT_GREEN_GUY;
    static
    {
        SHORT_GREEN_GUY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/short_green_guy.png");
        SHORT_GREEN_GUY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MISTHALINIAN;
    static
    {
        MISTHALINIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/misthalinian.png");
        MISTHALINIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage KARAMJAN;
    static
    {
        KARAMJAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/karamjan.png");
        KARAMJAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ASGARNIAN;
    static
    {
        ASGARNIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/asgarnian.png");
        ASGARNIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage KHARIDIAN;
    static
    {
        KHARIDIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kharidian.png");
        KHARIDIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MORYTANIAN;
    static
    {
        MORYTANIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/morytanian.png");
        MORYTANIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WILD;
    static
    {
        WILD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wild.png");
        WILD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage KANDARIN;
    static
    {
        KANDARIN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kandarin.png");
        KANDARIN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FREMENNIK;
    static
    {
        FREMENNIK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fremennik.png");
        FREMENNIK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TIRANNIAN;
    static
    {
        TIRANNIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tirannian.png");
        TIRANNIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRASSICAN;
    static
    {
        BRASSICAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brassican.png");
        BRASSICAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SARADOMINIST;
    static
    {
        SARADOMINIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/saradominist.png");
        SARADOMINIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GUTHIXIAN;
    static
    {
        GUTHIXIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guthixian.png");
        GUTHIXIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ZAMORAKIAN;
    static
    {
        ZAMORAKIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zamorakian.png");
        ZAMORAKIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SERENIST;
    static
    {
        SERENIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/serenist.png");
        SERENIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BANDOSIAN;
    static
    {
        BANDOSIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bandosian.png");
        BANDOSIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ZAROSIAN;
    static
    {
        ZAROSIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zarosian.png");
        ZAROSIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ARMADYLEAN;
    static
    {
        ARMADYLEAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/armadylean.png");
        ARMADYLEAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage XERICIAN;
    static
    {
        XERICIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/xerician.png");
        XERICIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage AIR;
    static
    {
        AIR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/air.png");
        AIR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MIND;
    static
    {
        MIND = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mind.png");
        MIND.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WATER;
    static
    {
        WATER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/water.png");
        WATER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EARTH;
    static
    {
        EARTH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/earth.png");
        EARTH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FIRE;
    static
    {
        FIRE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fire.png");
        FIRE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BODY;
    static
    {
        BODY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/body.png");
        BODY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COSMIC;
    static
    {
        COSMIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cosmic.png");
        COSMIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CHAOS;
    static
    {
        CHAOS = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/chaos.png");
        CHAOS.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NATURE;
    static
    {
        NATURE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/nature.png");
        NATURE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LAW;
    static
    {
        LAW = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/law.png");
        LAW.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DEATH;
    static
    {
        DEATH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/death.png");
        DEATH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ASTRAL;
    static
    {
        ASTRAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/astral.png");
        ASTRAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BLOOD;
    static
    {
        BLOOD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blood.png");
        BLOOD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SOUL;
    static
    {
        SOUL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/soul.png");
        SOUL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WRATH;
    static
    {
        WRATH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wrath.png");
        WRATH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DISEASED;
    static
    {
        DISEASED = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/diseased.png");
        DISEASED.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PINE;
    static
    {
        PINE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pine.png");
        PINE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WINTUMBER;
    static
    {
        WINTUMBER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wintumber.png");
        WINTUMBER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage OAK;
    static
    {
        OAK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/oak.png");
        OAK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WILLOW;
    static
    {
        WILLOW = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/willow.png");
        WILLOW.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MAPLE;
    static
    {
        MAPLE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/maple.png");
        MAPLE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage YEW;
    static
    {
        YEW = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/yew.png");
        YEW.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BLISTERWOOD;
    static
    {
        BLISTERWOOD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blisterwood.png");
        BLISTERWOOD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MAGIC;
    static
    {
        MAGIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/magic.png");
        MAGIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ATTACKER;
    static
    {
        ATTACKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/attacker.png");
        ATTACKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ENFORCER;
    static
    {
        ENFORCER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/enforcer.png");
        ENFORCER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DEFENDER;
    static
    {
        DEFENDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/defender.png");
        DEFENDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RANGER;
    static
    {
        RANGER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ranger.png");
        RANGER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PRIEST;
    static
    {
        PRIEST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/priest.png");
        PRIEST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MAGICIAN;
    static
    {
        MAGICIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/magician.png");
        MAGICIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RUNECRAFTER;
    static
    {
        RUNECRAFTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/runecrafter.png");
        RUNECRAFTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MEDIC;
    static
    {
        MEDIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/medic.png");
        MEDIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ATHLETE;
    static
    {
        ATHLETE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/athlete.png");
        ATHLETE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HERBOLOGIST;
    static
    {
        HERBOLOGIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/herbologist.png");
        HERBOLOGIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage THIEF;
    static
    {
        THIEF = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/thief.png");
        THIEF.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CRAFTER;
    static
    {
        CRAFTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crafter.png");
        CRAFTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FLETCHER;
    static
    {
        FLETCHER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fletcher.png");
        FLETCHER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MINER;
    static
    {
        MINER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/miner.png");
        MINER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SMITH;
    static
    {
        SMITH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smith.png");
        SMITH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FISHER;
    static
    {
        FISHER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fisher.png");
        FISHER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COOK;
    static
    {
        COOK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cook.png");
        COOK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FIREMAKER;
    static
    {
        FIREMAKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/firemaker.png");
        FIREMAKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LUMBERJACK;
    static
    {
        LUMBERJACK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/lumberjack.png");
        LUMBERJACK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SLAYER;
    static
    {
        SLAYER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/slayer.png");
        SLAYER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FARMER;
    static
    {
        FARMER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/farmer.png");
        FARMER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CONSTRUCTOR;
    static
    {
        CONSTRUCTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/constructor.png");
        CONSTRUCTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HUNTER;
    static
    {
        HUNTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hunter.png");
        HUNTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SKILLER;
    static
    {
        SKILLER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/skiller.png");
        SKILLER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COMPETITOR;
    static
    {
        COMPETITOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/competitor.png");
        COMPETITOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HOLY;
    static
    {
        HOLY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/holy.png");
        HOLY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage UNHOLY;
    static
    {
        UNHOLY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/unholy.png");
        UNHOLY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NATURAL;
    static
    {
        NATURAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/natural.png");
        NATURAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SAGE;
    static
    {
        SAGE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sage.png");
        SAGE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DESTROYER;
    static
    {
        DESTROYER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/destroyer.png");
        DESTROYER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MEDIATOR;
    static
    {
        MEDIATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mediator.png");
        MEDIATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LEGEND;
    static
    {
        LEGEND = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legend.png");
        LEGEND.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MYTH;
    static
    {
        MYTH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/myth.png");
        MYTH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TZTOK;
    static
    {
        TZTOK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tztok.png");
        TZTOK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TZKAL;
    static
    {
        TZKAL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tzkal.png");
        TZKAL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MAXED;
    static
    {
        MAXED = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/maxed.png");
        MAXED.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ANCHOR;
    static
    {
        ANCHOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/anchor.png");
        ANCHOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage APOTHECARY;
    static
    {
        APOTHECARY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/apothecary.png");
        APOTHECARY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MERCHANT;
    static
    {
        MERCHANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/merchant.png");
        MERCHANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FEEDER;
    static
    {
        FEEDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/feeder.png");
        FEEDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HARPOON;
    static
    {
        HARPOON = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/harpoon.png");
        HARPOON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CARRY;
    static
    {
        CARRY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/carry.png");
        CARRY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ARCHER;
    static
    {
        ARCHER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/archer.png");
        ARCHER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BATTLEMAGE;
    static
    {
        BATTLEMAGE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/battlemage.png");
        BATTLEMAGE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ARTILLERY;
    static
    {
        ARTILLERY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/artillery.png");
        ARTILLERY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage INFANTRY;
    static
    {
        INFANTRY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/infantry.png");
        INFANTRY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SMITER;
    static
    {
        SMITER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smiter.png");
        SMITER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LOOTER;
    static
    {
        LOOTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/looter.png");
        LOOTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SAVIOUR;
    static
    {
        SAVIOUR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/saviour.png");
        SAVIOUR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SNIPER;
    static
    {
        SNIPER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sniper.png");
        SNIPER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CRUSADER;
    static
    {
        CRUSADER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crusader.png");
        CRUSADER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SPELLCASTER;
    static
    {
        SPELLCASTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/spellcaster.png");
        SPELLCASTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MENTOR;
    static
    {
        MENTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mentor.png");
        MENTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PREFECT;
    static
    {
        PREFECT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prefect.png");
        PREFECT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LEADER;
    static
    {
        LEADER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/leader.png");
        LEADER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SUPERVISOR;
    static
    {
        SUPERVISOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/supervisor.png");
        SUPERVISOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SUPERIOR;
    static
    {
        SUPERIOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/superior.png");
        SUPERIOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EXECUTIVE;
    static
    {
        EXECUTIVE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/executive.png");
        EXECUTIVE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SENATOR;
    static
    {
        SENATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/senator.png");
        SENATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MONARCH;
    static
    {
        MONARCH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/monarch.png");
        MONARCH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SCAVENGER;
    static
    {
        SCAVENGER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scavenger.png");
        SCAVENGER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LABOURER;
    static
    {
        LABOURER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/labourer.png");
        LABOURER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WORKER;
    static
    {
        WORKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/worker.png");
        WORKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FORAGER;
    static
    {
        FORAGER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/forager.png");
        FORAGER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HOARDER;
    static
    {
        HOARDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hoarder.png");
        HOARDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PROSPECTOR;
    static
    {
        PROSPECTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prospector.png");
        PROSPECTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GATHERER;
    static
    {
        GATHERER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gatherer.png");
        GATHERER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COLLECTOR;
    static
    {
        COLLECTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/collector.png");
        COLLECTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRONZE;
    static
    {
        BRONZE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bronze.png");
        BRONZE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage IRON;
    static
    {
        IRON = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/iron.png");
        IRON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage STEEL;
    static
    {
        STEEL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/steel.png");
        STEEL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GOLD;
    static
    {
        GOLD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gold.png");
        GOLD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MITHRIL;
    static
    {
        MITHRIL = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mithril.png");
        MITHRIL.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ADAMANT;
    static
    {
        ADAMANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adamant.png");
        ADAMANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RUNE;
    static
    {
        RUNE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/rune.png");
        RUNE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DRAGON;
    static
    {
        DRAGON = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dragon.png");
        DRAGON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PROTECTOR;
    static
    {
        PROTECTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/protector.png");
        PROTECTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BULWARK;
    static
    {
        BULWARK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bulwark.png");
        BULWARK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage JUSTICIAR;
    static
    {
        JUSTICIAR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/justiciar.png");
        JUSTICIAR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SENTRY;
    static
    {
        SENTRY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sentry.png");
        SENTRY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GUARDIAN;
    static
    {
        GUARDIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guardian.png");
        GUARDIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WARDEN;
    static
    {
        WARDEN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warden.png");
        WARDEN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage VANGUARD;
    static
    {
        VANGUARD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/vanguard.png");
        VANGUARD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TEMPLAR;
    static
    {
        TEMPLAR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/templar.png");
        TEMPLAR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SQUIRE;
    static
    {
        SQUIRE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/squire.png");
        SQUIRE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DUELLIST;
    static
    {
        DUELLIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/duellist.png");
        DUELLIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage STRIKER;
    static
    {
        STRIKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/striker.png");
        STRIKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NINJA;
    static
    {
        NINJA = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ninja.png");
        NINJA.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage INQUISITOR;
    static
    {
        INQUISITOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/inquisitor.png");
        INQUISITOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EXPERT;
    static
    {
        EXPERT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/expert.png");
        EXPERT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage KNIGHT;
    static
    {
        KNIGHT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/knight.png");
        KNIGHT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PALADIN;
    static
    {
        PALADIN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/paladin.png");
        PALADIN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GOON;
    static
    {
        GOON = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/goon.png");
        GOON.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRAWLER;
    static
    {
        BRAWLER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brawler.png");
        BRAWLER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRUISER;
    static
    {
        BRUISER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bruiser.png");
        BRUISER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SCOURGE;
    static
    {
        SCOURGE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scourge.png");
        SCOURGE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FIGHTER;
    static
    {
        FIGHTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fighter.png");
        FIGHTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WARRIOR;
    static
    {
        WARRIOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warrior.png");
        WARRIOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BARBARIAN;
    static
    {
        BARBARIAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/barbarian.png");
        BARBARIAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BERSERKER;
    static
    {
        BERSERKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/berserker.png");
        BERSERKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage STAFF;
    static
    {
        STAFF = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/staff.png");
        STAFF.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CREW;
    static
    {
        CREW = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crew.png");
        CREW.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HELPER;
    static
    {
        HELPER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/helper.png");
        HELPER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MODERATOR;
    static
    {
        MODERATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/moderator.png");
        MODERATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SHERIFF;
    static
    {
        SHERIFF = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sheriff.png");
        SHERIFF.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RED;
    static
    {
        RED = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/red.png");
        RED.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ORANGE;
    static
    {
        ORANGE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/orange.png");
        ORANGE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage YELLOW;
    static
    {
        YELLOW = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/yellow.png");
        YELLOW.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GREEN;
    static
    {
        GREEN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/green.png");
        GREEN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BLUE;
    static
    {
        BLUE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blue.png");
        BLUE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PURPLE;
    static
    {
        PURPLE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/purple.png");
        PURPLE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PINK;
    static
    {
        PINK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pink.png");
        PINK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GREY;
    static
    {
        GREY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/grey.png");
        GREY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WIZARD;
    static
    {
        WIZARD = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wizard.png");
        WIZARD.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TRICKSTER;
    static
    {
        TRICKSTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/trickster.png");
        TRICKSTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ILLUSIONIST;
    static
    {
        ILLUSIONIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/illusionist.png");
        ILLUSIONIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SUMMONER;
    static
    {
        SUMMONER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/summoner.png");
        SUMMONER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NECROMANCER;
    static
    {
        NECROMANCER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/necromancer.png");
        NECROMANCER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WARLOCK;
    static
    {
        WARLOCK = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warlock.png");
        WARLOCK.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WITCH;
    static
    {
        WITCH = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/witch.png");
        WITCH.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SEER;
    static
    {
        SEER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/seer.png");
        SEER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ASSASSIN;
    static
    {
        ASSASSIN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/assassin.png");
        ASSASSIN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CUTPURSE;
    static
    {
        CUTPURSE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cutpurse.png");
        CUTPURSE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BANDIT;
    static
    {
        BANDIT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bandit.png");
        BANDIT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SCOUT;
    static
    {
        SCOUT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scout.png");
        SCOUT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BURGLAR;
    static
    {
        BURGLAR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/burglar.png");
        BURGLAR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ROGUE;
    static
    {
        ROGUE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/rogue.png");
        ROGUE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SMUGGLER;
    static
    {
        SMUGGLER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smuggler.png");
        SMUGGLER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BRIGAND;
    static
    {
        BRIGAND = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brigand.png");
        BRIGAND.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DEFILER;
    static
    {
        DEFILER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/defiler.png");
        DEFILER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PURE;
    static
    {
        PURE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pure.png");
        PURE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CHAMPION;
    static
    {
        CHAMPION = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/champion.png");
        CHAMPION.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EPIC;
    static
    {
        EPIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/epic.png");
        EPIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage MYSTIC;
    static
    {
        MYSTIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mystic.png");
        MYSTIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HERO;
    static
    {
        HERO = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hero.png");
        HERO.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TRIALIST;
    static
    {
        TRIALIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/trialist.png");
        TRIALIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ORACLE;
    static
    {
        ORACLE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/oracle.png");
        ORACLE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SCHOLAR;
    static
    {
        SCHOLAR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scholar.png");
        SCHOLAR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COUNCILLOR;
    static
    {
        COUNCILLOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/councillor.png");
        COUNCILLOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RECRUITER;
    static
    {
        RECRUITER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/recruiter.png");
        RECRUITER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LEARNER;
    static
    {
        LEARNER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/learner.png");
        LEARNER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SCRIBE;
    static
    {
        SCRIBE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scribe.png");
        SCRIBE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ASSISTANT;
    static
    {
        ASSISTANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/assistant.png");
        ASSISTANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage TEACHER;
    static
    {
        TEACHER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/teacher.png");
        TEACHER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COORDINATOR;
    static
    {
        COORDINATOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/coordinator.png");
        COORDINATOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WALKER;
    static
    {
        WALKER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/walker.png");
        WALKER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SPEED_RUNNER;
    static
    {
        SPEED_RUNNER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/speed_runner.png");
        SPEED_RUNNER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage WANDERER;
    static
    {
        WANDERER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wanderer.png");
        WANDERER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PILGRIM;
    static
    {
        PILGRIM = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pilgrim.png");
        PILGRIM.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage VAGRANT;
    static
    {
        VAGRANT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/vagrant.png");
        VAGRANT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RECORD_CHASER;
    static
    {
        RECORD_CHASER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/record_chaser.png");
        RECORD_CHASER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RACER;
    static
    {
        RACER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/racer.png");
        RACER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage STRIDER;
    static
    {
        STRIDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/strider.png");
        STRIDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DOCTOR;
    static
    {
        DOCTOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/doctor.png");
        DOCTOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage NURSE;
    static
    {
        NURSE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/nurse.png");
        NURSE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage DRUID;
    static
    {
        DRUID = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/druid.png");
        DRUID.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage HEALER;
    static
    {
        HEALER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/healer.png");
        HEALER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ZEALOT;
    static
    {
        ZEALOT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zealot.png");
        ZEALOT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage CLERIC;
    static
    {
        CLERIC = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cleric.png");
        CLERIC.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SHAMAN;
    static
    {
        SHAMAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/shaman.png");
        SHAMAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage THERAPIST;
    static
    {
        THERAPIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/therapist.png");
        THERAPIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage GAMER;
    static
    {
        GAMER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gamer.png");
        GAMER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ADVENTURER;
    static
    {
        ADVENTURER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adventurer.png");
        ADVENTURER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage EXPLORER;
    static
    {
        EXPLORER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/explorer.png");
        EXPLORER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ACHIEVER;
    static
    {
        ACHIEVER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/achiever.png");
        ACHIEVER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage QUESTER;
    static
    {
        QUESTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/quester.png");
        QUESTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage RAIDER;
    static
    {
        RAIDER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/raider.png");
        RAIDER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage COMPLETIONIST;
    static
    {
        COMPLETIONIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/completionist.png");
        COMPLETIONIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ELITE;
    static
    {
        ELITE = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/elite.png");
        ELITE.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage FIRESTARTER;
    static
    {
        FIRESTARTER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/firestarter.png");
        FIRESTARTER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage SPECIALIST;
    static
    {
        SPECIALIST = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/specialist.png");
        SPECIALIST.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage BURNT;
    static
    {
        BURNT = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/burnt.png");
        BURNT.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PYROMANCER;
    static
    {
        PYROMANCER = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pyromancer.png");
        PYROMANCER.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage PRODIGY;
    static
    {
        PRODIGY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prodigy.png");
        PRODIGY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage IGNITOR;
    static
    {
        IGNITOR = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ignitor.png");
        IGNITOR.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage ARTISAN;
    static
    {
        ARTISAN = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/artisan.png");
        ARTISAN.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }
    private static final BufferedImage LEGACY;
    static
    {
        LEGACY = new BufferedImage(39, 39, BufferedImage.TYPE_INT_ARGB);
        final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legacy.png");
        LEGACY.getGraphics().drawImage(waypointIcon, 0, 0, null);
    }


    public static BufferedImage getClanRank(String title)
    {
        switch (title) {
            case "Jagex Moderator":
                return JAGEX_MODERATOR;
            case "Owner":
                return OWNER;
            case "Deputy Owner":
                return DEPUTY_OWNER;
            case "Administrator":
                return ADMINISTRATOR;
            case "Guest":
                return GUEST;
            case "Dogsbody":
                return DOGSBODY;
            case "Minion":
                return MINION;
            case "Recruit":
                return RECRUIT;
            case "Pawn":
                return PAWN;
            case "Private":
                return PRIVATE;
            case "Corporal":
                return CORPORAL;
            case "Novice":
                return NOVICE;
            case "Sergeant":
                return SERGEANT;
            case "Cadet":
                return CADET;
            case "Page":
                return PAGE;
            case "Noble":
                return NOBLE;
            case "Adept":
                return ADEPT;
            case "Legionnaire":
                return LEGIONNAIRE;
            case "Lieutenant":
                return LIEUTENANT;
            case "Proselyte":
                return PROSELYTE;
            case "Captain":
                return CAPTAIN;
            case "Major":
                return MAJOR;
            case "General":
                return GENERAL;
            case "Master":
                return MASTER;
            case "Officer":
                return OFFICER;
            case "Commander":
                return COMMANDER;
            case "Colonel":
                return COLONEL;
            case "Brigadier":
                return BRIGADIER;
            case "Admiral":
                return ADMIRAL;
            case "Marshal":
                return MARSHAL;
            case "Opal":
                return OPAL;
            case "Jade":
                return JADE;
            case "Red Topaz":
                return RED_TOPAZ;
            case "Sapphire":
                return SAPPHIRE;
            case "Emerald":
                return EMERALD;
            case "Ruby":
                return RUBY;
            case "Diamond":
                return DIAMOND;
            case "Dragonstone":
                return DRAGONSTONE;
            case "Onyx":
                return ONYX;
            case "Zenyte":
                return ZENYTE;
            case "Kitten":
                return KITTEN;
            case "Bob":
                return BOB;
            case "Wily":
                return WILY;
            case "Hellcat":
                return HELLCAT;
            case "Skulled":
                return SKULLED;
            case "Goblin":
                return GOBLIN;
            case "Beast":
                return BEAST;
            case "Imp":
                return IMP;
            case "Gnome Child":
                return GNOME_CHILD;
            case "Gnome Elder":
                return GNOME_ELDER;
            case "Short Green_guy":
                return SHORT_GREEN_GUY;
            case "Misthalinian":
                return MISTHALINIAN;
            case "Karamjan":
                return KARAMJAN;
            case "Asgarnian":
                return ASGARNIAN;
            case "Kharidian":
                return KHARIDIAN;
            case "Morytanian":
                return MORYTANIAN;
            case "Wild":
                return WILD;
            case "Kandarin":
                return KANDARIN;
            case "Fremennik":
                return FREMENNIK;
            case "Tirannian":
                return TIRANNIAN;
            case "Brassican":
                return BRASSICAN;
            case "Saradominist":
                return SARADOMINIST;
            case "Guthixian":
                return GUTHIXIAN;
            case "Zamorakian":
                return ZAMORAKIAN;
            case "Serenist":
                return SERENIST;
            case "Bandosian":
                return BANDOSIAN;
            case "Zarosian":
                return ZAROSIAN;
            case "Armadylean":
                return ARMADYLEAN;
            case "Xerician":
                return XERICIAN;
            case "Air":
                return AIR;
            case "Mind":
                return MIND;
            case "Water":
                return WATER;
            case "Earth":
                return EARTH;
            case "Fire":
                return FIRE;
            case "Body":
                return BODY;
            case "Cosmic":
                return COSMIC;
            case "Chaos":
                return CHAOS;
            case "Nature":
                return NATURE;
            case "Law":
                return LAW;
            case "Death":
                return DEATH;
            case "Astral":
                return ASTRAL;
            case "Blood":
                return BLOOD;
            case "Soul":
                return SOUL;
            case "Wrath":
                return WRATH;
            case "Diseased":
                return DISEASED;
            case "Pine":
                return PINE;
            case "Wintumber":
                return WINTUMBER;
            case "Oak":
                return OAK;
            case "Willow":
                return WILLOW;
            case "Maple":
                return MAPLE;
            case "Yew":
                return YEW;
            case "Blisterwood":
                return BLISTERWOOD;
            case "Magic":
                return MAGIC;
            case "Attacker":
                return ATTACKER;
            case "Enforcer":
                return ENFORCER;
            case "Defender":
                return DEFENDER;
            case "Ranger":
                return RANGER;
            case "Priest":
                return PRIEST;
            case "Magician":
                return MAGICIAN;
            case "Runecrafter":
                return RUNECRAFTER;
            case "Medic":
                return MEDIC;
            case "Athlete":
                return ATHLETE;
            case "Herbologist":
                return HERBOLOGIST;
            case "Thief":
                return THIEF;
            case "Crafter":
                return CRAFTER;
            case "Fletcher":
                return FLETCHER;
            case "Miner":
                return MINER;
            case "Smith":
                return SMITH;
            case "Fisher":
                return FISHER;
            case "Cook":
                return COOK;
            case "Firemaker":
                return FIREMAKER;
            case "Lumberjack":
                return LUMBERJACK;
            case "Slayer":
                return SLAYER;
            case "Farmer":
                return FARMER;
            case "Constructor":
                return CONSTRUCTOR;
            case "Hunter":
                return HUNTER;
            case "Skiller":
                return SKILLER;
            case "Competitor":
                return COMPETITOR;
            case "Holy":
                return HOLY;
            case "Unholy":
                return UNHOLY;
            case "Natural":
                return NATURAL;
            case "Sage":
                return SAGE;
            case "Destroyer":
                return DESTROYER;
            case "Mediator":
                return MEDIATOR;
            case "Legend":
                return LEGEND;
            case "Myth":
                return MYTH;
            case "Tztok":
                return TZTOK;
            case "Tzkal":
                return TZKAL;
            case "Maxed":
                return MAXED;
            case "Anchor":
                return ANCHOR;
            case "Apothecary":
                return APOTHECARY;
            case "Merchant":
                return MERCHANT;
            case "Feeder":
                return FEEDER;
            case "Harpoon":
                return HARPOON;
            case "Carry":
                return CARRY;
            case "Archer":
                return ARCHER;
            case "Battlemage":
                return BATTLEMAGE;
            case "Artillery":
                return ARTILLERY;
            case "Infantry":
                return INFANTRY;
            case "Smiter":
                return SMITER;
            case "Looter":
                return LOOTER;
            case "Saviour":
                return SAVIOUR;
            case "Sniper":
                return SNIPER;
            case "Crusader":
                return CRUSADER;
            case "Spellcaster":
                return SPELLCASTER;
            case "Mentor":
                return MENTOR;
            case "Prefect":
                return PREFECT;
            case "Leader":
                return LEADER;
            case "Supervisor":
                return SUPERVISOR;
            case "Superior":
                return SUPERIOR;
            case "Executive":
                return EXECUTIVE;
            case "Senator":
                return SENATOR;
            case "Monarch":
                return MONARCH;
            case "Scavenger":
                return SCAVENGER;
            case "Labourer":
                return LABOURER;
            case "Worker":
                return WORKER;
            case "Forager":
                return FORAGER;
            case "Hoarder":
                return HOARDER;
            case "Prospector":
                return PROSPECTOR;
            case "Gatherer":
                return GATHERER;
            case "Collector":
                return COLLECTOR;
            case "Bronze":
                return BRONZE;
            case "Iron":
                return IRON;
            case "Steel":
                return STEEL;
            case "Gold":
                return GOLD;
            case "Mithril":
                return MITHRIL;
            case "Adamant":
                return ADAMANT;
            case "Rune":
                return RUNE;
            case "Dragon":
                return DRAGON;
            case "Protector":
                return PROTECTOR;
            case "Bulwark":
                return BULWARK;
            case "Justiciar":
                return JUSTICIAR;
            case "Sentry":
                return SENTRY;
            case "Guardian":
                return GUARDIAN;
            case "Warden":
                return WARDEN;
            case "Vanguard":
                return VANGUARD;
            case "Templar":
                return TEMPLAR;
            case "Squire":
                return SQUIRE;
            case "Duellist":
                return DUELLIST;
            case "Striker":
                return STRIKER;
            case "Ninja":
                return NINJA;
            case "Inquisitor":
                return INQUISITOR;
            case "Expert":
                return EXPERT;
            case "Knight":
                return KNIGHT;
            case "Paladin":
                return PALADIN;
            case "Goon":
                return GOON;
            case "Brawler":
                return BRAWLER;
            case "Bruiser":
                return BRUISER;
            case "Scourge":
                return SCOURGE;
            case "Fighter":
                return FIGHTER;
            case "Warrior":
                return WARRIOR;
            case "Barbarian":
                return BARBARIAN;
            case "Berserker":
                return BERSERKER;
            case "Staff":
                return STAFF;
            case "Crew":
                return CREW;
            case "Helper":
                return HELPER;
            case "Moderator":
                return MODERATOR;
            case "Sheriff":
                return SHERIFF;
            case "Red":
                return RED;
            case "Orange":
                return ORANGE;
            case "Yellow":
                return YELLOW;
            case "Green":
                return GREEN;
            case "Blue":
                return BLUE;
            case "Purple":
                return PURPLE;
            case "Pink":
                return PINK;
            case "Grey":
                return GREY;
            case "Wizard":
                return WIZARD;
            case "Trickster":
                return TRICKSTER;
            case "Illusionist":
                return ILLUSIONIST;
            case "Summoner":
                return SUMMONER;
            case "Necromancer":
                return NECROMANCER;
            case "Warlock":
                return WARLOCK;
            case "Witch":
                return WITCH;
            case "Seer":
                return SEER;
            case "Assassin":
                return ASSASSIN;
            case "Cutpurse":
                return CUTPURSE;
            case "Bandit":
                return BANDIT;
            case "Scout":
                return SCOUT;
            case "Burglar":
                return BURGLAR;
            case "Rogue":
                return ROGUE;
            case "Smuggler":
                return SMUGGLER;
            case "Brigand":
                return BRIGAND;
            case "Defiler":
                return DEFILER;
            case "Pure":
                return PURE;
            case "Champion":
                return CHAMPION;
            case "Epic":
                return EPIC;
            case "Mystic":
                return MYSTIC;
            case "Hero":
                return HERO;
            case "Trialist":
                return TRIALIST;
            case "Oracle":
                return ORACLE;
            case "Scholar":
                return SCHOLAR;
            case "Councillor":
                return COUNCILLOR;
            case "Recruiter":
                return RECRUITER;
            case "Learner":
                return LEARNER;
            case "Scribe":
                return SCRIBE;
            case "Assistant":
                return ASSISTANT;
            case "Teacher":
                return TEACHER;
            case "Coordinator":
                return COORDINATOR;
            case "Walker":
                return WALKER;
            case "Speed-Runner":
                return SPEED_RUNNER;
            case "Wanderer":
                return WANDERER;
            case "Pilgrim":
                return PILGRIM;
            case "Vagrant":
                return VAGRANT;
            case "Record-Chaser":
                return RECORD_CHASER;
            case "Racer":
                return RACER;
            case "Strider":
                return STRIDER;
            case "Doctor":
                return DOCTOR;
            case "Nurse":
                return NURSE;
            case "Druid":
                return DRUID;
            case "Healer":
                return HEALER;
            case "Zealot":
                return ZEALOT;
            case "Cleric":
                return CLERIC;
            case "Shaman":
                return SHAMAN;
            case "Therapist":
                return THERAPIST;
            case "Gamer":
                return GAMER;
            case "Adventurer":
                return ADVENTURER;
            case "Explorer":
                return EXPLORER;
            case "Achiever":
                return ACHIEVER;
            case "Quester":
                return QUESTER;
            case "Raider":
                return RAIDER;
            case "Completionist":
                return COMPLETIONIST;
            case "Elite":
                return ELITE;
            case "Firestarter":
                return FIRESTARTER;
            case "Specialist":
                return SPECIALIST;
            case "Burnt":
                return BURNT;
            case "Pyromancer":
                return PYROMANCER;
            case "Prodigy":
                return PRODIGY;
            case "Ignitor":
                return IGNITOR;
            case "Artisan":
                return ARTISAN;
            case "Legacy":
                return LEGACY;
            default:
                return NORMAL_ICON;
        }
    }
}
