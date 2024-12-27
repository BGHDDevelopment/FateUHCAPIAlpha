/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import com.cryptomorin.xseries.XMaterial;
import net.fateuhc.plugin.api.data.ConfigData;
import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@SuppressWarnings("unused")
public class ConfigManager {

    /**
     * Register a configuration option within FateUHC.
     *
     * @param active Is the configuration active?
     * @param defaultActive Is the configuration active by default?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(boolean active, boolean defaultActive, boolean lobbyModeOnlyEdit, XMaterial material,
                               String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a configuration option within FateUHC.
     *
     * @param active Is the configuration active?
     * @param defaultActive Is the configuration active by default?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(boolean active, boolean defaultActive, boolean lobbyModeOnlyEdit, Material material,
                               String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a configuration option within FateUHC.
     *
     * @param active Is the configuration active?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(boolean active, boolean lobbyModeOnlyEdit, XMaterial material, String alias,
                               String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a configuration option within FateUHC.
     *
     * @param amount What is the amount the config option should have?
     * @param defaultAmount What is the default amount the config option should have?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(int amount, int defaultAmount, boolean editable, boolean lobbyModeOnlyEdit, XMaterial material,
                               String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a configuration option within FateUHC.
     *
     * @param amount What is the amount the config option should have?
     * @param defaultAmount What is the default amount the config option should have?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(int amount, int defaultAmount, boolean editable, boolean lobbyModeOnlyEdit, Material material,
                               String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a configuration option within FateUHC.
     *
     * @param amount What is the amount the config option should have?
     * @param lobbyModeOnlyEdit Should it only be able to be toggled in lobby mode only?
     * @param material What material should the item be in the menu?
     * @param alias What is the alias of the config option?
     * @param name What is the name of the config option?
     * @param description What is the description of the config option?
     */
    public void registerConfig(int amount, boolean lobbyModeOnlyEdit, XMaterial material, String alias,
                               String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the configuration with the given name.
     *
     * @param name The name of the configuration to retrieve.
     * @return {@link ConfigData}
     */
    public ConfigData getByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the configuration with the given alias.
     *
     * @param alias The alias of the configuration to retrieve.
     * @return {@link ConfigData}
     */
    public ConfigData getByAlias(String alias) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of active configs.
     *
     * @return A {@link List} of {@link ConfigData}.
     */
    public List<ConfigData> getActiveConfigs() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of active config names.
     *
     * @return A {@link List} of {@link String}.
     */
    public List<String> getActiveConfigNames() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of active configs aliases.
     *
     * @return A {@link List} of {@link String}.
     */
    public List<String> getActiveConfigAliases() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of config options.
     *
     * @return The {@link List} of {@link ConfigData}.
     */
    public List<ConfigData> getAllConfigs() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of config names.
     *
     * @return The {@link List} of {@link String}s.
     */
    public List<String> getAllConfigsName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the list of config aliases.
     *
     * @return The {@link List} of {@link String}s.
     */
    public List<String> getAllConfigsAlias() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
