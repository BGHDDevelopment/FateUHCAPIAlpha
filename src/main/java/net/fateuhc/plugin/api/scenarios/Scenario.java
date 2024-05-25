/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.scenarios;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.utilties.general.Utilities;
import net.fateuhc.plugin.utilties.uhc.items.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

@Getter
public enum Scenario {

    RANDOM(true, Utilities.getMaterial("COMMAND").parseMaterial(), "Random Scenarios", true, "Enabling this will cause random", "scenarios to be enabled!", "Disable all scenarios with /scenarios off"),
    TIMBER(true, Utilities.getMaterial("LOG_2").parseMaterial(), "Timber", "When you break one log", "the whole tree will drop down."),
    CUT_CLEAN(true, Utilities.getMaterial("IRON_INGOT").parseMaterial(), "CutClean", "All ores and drops are pre smelted"),
    NO_CLEAN(true, Utilities.getMaterial("DIAMOND_SWORD").parseMaterial(), "NoClean", "When you kill someone", "you will become undamaged for", "20 seconds."),
    TIME_BOMB(true, Utilities.getMaterial("TNT").parseMaterial(), "Timebomb", "When you kill someone", "their loot will be put in a chest", "which will explode after 30 seconds."),
    CHEST(true, Utilities.getMaterial("CHEST").parseMaterial(), "Chest", "When you kill someone", "their loot will be put in a chest", "it will not explode."),
    SAFE_LOOT(true, Utilities.getMaterial("APPLE").parseMaterial(), "Safe Loot", "When you kill someone, if TimeBomb is active,", "only the killer will have", "access to spawned chest."),
    TRIPLE_ORES(true, Utilities.getMaterial("REDSTONE_ORE").parseMaterial(), "Triple Ores", "When you mine ores you receive", "3x more of the ore."),
    DOUBLE_ORES(true, Utilities.getMaterial("REDSTONE_ORE").parseMaterial(), "Double Ores", "When you mine ores you receive", "2x more of the ore."),
    BLOOD_DIAMONDS(true, Utilities.getMaterial("DIAMOND").parseMaterial(), "Blood Diamonds", "When you mine diamond", "you will lose half a heart."),
    BLOOD_GOLD(true, Utilities.getMaterial("GOLD_INGOT").parseMaterial(), "Blood Gold", "When you mine gold", "you will lose half a heart."),
    DIAMOND_LESS(true, Utilities.getMaterial("DIAMOND_ORE").parseMaterial(), "Diamondless", "You won't be able to mine diamond", "ore but you will receive one diamond", "when you kill a player."),
    GOLD_LESS(true, Utilities.getMaterial("GOLD_ORE").parseMaterial(), "Goldless", "You won't be able to mine gold ore", "but you will receive one gold", "when you kill a player."),
    NO_FALL_DAMAGE(true, Utilities.getMaterial("FEATHER").parseMaterial(), "No Fall", "You won't take fall damage."),
    FIRE_LESS(true, Utilities.getMaterial("FLINT_AND_STEEL").parseMaterial(), "Fireless", "You won't take fire damage at all."),
    LUCKY_LEAVES(true, Utilities.getMaterial("LEAVES").parseMaterial(), "Lucky Leaves", "There is 0.5% that golden apple will", "drop from a tree."),
    ROD_LESS(true, Utilities.getMaterial("FISHING_ROD").parseMaterial(), "Rodless", "You won't be able to use fishing rods."),
    BOW_LESS(true, Utilities.getMaterial("BOW").parseMaterial(), "Bowless", "You won't be able to use bows."),
    BACK_PACKS(true, Utilities.getMaterial("CHEST").parseMaterial(), "Team Inventory", "Open your party inventory by typing", "/teaminventory."),
    TRIPLE_EXP(true, Utilities.getMaterial("EXP_BOTTLE").parseMaterial(), "TripleExp", "Mining ores will gain you 3x more exp."),
    DOUBLE_EXP(true, Utilities.getMaterial("EXP_BOTTLE").parseMaterial(), "DoubleExp", "Mining ores will gain you 2x more exp."),
    LIMITED_ENCHANTS(true, Utilities.getMaterial("ENCHANTED_BOOK").parseMaterial(), "Limited Enchants", "You cannot craft enchantment tables", "There are unbreakable enchantment", "tables at 0,0 and in each quadrants."),
    IRON_LESS(true, Utilities.getMaterial("IRON_ORE").parseMaterial(), "Ironless", "You cannot mine iron", "You cannot blast mine iron", "Everytime you kill someone they", "drop 8 iron ingots."),
    BROADCASTER(true, Utilities.getMaterial("REDSTONE").parseMaterial(), "Broadcaster", "When you mine gold or diamonds", "there is 15% of chance that", "your location will be broadcasted to the server."),
    BLOOD_ENCHANTS(true, Utilities.getMaterial("ENCHANTMENT_TABLE").parseMaterial(), "Blood Enchants", "You lose half a heart for every", "level you enchant."),
    WEB_CAGE(true, Utilities.getMaterial("WEB").parseMaterial(), "Webcage", "When you kill a player a sphere of", "cobwebs surrounds you."),
    WEB_LIMIT(true, Utilities.getMaterial("WEB").parseMaterial(), "Web Limit", "Players will be limited to having", "8 cobwebs in their inventory at one time."),
    INFINITE_ENCHANT(true, Utilities.getMaterial("ENCHANTMENT_TABLE").parseMaterial(), "Infinite Enchant", "You can infinitely enchant, no limitations", "You will receive:", " * x64 Enchantment tables", " * x64 Anvil", " * x128 Bookshelf", "and gain 30000 exp levels."),
    SWORD_LESS(true, Utilities.getMaterial("WOOD_SWORD").parseMaterial(), "Swordless", "You can't craft swords."),
    TREE_DROPS(true, Utilities.getMaterial("GOLD_INGOT").parseMaterial(), "TreeDrops", "Gold has a 0.5% chance of dropping", "from a leaves", "Diamonds have a 0.1%", "Feathers have a chance of 10% dropping."),
    NO_ENCHANT(true, Utilities.getMaterial("ENCHANTMENT_TABLE").parseMaterial(), "NoEnchant", "You can't use enchanting tables or anvils."),
    LIMITATIONS(true, Utilities.getMaterial("DIAMOND").parseMaterial(), "Limitations", "- Max of " + 16 + " diamonds can be mined.", "- Max of " + 32 + " gold can be mined.", "- Max of " + 64 + " iron can be mined."),
    EXTRA_INVENTORY(true, Utilities.getMaterial("ENDER_CHEST").parseMaterial(), "Backbacks", "Allows players to use /backpack"),
    TRIPLE_DROPS(true, Utilities.getMaterial("COOKED_BEEF").parseMaterial(), "Triple Drops", "When you kill animals/mobs you", "receive triple drops."),
    DOUBLE_DROPS(true, Utilities.getMaterial("COOKED_BEEF").parseMaterial(), "Double Drops", "When you kill animals/mobs you", "receive double drops."),
    DOUBLE_HEALTH(true, Utilities.getMaterial("GOLDEN_APPLE").parseMaterial(), "Double Health", "You will be able to regenerate", "up to 20 hearts."),
    BETTER_ENCHANT(true, Utilities.getMaterial("ENCHANTED_BOOK").parseMaterial(), "Better Enchant", "When you left-click enchant with a book", "the enchant will be removed from the book."),
    DOUBLE_OR_NOTHING(true, Utilities.getMaterial("EMERALD").parseMaterial(), "Double or Nothing", " On mine of iron, diamond, or gold ore ", "you have a 50% chance of 2 of the ", "ore dropping or no ores dropping."),
    BARE_BONES(true, Utilities.getMaterial("BONE").parseMaterial(), "Barebones", "Enchantment tables/Anvils can't be crafted or used,", "Golden apples can't be crafted either.", "The Nether is disabled.", "Players drop 1 Diamond, 2 Golden apples.", "32 Arrows and 2 String on death."),
    LONG_SHOTS(true, Utilities.getMaterial("ARROW").parseMaterial(), "Long Shots", "If you get a shot from more than 50 blocks, ", "you get healed for 1 heart, and do 1.5x the damage."),
    GOLDEN_RETRIEVER(true, Utilities.getMaterial("GOLDEN_APPLE").parseMaterial(), "Golden Retriever", "Players drop 1 golden head on death."),
    GONE_FISHING(true, Utilities.getMaterial("RAW_FISH").parseMaterial(), "Gone Fishing", "You will get unbreaking 200 and ", "luck of the sea 200 fishing rod along with 64 anvils.", "Players will not be able to craft enchantment tables."),
    HORSE_LESS(true, Utilities.getMaterial("DIAMOND_BARDING").parseMaterial(), "Horseless", "You can't tame horses", "You can't tame donkeys."),
    SOUP(true, Utilities.getMaterial("MUSHROOM_SOUP").parseMaterial(), "Soup", "When you right click a soup you regain 3.5 hearts."),
    SWITCHEROO(true, Utilities.getMaterial("ENDER_PEARL").parseMaterial(), "Switcheroo", "Everytime you shoot a player, you switch positions", "with them."),
    HASTEY_BOYS(true, Utilities.getMaterial("IRON_PICKAXE").parseMaterial(), "Hastey Boys", "When you craft mining tools they", "will be enchanted with efficiency III."),
    OP_HASTEY_BOYS(true, Utilities.getMaterial("DIAMOND_PICKAXE").parseMaterial(), "Hastey Babies", "When you craft mining tools they", "will be enchanted with efficiency V."),
    HASTEY_BOYS_LITE(true, Utilities.getMaterial("GOLD_PICKAXE").parseMaterial(), "Hastey Boys Lite", "When you craft mining tools they", "will be enchanted with efficiency I."),
    BUILD_UHC(true, Utilities.getMaterial("LAVA_BUCKET").parseMaterial(), "Build UHC", "All the players will get a kit."),
    HYPIXEL_HEADS(true, Utilities.getMaterial("SKULL_ITEM").parseMaterial(), "Hypixel Heads", "When you right click a head you will ", "get Regeneration III for 4 seconds ", "and Speed II for 20 seconds."),
    SKY_HIGH(true, Utilities.getMaterial("WATER_BUCKET").parseMaterial(), "Skyhigh", "If your y coordinates are bellow set Sky High Limit", "you will take 1 heart down every 30 seconds."),
    FLOWER_POWER(true, Utilities.getMaterial("RED_ROSE").parseMaterial(), "Flower Power", "Every time you break a flower", "it will drop", "a random item in the game."),
    MOLES(true, Utilities.getMaterial("PUMPKIN").parseMaterial(), "Moles", true, "One person on each team is chosen to be the Mole", "The Moles are one team and can communicate with each", "other, trying to take out the other players", "The normal players try to find out who the mole is on their", "team and kill them.", " ", "This scenario requires teams!"),
    TRACKER(true, Utilities.getMaterial("COMPASS").parseMaterial(), "Tracker", "At the start of the game you", "will receive compass and you", "will be able to track players."),
    ANONYMOUS(true, Utilities.getMaterial("COMMAND").parseMaterial(), "Anonymous", true, "All players usernames", "will be hidden", "so no one knows who they are."),
    SUPERHEROS(true, Utilities.getMaterial("FEATHER").parseMaterial(), "Superheroes", true, "Each player will gain", "a random special ability", "includes speed, strength, resistance,", "jump boost, extra hearts", "Fall damage is disabled."),
    DND(true, Utilities.getMaterial("TNT").parseMaterial(), "Do Not Disturb (DND)", "Each time a player enters", "a fight they will be", "restricted to just fighting that player", "once they leave combat", "they may fight others."),
    LAFS(true, Utilities.getMaterial("YELLOW_FLOWER").parseMaterial(), "Love at First Sight (LAFS)", true, "Teams will be created based", "on the players clicking each other in the game", "to team a player needs to right click", "on someone while playing", "max team sizes apply."),
    VEINMINER(true, Utilities.getMaterial("DIAMOND_PICKAXE").parseMaterial(), "Vein Miner", "When players mine blocks", "any of the same type will break", "in a chain reaction if they are crouched."),
    WOODLIFE(true, Utilities.getMaterial("WOOD").parseMaterial(), "Wood Life", "When players mine coal ore", "it will not give them anything."),
    CORONAVIRUS(true, Utilities.getMaterial("POTION").parseMaterial(), "Coronavirus", "Every 5 minutes", "a random player receives the", "nausea and poison effect for between 5-60 seconds."),
    LIMITEDP4(true, Utilities.getMaterial("ANVIL").parseMaterial(), "Limited P4", "Players will only be able", "to enchant one item", "with protection 4."),
    NINESLOT(true, Utilities.getMaterial("WOOD_BUTTON").parseMaterial(), "Nine Slots", "Only nine slots of the players", "inventories are usable."),
    CRIPLE(true, Utilities.getMaterial("FEATHER").parseMaterial(), "Cripple", "If a player takes fall damage", "they receive slowness for 30 seconds"),
    EVERYROSE(true, Utilities.getMaterial("GOLD_CHESTPLATE").parseMaterial(), "Every Rose", true, "Each player will receive", "a golden chestplate with thorns 3", "at the start of the game."),
    LIGHTSOUT(true, Utilities.getMaterial("TORCH").parseMaterial(), "Lights Out", "Players can not place", "torches during the game."),
    PYRO(true, Utilities.getMaterial("BLAZE_POWDER").parseMaterial(), "Pyro", true, "Players will start the game", "with a flame 1 and", "fire aspect 1 book."),
    EXPOSURE(true, Utilities.getMaterial("ENCHANTMENT_TABLE").parseMaterial(), "Exposure", "When a player crafts an", "enchantment table they will be", "teleported to the surface and given", "mining fatigue for 1 minute."),
    ZOMBIES(true, Utilities.getMaterial("ROTTEN_FLESH").parseMaterial(), "Zombies", "When a player dies a", "zombie will be spawned on", "their death location."),
    BETAZOMBIES(true, Utilities.getMaterial("FEATHER").parseMaterial(), "Beta Zombies", "Zombies when killed", "will drop feathers."),
    BOOKCEPTION(true, Utilities.getMaterial("ENCHANTED_BOOK").parseMaterial(), "Bookception", "When a player dies a", "random enchant book", "will spawn at their death location."),
    BALDCHICKEN(true, Utilities.getMaterial("ARROW").parseMaterial(), "Bald Chicken", "Chicken's drop no feathers", "and skeletons drop", "3-5 arrows."),
    BIRDS(true, Utilities.getMaterial("FIREWORK").parseMaterial(), "Birds", true, "All players can fly!."),
    PUPPYPOWER(true, Utilities.getMaterial("BONE").parseMaterial(), "Puppy Power", true, "All players will get", "64 bones, 64 rotten flesh, and 64 wolf spawn eggs."),
    BLEEDINGSWEETS(true, Utilities.getMaterial("DIAMOND").parseMaterial(), "Bleeding Sweets", "When a player dies they", "drop 1 diamond, 5 gold,", "16 arrows and 1 string."),
    NODIAMONDARMOR(true, Utilities.getMaterial("DIAMOND_CHESTPLATE").parseMaterial(), "No Diamond Armor", "Player's can not craft", "diamond armor."),
    CARROTCOMBO(true, Utilities.getMaterial("GOLDEN_CARROT").parseMaterial(), "Carrot Combo", "When player's craft swords", "they will receive a carrot with an enchantment", "Wood Sword = Sharpness 2 Carrot.", "Gold Sword = Sharpness 2 Carrot", "Stone Sword = Sharpness 3 Carrot", "Iron Sword = Sharpness 5 Carrot", "Diamond Sword = Sharpness 6 Carrot"),
    BOMBERS(true, Utilities.getMaterial("FLINT_AND_STEEL").parseMaterial(), "Bombers", true, "Everyone starts with unbreakable flint and steel", "and most animals and monsters drop TNT."),
    CATSEYES(true, Utilities.getMaterial("SPIDER_EYE").parseMaterial(), "Cats Eyes", true, "Everyone starts with night vision."),
    LUCKYROULETTE(true, Utilities.getMaterial("GOLD_NUGGET").parseMaterial(), "Lucky Roulette", true, "Every 2 minutes", "players are given a random item."),
    RANDOMIZER(true, Utilities.getMaterial("COMMAND").parseMaterial(), "Randomizer", "Each block will drop a random item", "or material based upon the config settings."),
    BATS(true, Utilities.getMaterial("COAL_BLOCK").parseMaterial(), "Bats", "When a player kills a bat", "there's a 95% chance of dropping a Golden Apple", "and a 5% chance of killing the player."),
    REDVSBLUE(true, Utilities.getMaterial("WOOL").parseMaterial(), "Red vs Blue", true, "Two teams (red, blue)", "will be randomly selected on game start."),
    BENCHBLITZ(true, Utilities.getMaterial("WORKBENCH").parseMaterial(), "Bench Blitz", true, "At the start of the game", "players will get 1 crafting table", "they will not be able to create more."),
    DISABLESHIELDS(true, Utilities.getMaterial("SHIELD").parseMaterial(), "Disable Shields", false, "&c(1.9+ Only)", "Players will not be able", "to use shields.", "Shields will be removed from inventories on use."),
    DISABLEOFFHAND(true, Utilities.getMaterial("TIPPED_ARROW").parseMaterial(), "Disable Offhand", false, "&c(1.9+ Only)", "Players will not be able", "to use their offhand."),
    GRASS_EXPLOSION(true, Utilities.getMaterial("GRASS").parseMaterial(), "Grass Explosion", false, "When players walk on grass", "it will have a 25% chance to explode.", "NOTE: Will start immediately upon scatter."),
    RAINING_TNT(true, Utilities.getMaterial("TNT").parseMaterial(), "Raining TNT", true, "Every minute TNT will", "rain down on 2 unlucky players.", "Starts two minutes into the game."),
    MEETUP(true, Utilities.getMaterial("BEACON").parseMaterial(), "Meetup", true, "At a set time (/config admin)", "players will no longer be able to mine", "ores and will be forced to the surface (if under Y 35)."),
    NOODLEJUMP(true, Utilities.getMaterial("POTION").parseMaterial(), "Noodle Jump", true, "At the start of the game", "players will receive permanent", "jump boost.");

