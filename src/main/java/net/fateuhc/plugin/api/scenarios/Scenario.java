/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.scenarios;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.utilties.uhc.game.GlowEnchantment;
import net.fateuhc.plugin.utilties.uhc.items.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

/**
 * Provides all scenarios.
 */
@Getter
public enum Scenario {

    RANDOM(Material.COMMAND, "Random Scenarios", true,"Enabling this will cause random", "scenarios to be enabled!", "Disable all scenarios with /scenarios off"),
    TIMBER(Material.LOG_2, "Timber", "When you break one log", "the whole tree will drop down."),
    CUT_CLEAN(Material.IRON_INGOT, "Cut Clean", "All ores and drops are pre smelted"),
    NO_CLEAN(Material.DIAMOND_SWORD, "No Clean", "When you kill someone", "you will become undamaged for", "20 seconds."),
    TIME_BOMB(Material.TNT, "Time Bomb", "When you kill someone", "their loot will be put in a chest", "which will explode after 30 seconds."),
    CHEST(Material.CHEST, "Chest", "When you kill someone", "their loot will be put in a chest", "it will not explode."),
    SAFE_LOOT(Material.APPLE, "Safe Loot", "When you kill someone, if TimeBomb is active,", "only the killer will have", "access to spawned chest."),
    TRIPLE_ORES(Material.REDSTONE_ORE, "Triple Ores", "When you mine ores you receive", "3x more of the ore."),
    DOUBLE_ORES(Material.REDSTONE_ORE, "Double Ores", "When you mine ores you receive", "2x more of the ore."),
    BLOOD_DIAMONDS(Material.DIAMOND, "Blood Diamonds", "When you mine diamond", "you will lose half a heart."),
    BLOOD_GOLD(Material.GOLD_INGOT, "Blood Gold", "When you mine gold", "you will lose half a heart."),
    DIAMOND_LESS(Material.DIAMOND_ORE, "Diamondless", "You won't be able to mine diamond", "ore but you will receive one diamond", "when you kill a player."),
    GOLD_LESS(Material.GOLD_ORE, "Goldless", "You won't be able to mine gold ore", "but you will receive one gold", "when you kill a player."),
    NO_FALL_DAMAGE(Material.FEATHER, "NoFallDamage", "You won't take fall damage."),
    FIRE_LESS(Material.FLINT_AND_STEEL, "Fireless", "You won't take fire damage at all."),
    LUCKY_LEAVES(Material.LEAVES, "LuckyLeaves", "There is 0.5% that golden apple will", "drop from a tree."),
    ROD_LESS(Material.FISHING_ROD, "Rodless", "You won't be able to use fishing rods."),
    BOW_LESS(Material.BOW, "Bowless", "You won't be able to use bows."),
    BACK_PACKS(Material.CHEST, "BackPacks", "Open you party backpack by typing", "/backpack."),
    TRIPLE_EXP(Material.EXP_BOTTLE, "TripleExp", "Mining ores will gain you 3x more exp."),
    DOUBLE_EXP(Material.EXP_BOTTLE, "DoubleExp", "Mining ores will gain you 2x more exp."),
    LIMITED_ENCHANTS(Material.ENCHANTED_BOOK, "LimitedEnchants", "You cannot craft enchantment tables", "There are unbreakable enchantment", "tables at 0,0 and in each quadrants."),
    IRON_LESS(Material.IRON_ORE, "Ironless", "You cannot mine iron", "You cannot blast mine iron", "Everytime you kill someone they", "drop 8 iron ingots."),
    BROADCASTER(Material.REDSTONE, "Broadcaster", "When you mine gold or diamonds", "there is 15% of chance that", "your location will be broadcasted to the server."),
    BLOOD_ENCHANTS(Material.ENCHANTMENT_TABLE, "BloodEnchants", "You lose half a heart for every", "level you enchant."),
    WEB_CAGE(Material.WEB, "WebCage", "When you kill a player a sphere of", "cobwebs surrounds you."),
    INFINITE_ENCHANT(Material.ENCHANTMENT_TABLE, "InfiniteEnchant", "You can infinitely enchant, no limitations", "You will receive:", " * x64 Enchantment tables", " * x64 Anvil", " * x128 Bookshelf", "and gain 30000 exp levels."),
    SWORD_LESS(Material.WOOD_SWORD, "Swordless", "You can't craft swords."),
    TREE_DROPS(Material.GOLD_INGOT, "TreeDrops", "Gold has a 0.5% chance of dropping", "from a leaves", "Diamonds have a 0.1%", "Feathers have a chance of 10% dropping."),
    NO_ENCHANT(Material.ENCHANTMENT_TABLE, "NoEnchant", "You can't use enchanting tables or anvils."),
    LIMITATIONS(Material.DIAMOND, "Limitations", "- Max of " + 16 + " diamonds can be mined.", "- Max of " + 32 + " gold can be mined.", "- Max of " + 64 + " iron can be mined."),
    EXTRA_INVENTORY(Material.ENDER_CHEST, "ExtraInventory", "Allows players to use /extrainventory"),
    TRIPLE_DROPS(Material.COOKED_BEEF, "Triple Drops", "When you kill animals/mobs you", "receive triple drops."),
    DOUBLE_DROPS(Material.COOKED_BEEF, "Double Drops", "When you kill animals/mobs you", "receive double drops."),
    DOUBLE_HEALTH(Material.GOLDEN_APPLE, "Double Health", "You will be able to regenerate", "up to 20 hearts."),
    BETTER_ENCHANT(Material.ENCHANTED_BOOK, "Better Enchant", "When you left-click enchant with a book", "the enchant will be removed from the book."),
    DOUBLE_OR_NOTHING(Material.EMERALD, "Double or Nothing", " On mine of iron, diamond, or gold ore ", "you have a 50% chance of 2 of the ", "ore dropping or no ores dropping."),
    BARE_BONES(Material.BONE, "Bare Bones", "Enchantment tables/Anvils can't be crafted or used,", "Golden apples can't be crafted either.", "The Nether is disabled.", "Players drop 1 Diamond, 2 Golden apples.", "32 Arrows and 2 String on death."),
    LONG_SHOTS(Material.ARROW, "Long Shots", "If you get a shot from more than 50 blocks, ", "you get healed for 1 heart, and do 1.5x the damage."),
    GOLDEN_RETRIEVER(Material.GOLDEN_APPLE, "Golden Retriever", "Players drop 1 golden head on death."),
    GONE_FISHING(Material.RAW_FISH, "Gone Fishing", "You will get unbreaking 200 and ", "luck of the sea 200 fishing rod along with 64 anvils."),
    HORSE_LESS(Material.DIAMOND_BARDING, "Horseless", "You can't tame horses", "You can't tame donkeys."),
    SOUP(Material.MUSHROOM_SOUP, "Soup", "When you right click a soup you regain 3.5 hearts."),
    SWITCHEROO(Material.ENDER_PEARL, "Switcheroo", "Everytime you shoot a player, you switch positions", "with them."),
    HASTEY_BOYS(Material.IRON_PICKAXE, "Hastey Boys", "When you craft mining tools they", "will be enchanted with efficiency III."),
    OP_HASTEY_BOYS(Material.DIAMOND_PICKAXE, "OP Hastey Boys", "When you craft mining tools they", "will be enchanted with efficiency V."),
    HASTEY_BOYS_LITE(Material.GOLD_PICKAXE, "Hastey Boys Lite", "When you craft mining tools they", "will be enchanted with efficiency I."),
    BUILD_UHC(Material.LAVA_BUCKET, "Build UHC", "All the players will get a kit."),
    HYPIXEL_HEADS(Material.SKULL_ITEM, "Hypixel Heads", "When you right click a head you will ", "get Regeneration III for 4 seconds ", "and Speed II for 20 seconds."),
    SKY_HIGH(Material.WATER_BUCKET, "Sky High", "If your y coordinates are bellow set Sky High Limit", "you will take 1 heart down every 30 seconds."),
    FLOWER_POWER(Material.RED_ROSE, "Flower Power", "Every time you break a flower", "it will drop", "a random item in the game."),
    MOLES(Material.PUMPKIN, "Moles", true, "One person on each team is chosen to be the Mole", "The Moles are one team and can communicate with each", "other, trying to take out the other players", "The normal players try to find out who the mole is on their", "team and kill them.", " ", "This scenario requires teams!"),
    TRACKER(Material.COMPASS, "Tracker", "At the start of the game you", "will receive compass and you", "will be able to track players."),
    ANONYMOUS(Material.COMMAND, "Anonymous", true,"All players usernames", "will be hidden", "so no one knows who they are."),
    SUPERHEROS(Material.FEATHER, "Superheros", true,"Each player will gain", "a random special ability", "includes speed, strength, resistance,", "jump boost, extra hearts", "Fall damage is disabled."),
    DND(Material.TNT, "Do Not Disturb (DND)", "Each time a player enters", "a fight they will be", "restricted to just fighting that player", "once they leave combat", "they may fight others."),
    LAFS(Material.YELLOW_FLOWER, "Love at First Sight (LAFS)",true, "Teams will be created based", "on the players clicking each other in the game", "to team a player needs to right click", "on someone while playing", "max team sizes apply."),
    VEINMINER(Material.DIAMOND_PICKAXE, "Vein Miner", "When players mine blocks", "any of the same type will break", "in a chain reaction if they are crouched."),
    WOODLIFE(Material.WOOD, "Wood Life", "When players mine coal ore", "it will not give them anything."),
    CORONAVIRUS(Material.POTION, "Corona Virus", "Every 5 minutes one", "random player receives the", "confusion and poison effect."),
    LIMITEDP4(Material.ANVIL, "Limited P4", "Players will only be able", "to enchant one item", "with protection 4."),
    NINESLOT(Material.WOOD_BUTTON, "Nine Slot", "Only nine slots of the players", "inventories are usable."),
    CRIPLE(Material.FEATHER, "Cripple", "If a player takes fall damage", "they receive slowness for 30 seconds"),
    EVERYROSE(Material.GOLD_CHESTPLATE, "Every Rose", true,"Each player will receive", "a golden chestplate with thorns 3", "at the start of the game."),
    LIGHTSOUT(Material.TORCH, "Lights Out", "Players can not place", "torches during the game."),
    PYRO(Material.BLAZE_POWDER, "Pyro", true, "Players will start the game", "with a flame 1 and", "fire aspect 1 book."),
    EXPOSURE(Material.ENCHANTMENT_TABLE, "Exposure", "When a player crafts an", "enchantment table they will be", "teleported to the surface and given", "mining fatigue for 1 minute."),
    ZOMBIES(Material.ROTTEN_FLESH, "Zombies", "When a player dies a", "zombie will be spawned on", "their death location."),
    BETAZOMBIES(Material.FEATHER, "Beta Zombies", "Zombies when killed", "will drop feathers."),
    BOOKCEPTION(Material.ENCHANTED_BOOK, "Book Ception", "When a player dies a", "random enchant book", "will spawn at their death location."),
    BALDCHICKEN(Material.ARROW, "Bald Chicken", "Chicken's drop no feathers", "and skeletons drop", "3-5 arrows."),
    BIRDS(Material.FIREWORK, "Birds", true,"All players can fly!."),
    PUPPYPOWER(Material.BONE, "Puppy Power", true,"All players will get", "64 bones, 64 rotten flesh, and 64 wolf spawn eggs."),
    BLEEDINGSWEETS(Material.DIAMOND, "Bleeding Sweets", "When a player dies they", "drop 1 diamond, 5 gold,", "16 arrows and 1 string."),
    NODIAMONDARMOR(Material.DIAMOND_CHESTPLATE, "No Diamond Armor", "Player's can not craft", "diamond armor."),
    CARROTCOMBO(Material.GOLDEN_CARROT, "Carrot Combo", "When player's craft swords", "they will receive a carrot with an enchantment", "Wood Sword = Sharpness 2 Carrot.", "Gold Sword = Sharpness 2 Carrot", "Stone Sword = Sharpness 3 Carrot", "Iron Sword = Sharpness 5 Carrot", "Diamond Sword = Sharpness 6 Carrot"),
    BOMBERS(Material.FLINT_AND_STEEL, "Bombers", true,"Everyone starts with unbreakable flint and steel", "and most animals and monsters drop TNT."),
    CATSEYES(Material.SPIDER_EYE, "Cats Eyes", true,"Everyone starts with night vision."),
    LUCKYROULETTE(Material.GOLD_NUGGET, "Lucky Roulette", true,"Every 2 minutes", "players are given a random item."),
    RANDOMIZER(Material.COMMAND, "Randomizer", "Each block will drop a random item", "or material based upon the config settings."),
    BATS(Material.COAL_BLOCK, "Bats", "When a player kills a bat", "there's a 95% chance of dropping a Golden Apple", "and a 5% chance of killing the player."),
    REDVSBLUE(Material.WOOL, "Red VS Blue", true,"Two teams (red, blue)", "will be randomly selected on game start."),
    BENCHBLITZ(Material.WORKBENCH, "Bench Blitz", true,"At the start of the game", "players will get 1 crafting table", "they will not be able to create more."),
    NOODLEJUMP(Material.POTION, "Noodle Jump", true, "At the start of the game", "players will receive permanent", "jump boost.");

