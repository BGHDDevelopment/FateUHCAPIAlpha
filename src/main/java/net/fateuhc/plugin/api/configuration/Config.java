/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.configuration;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.UHC;
import net.fateuhc.plugin.utilties.uhc.items.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Provides all game configs.
 */
@Getter
public enum Config {

    NETHER("Nether", false, new ItemBuilder(Material.NETHERRACK), "Prevents you from going", "to nether world."),
    FINAL_HEAL("Final Heal Duration", 10, new ItemBuilder(Material.POTION).setDurability(16453)),
    PVP_TIME("PvP Period Duration", 20, new ItemBuilder(Material.GOLD_SWORD)),
    NETHER_TIME("Nether Time", 20, new ItemBuilder(Material.OBSIDIAN)),
    BORDER_SIZE("Border Size", UHC.getInstance().getConfigFile().getInt("BORDER.START"), new ItemBuilder(Material.GHAST_TEAR), true),
    BORDER_SHRINK_INTERVAL(false, "Border Shrink Interval", UHC.getInstance().getBorderManager().getShrinkEvery(), new ItemBuilder(Material.PAPER)),
    BORDER_SHRINK_UNTIL(false, "Border Shrink Until", UHC.getInstance().getBorderManager().getShrinkUntil(), new ItemBuilder(Material.GOLDEN_CARROT)),
    FIRST_SHRINK("First Shrink", 35, new ItemBuilder(Material.COBBLE_WALL), true),
    ENDER_PEARL_DAMAGE("Enderpearl Damage", false, new ItemBuilder(Material.ENDER_PEARL), "Prevents you from taking", "enderpearl damage."),
    APPLE_RATE("Apple Rate", 2, new ItemBuilder(Material.APPLE), false),
    SHEARS("Shears", true, new ItemBuilder(Material.SHEARS), "Allows you to have a chance from getting", "apples by cutting leaves of trees."),
    SHEARS_RATE("Shears Rate", 5, new ItemBuilder(Material.SHEARS)),
    ENCHANTED_GOLDEN_APPLES("Enchanted Golden Apples", false, new ItemBuilder(Material.GOLDEN_APPLE).setDurability(1), "Prevents you from consuming", "enchanted golden apples."),
    GOLDEN_HEADS("Golden Heads", true, new ItemBuilder(Material.GOLDEN_APPLE), "Prevents you from consuming or", "crafting golden heads."),
    NETHER_BED_EXPLOSION("Nether Bed Explosion", false, new ItemBuilder(Material.BED), "Prevents players from blowing", "you with a bed in a nether world."),
    STRENGTH_POTIONS("Strength Potions", false, new ItemBuilder(Material.POTION).setDurability(8201)),
    SPEED_POTIONS("Speed Potions", false, new ItemBuilder(Material.POTION).setDurability(8194)),
    INVIS_POTIONS("Invisibility Potions", false, new ItemBuilder(Material.POTION).setDurability(8238)),
    FLAT("Last Border Flat", true, new ItemBuilder(Material.GRASS), "Flat arena will be made on", "the last border of a game."),
    EXACT_FLAT("Exact Flat", false, new ItemBuilder(Material.GRASS), "Flat arena will be made on", "the exact custom set border size."),
    EXACT_FLAT_SIZE("Exact Flat Size", 25, new ItemBuilder(Material.GRASS)),
    GLASS_BORDER("Glass Bedrock", true, new ItemBuilder(Material.STAINED_GLASS).setDurability(14), "Visual glass border above", "the real bedrock border."),
    PARTY_DAMAGE("Prevent Party Damage", true, new ItemBuilder(Material.CAULDRON_ITEM), "When enabled, prevents you from dealing", "damage to party members."),
    DEATH_KICK("Death Kick", true, new ItemBuilder(Material.INK_SACK).setDurability(1), "Kick you 30 seconds after", "you die in a uhc game."),
    MOBS_ATTACK("Mobs Attack", true, new ItemBuilder(Material.SKULL_ITEM).setDurability(4), "If disabled you don't need to", "care about mobs attack, be safe."),
    TO_INVENTORY("To Inventory", false, new ItemBuilder(Material.CHEST), "If enabled all mining ores", "will go to inventory automatically."),
    EXP_BOTTLE("Exp Bottle", true, new ItemBuilder(Material.EXP_BOTTLE), "If enabled you will receive full xp from", "players you kill."),
    LATE_SCATTER_PERIOD("Late Scatter Period", 10, new ItemBuilder(Material.ANVIL)),
    SKY_HIGH_TIME("Sky High Scenario Time", 40, new ItemBuilder(Material.WATER_BUCKET), "If Sky High scenario is enabled it will", "be active at this time."),
    SKY_HIGH_LIMIT("Sky High Scenario Limit", 90, new ItemBuilder(Material.WATER_BUCKET), "If Sky High scenario is enabled you must", "be above this value or you", "will start taking hearts down."),
    WEATHER_AND_TIME("Weather & Time", false, new ItemBuilder(Material.WATER_BUCKET), "If enabled the game world can", "have weather & the time will change."),
    ANTIBURN("AntiBurn", false, new ItemBuilder(Material.FIREWORK_CHARGE), "If enabled items dropped in fire", "will not burn."),
    IPVP("iPvP", true, new ItemBuilder(Material.BOW), "Prevents players from dealing", "damage to you before pvp. Also prevents", "lava, water placing and usage of", "flint and steel if someone is near you."),
    ABSORPTIONLESS("Absorption Less", true, new ItemBuilder(Material.GOLDEN_APPLE), "When players eat golden heads and", "golden apples they will not", "gain absorption effects"),
    UBL("UBL", false, new ItemBuilder(Material.DIAMOND_AXE), "If set to true UBL ban lists will be hooked", "and UBL bans will take effect"),
    SHEEP_STRING("Sheep Drop String", false, new ItemBuilder(Material.WOOL), "If set to true sheep will", "drop 1 string when they die"),
    ONEHUNDERED_BORDER_SCENARIOS("100x100 Border Scenarios", false, new ItemBuilder(Material.STAINED_CLAY), "If set to true scenarios set from the", "uhcconfiguration.yml will be enabled."),
    RANDOM_TEAMS("Random Teams", false, new ItemBuilder(Material.CHEST), "If enabled, teams will be assigned randomly.");