    @Setter
    public boolean backendEnabled;
    @Setter
    public String name;
    @Setter
    public boolean active = false;
    @Setter
    public String[] description;
    @Setter
    public Material material;
    @Setter
    public boolean lobbyModeOnlyEdit = false;

    public static int LIMITATIONS_MAX_DIAMONDS = 16;
    public static int LIMITATIONS_MAX_GOLD = 32;
    public static int LIMITATIONS_MAX_IRON = 64;

    Scenario(boolean backendEnabled, Material material, String name, String... desc) {
        this.backendEnabled = backendEnabled;
        this.name = name;
        this.description = desc;
        this.material = material;
    }

    Scenario(boolean backendEnabled, Material material, String name, boolean lobbyModeOnlyEdit, String... desc) {
        this.backendEnabled = backendEnabled;
        this.name = name;
        this.description = desc;
        this.material = material;
        this.lobbyModeOnlyEdit = lobbyModeOnlyEdit;
    }

    public ItemStack toItemStack() {
        ItemBuilder item = new ItemBuilder(this.material);
        item.setName("&a" + this.name);
        if(this.backendEnabled) {
            if (this.isActive()) {
                item.setName("&a" + this.name + "&b (Active)");
            }
            if (this == Scenario.HYPIXEL_HEADS || this.material == Utilities.getMaterial("SKULL_ITEM").parseMaterial()) {

                item.setDurability(3);
            }
            item.addLoreLine("&7&m-----------------------------");
            item.addLoreLine("&eThis scenario is currently " + (this.isActive() ? "&aenabled" : "&cdisabled") + "&e.");
            item.addLoreLine("&7&m-----------------------------");
            Arrays.stream(this.description).forEach(description -> item.addLoreLine("&b" + description));
            if (this.description.length == 0) {
                item.addLoreLine("&bThis scenarios has no");
                item.addLoreLine("&bdescription.");
            }
        } else {
            item.addLoreLine("&7&m-----------------------------");
            item.addLoreLine("&cThis scenario is currently");
            item.addLoreLine("&cdeveloper disabled.");
        }
        item.addLoreLine("&7&m-----------------------------");
        return item.toItemStack();
    }
}
