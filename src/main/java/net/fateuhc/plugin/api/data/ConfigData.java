/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.data;

import com.cryptomorin.xseries.XMaterial;
import net.fateuhc.plugin.api.configuration.ConfigType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

public class ConfigData {

    /**
     * Register a config option in FateUHC.
     *
     * @param amount The amount the config item should be set to.
     * @param defaultAmount The default amount of the config item.
     * @param editable Should the host be able to edit the config option?
     * @param lobbyModeOnlyEdit Should the config option only be able to get changed in the lobby?
     * @param material What material should be used for the config option?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public ConfigData(int amount, int defaultAmount, boolean editable, boolean lobbyModeOnlyEdit, XMaterial material,
                      String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a config option in FateUHC.
     *
     * @param amount The amount the config item should be set to.
     * @param lobbyModeOnlyEdit Should the config option only be able to get changed in the lobby?
     * @param material What material should be used for the config option?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public ConfigData(int amount, boolean lobbyModeOnlyEdit, XMaterial material, String alias, String name,
                      String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a config option in FateUHC.
     *
     * @param active Should the config option be active?
     * @param defaultActive Should the config option be active by default?
     * @param lobbyModeOnlyEdit Should the config option only be able to get changed in the lobby?
     * @param material What material should be used for the config option?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public ConfigData(boolean active, boolean defaultActive, boolean lobbyModeOnlyEdit, XMaterial material, String alias,
                      String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a config option in FateUHC.
     *
     * @param active Should the config option be active?
     * @param lobbyModeOnlyEdit Should the config option only be able to get changed in the lobby?
     * @param material What material should be used for the config option?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public ConfigData(boolean active, boolean lobbyModeOnlyEdit, XMaterial material, String alias, String name,
                      String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the name of the config option?
     *
     * @return {@link String}
     */
    public String getName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the alias of the config option?
     *
     * @return {@link String}
     */
    public String getAlias() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the config type of the config option?
     *
     * @return {@link ConfigType}
     */
    public ConfigType getConfigType() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the amount the config option is set to?
     *
     * @return {@link Integer}
     */
    public int getAmount() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Set the amount the config option should be set to.
     *
     * @param amount What is the new amount?
     */
    public void setAmount(int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the default amount for the config option?
     *
     * @return {@link Integer}
     */
    public int getDefaultAmount() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the config option active?
     *
     * @return {@link Boolean}
     */
    public boolean isActive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Change if the config option is active or not.
     *
     * @param active Should the config option be active?
     */
    public void setActive(boolean active) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the config option active by default?
     *
     * @return {@link Boolean}
     */
    public boolean isDefaultActive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the config option editable?
     *
     * @return {@link Boolean}
     */
    public boolean isEditable() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Change if the config option should be editable.
     *
     * @param editable Should the config option be editable?
     */
    public void setEditable(boolean editable) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the description of the config option?
     *
     * @return {@link String[]}
     */
    public String[] getDescription() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * What is the material for the config option?
     *
     * @return {@link XMaterial}
     */
    public XMaterial getMaterial() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the config option only allowed to be edited in the lobby?
     *
     * @return {@link Boolean}
     */
    public boolean isLobbyModeOnlyEdit() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the item stack of the config option.
     *
     * @return {@link ItemStack}
     */
    public ItemStack toItemStack() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