    /**
     * Defines config default and current amount.
     */
    @Setter
    public int amount, defaultAmount;
    /**
     * Provides if the config is enabled or if enabled by default.
     */
    @Setter
    public boolean enabled, defaultEnabled;
    /**
     * Provides #ConfigType
     */
    @Setter
    public ConfigType configType;
    /**
     * Config name
     */
    @Setter
    public String name;
    /**
     * Config item in the menu.
     */
    public ItemBuilder itemBuilder;
    /**
     * Is the config editable?
     */
    @Setter
    public boolean editable = true;
    /**
     * Can the config only be changed in lobby?
     */
    @Setter
    public boolean lobbyModeOnly = true;
    /**
     * Config description.
     */
    @Setter
    public String[] description;

    /**
     * Used to get the config.
     *
     * @param name        Config name
     * @param amount      Config amount
     * @param itemBuilder
     * @param description Config description
     */
    Config(String name, int amount, ItemBuilder itemBuilder, String... description) {
        this.name = name;
        this.amount = amount;
        this.defaultAmount = amount;
        this.configType = ConfigType.INTEGER;
        this.itemBuilder = itemBuilder;
        this.description = description;
    }

    /**
     * Used to get the config.
     *
     * @param name        Config name
     * @param enabled     True/False
     * @param itemBuilder
     * @param description Config description
     */
    Config(String name, boolean enabled, ItemBuilder itemBuilder, String... description) {
        this.name = name;
        this.enabled = enabled;
        this.defaultEnabled = enabled;
        this.configType = ConfigType.BOOLEAN;
        this.itemBuilder = itemBuilder;
        this.description = description;
    }

    /**
     * Used to get the config.
     *
     * @param name          Config name
     * @param amount        Config amount
     * @param itemBuilder
     * @param lobbyModeOnly True/False
     * @param description   Config description
     */
    Config(String name, int amount, ItemBuilder itemBuilder, boolean lobbyModeOnly, String... description) {
        this.name = name;
        this.amount = amount;
        this.defaultAmount = amount;
        this.configType = ConfigType.INTEGER;
        this.itemBuilder = itemBuilder;
        this.lobbyModeOnly = lobbyModeOnly;
        this.description = description;
    }

    /**
     * Used to get the config.
     *
     * @param editable    True/False
     * @param name        Config name
     * @param amount      Config amount
     * @param itemBuilder
     * @param description Config Description
     */
    Config(boolean editable, String name, int amount, ItemBuilder itemBuilder, String... description) {
        this.name = name;
        this.amount = amount;
        this.defaultAmount = amount;
        this.configType = ConfigType.INTEGER;
        this.itemBuilder = itemBuilder;
        this.editable = editable;
        this.description = description;
    }

    /**
     * @return ItemStack of config item
     */
    public ItemStack toItemStack() {
        this.itemBuilder.setLore(new ArrayList<>());
        this.itemBuilder.setName((this.configType == ConfigType.BOOLEAN && this.enabled ? "&a&l" : this.configType == ConfigType.INTEGER ? "&5&l" : "&c&l") + this.name);
        this.itemBuilder.addLoreLine("&7&m---------------------------------");
        if (this.configType == ConfigType.BOOLEAN) {
            this.itemBuilder.addLoreLine(" ");
            this.itemBuilder.addLoreLine("&eCurrently&7: &f" + (this.enabled ? "Enabled" : "Disabled") + "&7.");
            this.itemBuilder.addLoreLine(" ");
        } else {
            this.itemBuilder.addLoreLine(" ");
            this.itemBuilder.addLoreLine("&eCurrently&7: &f" + this.amount + "&7.");
            this.itemBuilder.addLoreLine(" ");
        }
        if (this.description.length > 0) {
            Arrays.stream(this.description).forEach(description -> this.itemBuilder.addLoreLine("&b" + description));
            this.itemBuilder.addLoreLine(" ");
        }
        this.itemBuilder.addLoreLine("&aThis will be active throughout the game");
        this.itemBuilder.addLoreLine("&7&m---------------------------------");
        ItemStack item = this.itemBuilder.toItemStack();
        if (this.configType.equals(ConfigType.INTEGER)) {
            item.setAmount(this.amount);
        }
        return item;
    }
}
