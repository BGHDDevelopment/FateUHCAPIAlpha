/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.scenarios;

import com.cryptomorin.xseries.XMaterial;
import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.api.data.ScenarioData;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

@Getter
public enum Scenario {

    RANDOM(true, XMaterial.matchXMaterial("COMMAND").get().parseMaterial(), "RANDOM", "Random Scenarios", true, "Enabling this will cause random", "scenarios to be enabled!", "Disable all scenarios with /scenarios off"),
    TIMBER(true, XMaterial.matchXMaterial("LOG_2").get().parseMaterial(), "TIMBER", "Timber", "When you break one log", "the whole tree will drop down."),
    CUT_CLEAN(true, XMaterial.matchXMaterial("IRON_INGOT").get().parseMaterial(), "CUT_CLEAN", "CutClean", "All ores and drops are pre smelted"),
    NO_CLEAN(true, XMaterial.matchXMaterial("DIAMOND_SWORD").get().parseMaterial(), "NO_CLEAN", "NoClean", "When you kill someone", "you will become undamaged for", "20 seconds."),
    TIME_BOMB(true, XMaterial.matchXMaterial("TNT").get().parseMaterial(), "TIME_BOMB", "Timebomb", "When you kill someone", "their loot will be put in a chest", "which will explode after 30 seconds."),
    CHEST(true, XMaterial.matchXMaterial("CHEST").get().parseMaterial(), "CHEST", "Chest", "When you kill someone", "their loot will be put in a chest", "it will not explode."),
    SAFE_LOOT(true, XMaterial.matchXMaterial("APPLE").get().parseMaterial(), "SAFE_LOOT", "Safe Loot", "When you kill someone, if TimeBomb is active,", "only the killer will have", "access to spawned chest."),
    TRIPLE_ORES(true, XMaterial.matchXMaterial("REDSTONE_ORE").get().parseMaterial(), "TRIPLE_ORES", "Triple Ores", "When you mine ores you receive", "3x more of the ore."),
    DOUBLE_ORES(true, XMaterial.matchXMaterial("REDSTONE_ORE").get().parseMaterial(), "DOUBLE_ORES","Double Ores", "When you mine ores you receive", "2x more of the ore."),
    BLOOD_DIAMONDS(true, XMaterial.matchXMaterial("DIAMOND").get().parseMaterial(), "BLOOD_DIAMONDS", "Blood Diamonds", "When you mine diamond", "you will lose half a heart."),
    BLOOD_GOLD(true, XMaterial.matchXMaterial("GOLD_INGOT").get().parseMaterial(), "BLOOD_GOLD", "Blood Gold", "When you mine gold", "you will lose half a heart."),
    DIAMOND_LESS(true, XMaterial.matchXMaterial("DIAMOND_ORE").get().parseMaterial(), "DIAMOND_LESS", "Diamondless", "You won't be able to mine diamond", "ore but you will receive one diamond", "when you kill a player."),
    GOLD_LESS(true, XMaterial.matchXMaterial("GOLD_ORE").get().parseMaterial(), "GOLD_LESS", "Goldless", "You won't be able to mine gold ore", "but you will receive one gold", "when you kill a player."),
    NO_FALL_DAMAGE(true, XMaterial.matchXMaterial("FEATHER").get().parseMaterial(), "NO_FALL_DAMAGE", "No Fall", "You won't take fall damage."),
    FIRE_LESS(true, XMaterial.matchXMaterial("FLINT_AND_STEEL").get().parseMaterial(), "FIRE_LESS", "Fireless", "You won't take fire damage at all."),
    LUCKY_LEAVES(true, XMaterial.matchXMaterial("LEAVES").get().parseMaterial(), "LUCKY_LEAVES", "Lucky Leaves", "There is 0.5% that golden apple will", "drop from a tree."),
    ROD_LESS(true, XMaterial.matchXMaterial("FISHING_ROD").get().parseMaterial(), "ROD_LESS", "Rodless", "You won't be able to use fishing rods."),
    BOW_LESS(true, XMaterial.matchXMaterial("BOW").get().parseMaterial(), "BOW_LESS", "Bowless", "You won't be able to use bows."),
    BACK_PACKS(true, XMaterial.matchXMaterial("CHEST").get().parseMaterial(), "BACK_PACKS", "Team Inventory", "Open your team inventory by typing", "/teaminventory."),
    TRIPLE_EXP(true, XMaterial.matchXMaterial("EXP_BOTTLE").get().parseMaterial(), "TRIPLE_EXP", "TripleExp", "Mining ores will gain you 3x more exp."),
    DOUBLE_EXP(true, XMaterial.matchXMaterial("EXP_BOTTLE").get().parseMaterial(), "DOUBLE_EXP", "DoubleExp", "Mining ores will gain you 2x more exp."),
    LIMITED_ENCHANTS(true, XMaterial.matchXMaterial("ENCHANTED_BOOK").get().parseMaterial(), "LIMITED_ENCHANTS", "Limited Enchants", "You cannot craft enchantment tables", "There are unbreakable enchantment", "tables at 0,0 and in each quadrants."),
    IRON_LESS(true, XMaterial.matchXMaterial("IRON_ORE").get().parseMaterial(), "IRON_LESS", "Ironless", "You cannot mine iron", "You cannot blast mine iron", "Everytime you kill someone they", "drop 8 iron ingots."),
    BROADCASTER(true, XMaterial.matchXMaterial("REDSTONE").get().parseMaterial(), "BROADCASTER", "Broadcaster", "When you mine gold or diamonds", "there is 15% of chance that", "your location will be broadcasted to the server."),
    BLOOD_ENCHANTS(true, XMaterial.matchXMaterial("ENCHANTMENT_TABLE").get().parseMaterial(), "BLOOD_ENCHANTS", "Blood Enchants", "You lose half a heart for every", "level you enchant."),
    WEB_CAGE(true, XMaterial.matchXMaterial("WEB").get().parseMaterial(), "WEB_CAGE", "Webcage", "When you kill a player a sphere of", "cobwebs surrounds you."),
    WEB_LIMIT(true, XMaterial.matchXMaterial("WEB").get().parseMaterial(), "WEB_LIMIT", "Web Limit", "Players will be limited to having", "8 cobwebs in their inventory at one time."),
    INFINITE_ENCHANT(true, XMaterial.matchXMaterial("ENCHANTMENT_TABLE").get().parseMaterial(), "INFINITE_ENCHANT", "Infinite Enchant", "You can infinitely enchant, no limitations", "You will receive:", " * x64 Enchantment tables", " * x64 Anvil", " * x128 Bookshelf", "and gain 30000 exp levels."),
    SWORD_LESS(true, XMaterial.matchXMaterial("WOOD_SWORD").get().parseMaterial(), "SWORD_LESS", "Swordless", "You can't craft swords."),
    TREE_DROPS(true, XMaterial.matchXMaterial("GOLD_INGOT").get().parseMaterial(), "TREE_DROPS", "TreeDrops", "Gold has a 0.5% chance of dropping", "from a leaves", "Diamonds have a 0.1%", "Feathers have a chance of 10% dropping."),
    NO_ENCHANT(true, XMaterial.matchXMaterial("ENCHANTMENT_TABLE").get().parseMaterial(), "NO_ENCHANT", "NoEnchant", "You can't use enchanting tables or anvils."),
    LIMITATIONS(true, XMaterial.matchXMaterial("DIAMOND").get().parseMaterial(), "LIMITATIONS", "Limitations", "- Max of " + 16 + " diamonds can be mined.", "- Max of " + 32 + " gold can be mined.", "- Max of " + 64 + " iron can be mined."),
    EXTRA_INVENTORY(true, XMaterial.matchXMaterial("ENDER_CHEST").get().parseMaterial(), "EXTRA_INVENTORY", "Backbacks", "Allows players to use /backpack"),
    TRIPLE_DROPS(true, XMaterial.matchXMaterial("COOKED_BEEF").get().parseMaterial(), "TRIPLE_DROPS", "Triple Drops", "When you kill animals/mobs you", "receive triple drops."),
    DOUBLE_DROPS(true, XMaterial.matchXMaterial("COOKED_BEEF").get().parseMaterial(), "DOUBLE_DROPS", "Double Drops", "When you kill animals/mobs you", "receive double drops."),
    DOUBLE_HEALTH(true, XMaterial.matchXMaterial("GOLDEN_APPLE").get().parseMaterial(), "DOUBLE_HEALTH", "Double Health", "You will be able to regenerate", "up to 20 hearts."),
    BETTER_ENCHANT(true, XMaterial.matchXMaterial("ENCHANTED_BOOK").get().parseMaterial(), "BETTER_ENCHANT", "Better Enchant", "When you left-click enchant with a book", "the enchant will be removed from the book."),
    DOUBLE_OR_NOTHING(true, XMaterial.matchXMaterial("EMERALD").get().parseMaterial(), "DOUBLE_OR_NOTHING", "Double or Nothing", " On mine of iron, diamond, or gold ore ", "you have a 50% chance of 2 of the ", "ore dropping or no ores dropping."),
    BARE_BONES(true, XMaterial.matchXMaterial("BONE").get().parseMaterial(), "BARE_BONES", "Barebones", "Enchantment tables/Anvils can't be crafted or used,", "Golden apples can't be crafted either.", "The Nether is disabled.", "Players drop 1 Diamond, 2 Golden apples.", "32 Arrows and 2 String on death."),
    LONG_SHOTS(true, XMaterial.matchXMaterial("ARROW").get().parseMaterial(), "LONG_SHOTS", "Long Shots", "If you get a shot from more than 50 blocks, ", "you get healed for 1 heart, and do 1.5x the damage."),
    GOLDEN_RETRIEVER(true, XMaterial.matchXMaterial("GOLDEN_APPLE").get().parseMaterial(), "GOLDEN_RETRIEVER", "Golden Retriever", "Players drop 1 golden head on death."),
    GONE_FISHING(true, XMaterial.matchXMaterial("RAW_FISH").get().parseMaterial(), "GONE_FISHING", "Gone Fishing", "You will get unbreaking 200 and ", "luck of the sea 200 fishing rod along with 64 anvils.", "Players will not be able to craft enchantment tables."),
    HORSE_LESS(true, XMaterial.matchXMaterial("DIAMOND_BARDING").get().parseMaterial(), "HORSE_LESS", "Horseless", "You can't tame horses", "You can't tame donkeys."),
    SOUP(true, XMaterial.matchXMaterial("MUSHROOM_SOUP").get().parseMaterial(), "SOUP", "Soup", "When you right click a soup you regain 3.5 hearts."),
    SWITCHEROO(true, XMaterial.matchXMaterial("ENDER_PEARL").get().parseMaterial(), "SWITCHEROO", "Switcheroo", "Everytime you shoot a player, you switch positions", "with them."),
    HASTEY_BOYS(true, XMaterial.matchXMaterial("IRON_PICKAXE").get().parseMaterial(), "HASTEY_BOYS", "Hastey Boys", "When you craft mining tools they", "will be enchanted with efficiency III."),
    OP_HASTEY_BOYS(true, XMaterial.matchXMaterial("DIAMOND_PICKAXE").get().parseMaterial(), "OP_HASTEY_BOYS", "Hastey Babies", "When you craft mining tools they", "will be enchanted with efficiency V."),
    HASTEY_BOYS_LITE(true, XMaterial.matchXMaterial("GOLD_PICKAXE").get().parseMaterial(), "HASTEY_BOYS_LITE", "Hastey Boys Lite", "When you craft mining tools they", "will be enchanted with efficiency I."),
    BUILD_UHC(true, XMaterial.matchXMaterial("LAVA_BUCKET").get().parseMaterial(), "BUILD_UHC", "Build UHC", "All the players will get a kit."),
    HYPIXEL_HEADS(true, XMaterial.matchXMaterial("SKULL_ITEM").get().parseMaterial(), "HYPIXEL_HEADS", "Hypixel Heads", "When you right click a head you will ", "get Regeneration III for 4 seconds ", "and Speed II for 20 seconds."),
    SKY_HIGH(true, XMaterial.matchXMaterial("WATER_BUCKET").get().parseMaterial(), "SKY_HIGH", "Skyhigh", "If your y coordinates are bellow set Sky High Limit", "you will take 1 heart down every 30 seconds."),
    FLOWER_POWER(true, XMaterial.matchXMaterial("RED_ROSE").get().parseMaterial(), "FLOWER_POWER", "Flower Power", "Every time you break a flower", "it will drop", "a random item in the game."),
    MOLES(true, XMaterial.matchXMaterial("PUMPKIN").get().parseMaterial(), "MOLES", "Moles", true, "One person on each team is chosen to be the Mole", "The Moles are one team and can communicate with each", "other, trying to take out the other players", "The normal players try to find out who the mole is on their", "team and kill them.", " ", "This scenario requires teams!"),
    TRACKER(true, XMaterial.matchXMaterial("COMPASS").get().parseMaterial(), "TRACKER", "Tracker", "At the start of the game you", "will receive compass and you", "will be able to track players."),
    ANONYMOUS(true, XMaterial.matchXMaterial("COMMAND").get().parseMaterial(), "ANONYMOUS", "Anonymous", true, "All players usernames", "will be hidden", "so no one knows who they are."),
    SUPERHEROS(true, XMaterial.matchXMaterial("FEATHER").get().parseMaterial(), "SUPERHEORS", "Superheroes", true, "Each player will gain", "a random special ability", "includes speed, strength, resistance,", "jump boost, extra hearts", "Fall damage is disabled."),
    DND(true, XMaterial.matchXMaterial("TNT").get().parseMaterial(), "DND", "Do Not Disturb (DND)", "Each time a player enters", "a fight they will be", "restricted to just fighting that player", "once they leave combat", "they may fight others."),
    LAFS(true, XMaterial.matchXMaterial("YELLOW_FLOWER").get().parseMaterial(), "LAFS", "Love at First Sight (LAFS)", true, "Teams will be created based", "on the players clicking each other in the game", "to team a player needs to right click", "on someone while playing", "max team sizes apply."),
    VEINMINER(true, XMaterial.matchXMaterial("DIAMOND_PICKAXE").get().parseMaterial(), "VEINMINER", "Vein Miner", "When players mine blocks", "any of the same type will break", "in a chain reaction if they are crouched."),
    WOODLIFE(true, XMaterial.matchXMaterial("WOOD").get().parseMaterial(), "WOODLIFE", "Wood Life", "When players mine coal ore", "it will not give them anything."),
    CORONAVIRUS(true, XMaterial.matchXMaterial("POTION").get().parseMaterial(), "CORONAVIRUS", "Coronavirus", "Every 5 minutes", "a random player receives the", "nausea and poison effect for between 5-60 seconds."),
    LIMITEDP4(true, XMaterial.matchXMaterial("ANVIL").get().parseMaterial(), "LIMITEDP4", "Limited P4", "Players will only be able", "to enchant one item", "with protection 4."),
    NINESLOT(true, XMaterial.matchXMaterial("WOOD_BUTTON").get().parseMaterial(), "NINESLOT", "Nine Slots", "Only nine slots of the players", "inventories are usable."),
    CRIPLE(true, XMaterial.matchXMaterial("FEATHER").get().parseMaterial(), "CRIPLE", "Cripple", "If a player takes fall damage", "they receive slowness for 30 seconds"),
    EVERYROSE(true, XMaterial.matchXMaterial("GOLD_CHESTPLATE").get().parseMaterial(), "EVERYROSE", "Every Rose", true, "Each player will receive", "a golden chestplate with thorns 3", "at the start of the game."),
    LIGHTSOUT(true, XMaterial.matchXMaterial("TORCH").get().parseMaterial(), "LIGHTSOUT", "Lights Out", "Players can not place", "torches during the game."),
    PYRO(true, XMaterial.matchXMaterial("BLAZE_POWDER").get().parseMaterial(), "PYRO", "Pyro", true, "Players will start the game", "with a flame 1 and", "fire aspect 1 book."),
    EXPOSURE(true, XMaterial.matchXMaterial("ENCHANTMENT_TABLE").get().parseMaterial(), "EXPOSURE", "Exposure", "When a player crafts an", "enchantment table they will be", "teleported to the surface and given", "mining fatigue for 1 minute."),
    ZOMBIES(true, XMaterial.matchXMaterial("ROTTEN_FLESH").get().parseMaterial(), "ZOMBIES", "Zombies", "When a player dies a", "zombie will be spawned on", "their death location."),
    BETAZOMBIES(true, XMaterial.matchXMaterial("FEATHER").get().parseMaterial(), "BETAZOMBIES", "Beta Zombies", "Zombies when killed", "will drop feathers."),
    BOOKCEPTION(true, XMaterial.matchXMaterial("ENCHANTED_BOOK").get().parseMaterial(), "BOOKCEPTION", "Bookception", "When a player dies a", "random enchant book", "will spawn at their death location."),
    BALDCHICKEN(true, XMaterial.matchXMaterial("ARROW").get().parseMaterial(), "BALDCHICKEN", "Bald Chicken", "Chicken's drop no feathers", "and skeletons drop", "3-5 arrows."),
    BIRDS(true, XMaterial.matchXMaterial("FIREWORK").get().parseMaterial(), "BIRDS", "Birds", true, "All players can fly!."),
    PUPPYPOWER(true, XMaterial.matchXMaterial("BONE").get().parseMaterial(), "PUPPYPOWER", "Puppy Power", true, "All players will get", "64 bones, 64 rotten flesh, and 64 wolf spawn eggs."),
    BLEEDINGSWEETS(true, XMaterial.matchXMaterial("DIAMOND").get().parseMaterial(), "BLEEDINGSWEETS", "Bleeding Sweets", "When a player dies they", "drop 1 diamond, 5 gold,", "16 arrows and 1 string."),
    NODIAMONDARMOR(true, XMaterial.matchXMaterial("DIAMOND_CHESTPLATE").get().parseMaterial(), "NODIAMONDARMOR", "No Diamond Armor", "Player's can not craft", "diamond armor."),
    CARROTCOMBO(true, XMaterial.matchXMaterial("GOLDEN_CARROT").get().parseMaterial(), "CARROTCOMBO", "Carrot Combo", "When player's craft swords", "they will receive a carrot with an enchantment", "Wood Sword = Sharpness 2 Carrot.", "Gold Sword = Sharpness 2 Carrot", "Stone Sword = Sharpness 3 Carrot", "Iron Sword = Sharpness 5 Carrot", "Diamond Sword = Sharpness 6 Carrot"),
    BOMBERS(true, XMaterial.matchXMaterial("FLINT_AND_STEEL").get().parseMaterial(), "BOMBERS", "Bombers", true, "Everyone starts with unbreakable flint and steel", "and most animals and monsters drop TNT."),
    CATSEYES(true, XMaterial.matchXMaterial("SPIDER_EYE").get().parseMaterial(), "CATSEYES", "Cats Eyes", true, "Everyone starts with night vision."),
    LUCKYROULETTE(true, XMaterial.matchXMaterial("GOLD_NUGGET").get().parseMaterial(), "LUCKYROULETTE", "Lucky Roulette", true, "Every 2 minutes", "players are given a random item."),
    RANDOMIZER(true, XMaterial.matchXMaterial("COMMAND").get().parseMaterial(), "RANDOMIZER", "Randomizer", "Each block will drop a random item", "or material based upon the config settings."),
    BATS(true, XMaterial.matchXMaterial("COAL_BLOCK").get().parseMaterial(), "BATS", "Bats", "When a player kills a bat", "there's a 95% chance of dropping a Golden Apple", "and a 5% chance of killing the player."),
    REDVSBLUE(true, XMaterial.matchXMaterial("WOOL").get().parseMaterial(), "REDVSBLUE", "Red vs Blue", true, "Two teams (red, blue)", "will be randomly selected on game start."),
    BENCHBLITZ(true, XMaterial.matchXMaterial("WORKBENCH").get().parseMaterial(), "BENCHBLITZ", "Bench Blitz", true, "At the start of the game", "players will get 1 crafting table", "they will not be able to create more."),
    DISABLESHIELDS(true, XMaterial.matchXMaterial("SHIELD").get().parseMaterial(), "DISABLESHIELDS", "Disable Shields", false, "&c(1.9+ Only)", "Players will not be able", "to use shields.", "Shields will be removed from inventories on use."),
    DISABLEOFFHAND(true, XMaterial.matchXMaterial("TIPPED_ARROW").get().parseMaterial(), "DISABLEOFFHAND", "Disable Offhand", false, "&c(1.9+ Only)", "Players will not be able", "to use their offhand."),
    GRASS_EXPLOSION(true, XMaterial.matchXMaterial("GRASS").get().parseMaterial(), "GRASS_EXPLOSION", "Grass Explosion", false, "When players walk on grass", "it will have a 25% chance to explode.", "NOTE: Will start immediately upon scatter."),
    RAINING_TNT(true, XMaterial.matchXMaterial("TNT").get().parseMaterial(), "RAINING_TNT", "Raining TNT", true, "Every minute TNT will", "rain down on 2 unlucky players.", "Starts two minutes into the game."),
    MEETUP(true, XMaterial.matchXMaterial("BEACON").get().parseMaterial(), "MEETUP", "Meetup", true, "At a set time (/config admin)", "players will no longer be able to mine", "ores and will be forced to the surface (if under Y 35)."),
    NOODLEJUMP(true, XMaterial.matchXMaterial("POTION").get().parseMaterial(), "NOODLEJUMP", "Noodle Jump", true, "At the start of the game", "players will receive permanent", "jump boost.");

    public boolean backendEnabled;
    public String name;
    public String alias;
    public boolean active = false;
    public String[] description;
    public Material material;
    public boolean lobbyModeOnlyEdit = false;

    public ScenarioData scenarioData;

    public static int LIMITATIONS_MAX_DIAMONDS = 16;
    public static int LIMITATIONS_MAX_GOLD = 32;
    public static int LIMITATIONS_MAX_IRON = 64;

    Scenario(boolean backendEnabled, Material material, String alias, String name, String... desc) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    Scenario(boolean backendEnabled, Material material, String alias, String name, boolean lobbyModeOnlyEdit, String... desc) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setBackendEnabled(boolean backendEnabled) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setAlias(String alias) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setActive(boolean active) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setDescription(String[] description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setMaterial(Material material) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setLobbyModeOnlyEdit(boolean lobbyModeOnlyEdit) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @deprecated Use ScenarioData#toItemStack instead.
     *
     * @return Scenario item stack
     */
    @Deprecated
    public ItemStack toItemStack() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