    /**
     * Scenario name
     */
    @Setter
    public String name;
    /**
     * True/False depending on scenario status.
     */
    @Setter
    public boolean active = false;
    /**
     * Scenario description.
     */
    @Setter
    public String[] description;
    /**
     * Scenario material in the GUI
     */
    @Setter
    public Material material;
    /**
     * True/False depending if scenario can be changed in lobby only.
     */
    @Setter
    public boolean lobbyModeOnlyEdit = false;

    public static int LIMITATIONS_MAX_DIAMONDS = 16;
    public static int LIMITATIONS_MAX_GOLD = 32;
    public static int LIMITATIONS_MAX_IRON = 64;

    /**
     * Used to get or set a scenario.
     *
     * @param material Material for the GUI
     * @param name Scenario name
     * @param desc Scenario description
     */
    Scenario(Material material, String name, String... desc) {
        this.name = name;
        this.description = desc;
        this.material = material;
    }

    /**
     * Used to get or set a scenario with lobby only mode.
     *
     * @param material Material for the GUI
     * @param name Scenario name
     * @param lobbyModeOnlyEdit True/False lobby only mode
     * @param desc Scenario description
     */
    Scenario(Material material, String name, boolean lobbyModeOnlyEdit, String... desc) {
        this.name = name;
        this.description = desc;
        this.material = material;
        this.lobbyModeOnlyEdit = lobbyModeOnlyEdit;
    }

    /**
     * @return ItemStack of config item.
     */
    public ItemStack toItemStack() {
        ItemBuilder item = new ItemBuilder(this.material);
        item.setName("&a" + this.name);
        if (this.active) {
            item.addEnchantment(new GlowEnchantment(), 0);
        }
        if (this == Scenario.HYPIXEL_HEADS || this.material == Material.SKULL_ITEM) {
            item.setDurability(3);
            item.setOwner("Noodles_YT");
        }
        item.addLoreLine("&7&m-----------------------------");
        item.addLoreLine("&eThis scenario is currently " + (this.active ? "&aenabled" : "&cdisabled") + "&e.");
        item.addLoreLine("&7&m-----------------------------");
        Arrays.stream(this.description).forEach(description -> item.addLoreLine("&b" + description));
        if (this.description.length == 0) {
            item.addLoreLine("&bThis scenarios has no");
            item.addLoreLine("&bdescription.");
        }
        item.addLoreLine("&7&m-----------------------------");
        return item.toItemStack();
    }
}
