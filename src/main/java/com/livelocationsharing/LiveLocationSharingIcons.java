package com.livelocationsharing;

import java.awt.image.BufferedImage;
import net.runelite.client.util.ImageUtil;

public class LiveLocationSharingIcons {

    // Icons
    private static final BufferedImage NORMAL_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/normal.png");
    private static final BufferedImage IM_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/im.png");
    private static final BufferedImage HCIM_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/hcim.png");
    private static final BufferedImage UIM_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/uim.png");
    private static final BufferedImage GIM_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/gim.png");
    private static final BufferedImage HCGIM_ICON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/type/hcgim.png");

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
    private static final BufferedImage ACHIEVER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/achiever.png");
    private static final BufferedImage ADAMANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adamant.png");
    private static final BufferedImage ADEPT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adept.png");
    private static final BufferedImage ADMINISTRATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/administrator.png");
    private static final BufferedImage ADMIRAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/admiral.png");
    private static final BufferedImage ADVENTURER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/adventurer.png");
    private static final BufferedImage AIR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/air.png");
    private static final BufferedImage ANCHOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/anchor.png");
    private static final BufferedImage APOTHECARY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/apothecary.png");
    private static final BufferedImage ARCHER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/archer.png");
    private static final BufferedImage ARMADYLEAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/armadylean.png");
    private static final BufferedImage ARTILLERY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/artillery.png");
    private static final BufferedImage ARTISAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/artisan.png");
    private static final BufferedImage ASGARNIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/asgarnian.png");
    private static final BufferedImage ASSASSIN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/assassin.png");
    private static final BufferedImage ASSISTANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/assistant.png");
    private static final BufferedImage ASTRAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/astral.png");
    private static final BufferedImage ATHLETE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/athlete.png");
    private static final BufferedImage ATTACKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/attacker.png");
    private static final BufferedImage BANDIT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bandit.png");
    private static final BufferedImage BANDOSIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bandosian.png");
    private static final BufferedImage BARBARIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/barbarian.png");
    private static final BufferedImage BATTLEMAGE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/battlemage.png");
    private static final BufferedImage BEAST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/beast.png");
    private static final BufferedImage BERSERKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/berserker.png");
    private static final BufferedImage BLISTERWOOD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blisterwood.png");
    private static final BufferedImage BLOOD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blood.png");
    private static final BufferedImage BLUE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/blue.png");
    private static final BufferedImage BOB = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bob.png");
    private static final BufferedImage BODY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/body.png");
    private static final BufferedImage BRASSICAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brassican.png");
    private static final BufferedImage BRAWLER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brawler.png");
    private static final BufferedImage BRIGADIER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brigadier.png");
    private static final BufferedImage BRIGAND = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/brigand.png");
    private static final BufferedImage BRONZE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bronze.png");
    private static final BufferedImage BRUISER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bruiser.png");
    private static final BufferedImage BULWARK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/bulwark.png");
    private static final BufferedImage BURGLAR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/burglar.png");
    private static final BufferedImage BURNT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/burnt.png");
    private static final BufferedImage CADET = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cadet.png");
    private static final BufferedImage CAPTAIN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/captain.png");
    private static final BufferedImage CARRY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/carry.png");
    private static final BufferedImage CHAMPION = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/champion.png");
    private static final BufferedImage CHAOS = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/chaos.png");
    private static final BufferedImage CLERIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cleric.png");
    private static final BufferedImage COLLECTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/collector.png");
    private static final BufferedImage COLONEL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/colonel.png");
    private static final BufferedImage COMMANDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/commander.png");
    private static final BufferedImage COMPETITOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/competitor.png");
    private static final BufferedImage COMPLETIONIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/completionist.png");
    private static final BufferedImage CONSTRUCTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/constructor.png");
    private static final BufferedImage COOK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cook.png");
    private static final BufferedImage COORDINATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/coordinator.png");
    private static final BufferedImage CORPORAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/corporal.png");
    private static final BufferedImage COSMIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cosmic.png");
    private static final BufferedImage COUNCILLOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/councillor.png");
    private static final BufferedImage CRAFTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crafter.png");
    private static final BufferedImage CREW = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crew.png");
    private static final BufferedImage CRUSADER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/crusader.png");
    private static final BufferedImage CUTPURSE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/cutpurse.png");
    private static final BufferedImage DEATH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/death.png");
    private static final BufferedImage DEFENDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/defender.png");
    private static final BufferedImage DEFILER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/defiler.png");
    private static final BufferedImage DEPUTY_OWNER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/deputy_owner.png");
    private static final BufferedImage DESTROYER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/destroyer.png");
    private static final BufferedImage DIAMOND = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/diamond.png");
    private static final BufferedImage DISEASED = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/diseased.png");
    private static final BufferedImage DOCTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/doctor.png");
    private static final BufferedImage DOGSBODY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dogsbody.png");
    private static final BufferedImage DRAGON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dragon.png");
    private static final BufferedImage DRAGONSTONE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/dragonstone.png");
    private static final BufferedImage DRUID = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/druid.png");
    private static final BufferedImage DUELLIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/duellist.png");
    private static final BufferedImage EARTH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/earth.png");
    private static final BufferedImage ELITE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/elite.png");
    private static final BufferedImage EMERALD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/emerald.png");
    private static final BufferedImage ENFORCER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/enforcer.png");
    private static final BufferedImage EPIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/epic.png");
    private static final BufferedImage EXECUTIVE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/executive.png");
    private static final BufferedImage EXPERT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/expert.png");
    private static final BufferedImage EXPLORER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/explorer.png");
    private static final BufferedImage FARMER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/farmer.png");
    private static final BufferedImage FEEDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/feeder.png");
    private static final BufferedImage FIGHTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fighter.png");
    private static final BufferedImage FIRE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fire.png");
    private static final BufferedImage FIREMAKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/firemaker.png");
    private static final BufferedImage FIRESTARTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/firestarter.png");
    private static final BufferedImage FISHER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fisher.png");
    private static final BufferedImage FLETCHER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fletcher.png");
    private static final BufferedImage FORAGER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/forager.png");
    private static final BufferedImage FREMENNIK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/fremennik.png");
    private static final BufferedImage GAMER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gamer.png");
    private static final BufferedImage GATHERER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gatherer.png");
    private static final BufferedImage GENERAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/general.png");
    private static final BufferedImage GNOME_CHILD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gnome_child.png");
    private static final BufferedImage GNOME_ELDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gnome_elder.png");
    private static final BufferedImage GOBLIN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/goblin.png");
    private static final BufferedImage GOLD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/gold.png");
    private static final BufferedImage GOON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/goon.png");
    private static final BufferedImage GREEN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/green.png");
    private static final BufferedImage GREY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/grey.png");
    private static final BufferedImage GUARDIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guardian.png");
    private static final BufferedImage GUEST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guest.png");
    private static final BufferedImage GUTHIXIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/guthixian.png");
    private static final BufferedImage HARPOON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/harpoon.png");
    private static final BufferedImage HEALER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/healer.png");
    private static final BufferedImage HELLCAT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hellcat.png");
    private static final BufferedImage HELPER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/helper.png");
    private static final BufferedImage HERBOLOGIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/herbologist.png");
    private static final BufferedImage HERO = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hero.png");
    private static final BufferedImage HOARDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hoarder.png");
    private static final BufferedImage HOLY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/holy.png");
    private static final BufferedImage HUNTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/hunter.png");
    private static final BufferedImage IGNITOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ignitor.png");
    private static final BufferedImage ILLUSIONIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/illusionist.png");
    private static final BufferedImage IMP = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/imp.png");
    private static final BufferedImage INFANTRY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/infantry.png");
    private static final BufferedImage INQUISITOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/inquisitor.png");
    private static final BufferedImage IRON = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/iron.png");
    private static final BufferedImage JADE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/jade.png");
    private static final BufferedImage JAGEX_MODERATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/jagex_moderator.png");
    private static final BufferedImage JUSTICIAR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/justiciar.png");
    private static final BufferedImage KANDARIN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kandarin.png");
    private static final BufferedImage KARAMJAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/karamjan.png");
    private static final BufferedImage KHARIDIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kharidian.png");
    private static final BufferedImage KITTEN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/kitten.png");
    private static final BufferedImage KNIGHT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/knight.png");
    private static final BufferedImage LABOURER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/labourer.png");
    private static final BufferedImage LAW = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/law.png");
    private static final BufferedImage LEADER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/leader.png");
    private static final BufferedImage LEARNER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/learner.png");
    private static final BufferedImage LEGACY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legacy.png");
    private static final BufferedImage LEGEND = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legend.png");
    private static final BufferedImage LEGIONNAIRE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/legionnaire.png");
    private static final BufferedImage LIEUTENANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/lieutenant.png");
    private static final BufferedImage LOOTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/looter.png");
    private static final BufferedImage LUMBERJACK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/lumberjack.png");
    private static final BufferedImage MAGIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/magic.png");
    private static final BufferedImage MAGICIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/magician.png");
    private static final BufferedImage MAJOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/major.png");
    private static final BufferedImage MAPLE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/maple.png");
    private static final BufferedImage MARSHAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/marshal.png");
    private static final BufferedImage MASTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/master.png");
    private static final BufferedImage MAXED = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/maxed.png");
    private static final BufferedImage MEDIATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mediator.png");
    private static final BufferedImage MEDIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/medic.png");
    private static final BufferedImage MENTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mentor.png");
    private static final BufferedImage MERCHANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/merchant.png");
    private static final BufferedImage MIND = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mind.png");
    private static final BufferedImage MINER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/miner.png");
    private static final BufferedImage MINION = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/minion.png");
    private static final BufferedImage MISTHALINIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/misthalinian.png");
    private static final BufferedImage MITHRIL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mithril.png");
    private static final BufferedImage MODERATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/moderator.png");
    private static final BufferedImage MONARCH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/monarch.png");
    private static final BufferedImage MORYTANIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/morytanian.png");
    private static final BufferedImage MYSTIC = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/mystic.png");
    private static final BufferedImage MYTH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/myth.png");
    private static final BufferedImage NATURAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/natural.png");
    private static final BufferedImage NATURE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/nature.png");
    private static final BufferedImage NECROMANCER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/necromancer.png");
    private static final BufferedImage NINJA = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ninja.png");
    private static final BufferedImage NOBLE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/noble.png");
    private static final BufferedImage NOVICE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/novice.png");
    private static final BufferedImage NURSE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/nurse.png");
    private static final BufferedImage OAK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/oak.png");
    private static final BufferedImage OFFICER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/officer.png");
    private static final BufferedImage ONYX = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/onyx.png");
    private static final BufferedImage OPAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/opal.png");
    private static final BufferedImage ORACLE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/oracle.png");
    private static final BufferedImage ORANGE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/orange.png");
    private static final BufferedImage OWNER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/owner.png");
    private static final BufferedImage PAGE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/page.png");
    private static final BufferedImage PALADIN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/paladin.png");
    private static final BufferedImage PAWN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pawn.png");
    private static final BufferedImage PILGRIM = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pilgrim.png");
    private static final BufferedImage PINE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pine.png");
    private static final BufferedImage PINK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pink.png");
    private static final BufferedImage PREFECT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prefect.png");
    private static final BufferedImage PRIEST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/priest.png");
    private static final BufferedImage PRIVATE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/private.png");
    private static final BufferedImage PRODIGY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prodigy.png");
    private static final BufferedImage PROSELYTE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/proselyte.png");
    private static final BufferedImage PROSPECTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/prospector.png");
    private static final BufferedImage PROTECTOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/protector.png");
    private static final BufferedImage PURE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pure.png");
    private static final BufferedImage PURPLE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/purple.png");
    private static final BufferedImage PYROMANCER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/pyromancer.png");
    private static final BufferedImage QUESTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/quester.png");
    private static final BufferedImage RACER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/racer.png");
    private static final BufferedImage RAIDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/raider.png");
    private static final BufferedImage RANGER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ranger.png");
    private static final BufferedImage RECORD_CHASER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/record_chaser.png");
    private static final BufferedImage RECRUIT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/recruit.png");
    private static final BufferedImage RECRUITER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/recruiter.png");
    private static final BufferedImage RED = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/red.png");
    private static final BufferedImage RED_TOPAZ = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/red_topaz.png");
    private static final BufferedImage ROGUE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/rogue.png");
    private static final BufferedImage RUBY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/ruby.png");
    private static final BufferedImage RUNE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/rune.png");
    private static final BufferedImage RUNECRAFTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/runecrafter.png");
    private static final BufferedImage SAGE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sage.png");
    private static final BufferedImage SAPPHIRE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sapphire.png");
    private static final BufferedImage SARADOMINIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/saradominist.png");
    private static final BufferedImage SAVIOUR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/saviour.png");
    private static final BufferedImage SCAVENGER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scavenger.png");
    private static final BufferedImage SCHOLAR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scholar.png");
    private static final BufferedImage SCOURGE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scourge.png");
    private static final BufferedImage SCOUT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scout.png");
    private static final BufferedImage SCRIBE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/scribe.png");
    private static final BufferedImage SEER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/seer.png");
    private static final BufferedImage SENATOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/senator.png");
    private static final BufferedImage SENTRY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sentry.png");
    private static final BufferedImage SERENIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/serenist.png");
    private static final BufferedImage SERGEANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sergeant.png");
    private static final BufferedImage SHAMAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/shaman.png");
    private static final BufferedImage SHERIFF = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sheriff.png");
    private static final BufferedImage SHORT_GREEN_GUY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/short_green_guy.png");
    private static final BufferedImage SKILLER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/skiller.png");
    private static final BufferedImage SKULLED = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/skulled.png");
    private static final BufferedImage SLAYER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/slayer.png");
    private static final BufferedImage SMITER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smiter.png");
    private static final BufferedImage SMITH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smith.png");
    private static final BufferedImage SMUGGLER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/smuggler.png");
    private static final BufferedImage SNIPER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/sniper.png");
    private static final BufferedImage SOUL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/soul.png");
    private static final BufferedImage SPECIALIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/specialist.png");
    private static final BufferedImage SPEED_RUNNER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/speed_runner.png");
    private static final BufferedImage SPELLCASTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/spellcaster.png");
    private static final BufferedImage SQUIRE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/squire.png");
    private static final BufferedImage STAFF = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/staff.png");
    private static final BufferedImage STEEL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/steel.png");
    private static final BufferedImage STRIDER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/strider.png");
    private static final BufferedImage STRIKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/striker.png");
    private static final BufferedImage SUMMONER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/summoner.png");
    private static final BufferedImage SUPERIOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/superior.png");
    private static final BufferedImage SUPERVISOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/supervisor.png");
    private static final BufferedImage TEACHER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/teacher.png");
    private static final BufferedImage TEMPLAR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/templar.png");
    private static final BufferedImage THERAPIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/therapist.png");
    private static final BufferedImage THIEF = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/thief.png");
    private static final BufferedImage TIRANNIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tirannian.png");
    private static final BufferedImage TRIALIST = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/trialist.png");
    private static final BufferedImage TRICKSTER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/trickster.png");
    private static final BufferedImage TZKAL = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tzkal.png");
    private static final BufferedImage TZTOK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/tztok.png");
    private static final BufferedImage UNHOLY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/unholy.png");
    private static final BufferedImage VAGRANT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/vagrant.png");
    private static final BufferedImage VANGUARD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/vanguard.png");
    private static final BufferedImage WALKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/walker.png");
    private static final BufferedImage WANDERER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wanderer.png");
    private static final BufferedImage WARDEN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warden.png");
    private static final BufferedImage WARLOCK = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warlock.png");
    private static final BufferedImage WARRIOR = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/warrior.png");
    private static final BufferedImage WATER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/water.png");
    private static final BufferedImage WILD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wild.png");
    private static final BufferedImage WILLOW = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/willow.png");
    private static final BufferedImage WILY = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wily.png");
    private static final BufferedImage WINTUMBER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wintumber.png");
    private static final BufferedImage WITCH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/witch.png");
    private static final BufferedImage WIZARD = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wizard.png");
    private static final BufferedImage WORKER = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/worker.png");
    private static final BufferedImage WRATH = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/wrath.png");
    private static final BufferedImage XERICIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/xerician.png");
    private static final BufferedImage YELLOW = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/yellow.png");
    private static final BufferedImage YEW = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/yew.png");
    private static final BufferedImage ZAMORAKIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zamorakian.png");
    private static final BufferedImage ZAROSIAN = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zarosian.png");
    private static final BufferedImage ZEALOT = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zealot.png");
    private static final BufferedImage ZENYTE = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/title/zenyte.png");


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
