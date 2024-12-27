/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.data;

import com.cryptomorin.xseries.XMaterial;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

public class ScenarioData {

    /**
     * Create a ScenarioData.
     *
     * @deprecated Please use {@link #ScenarioData(boolean, Material, String, String, String...)} as the relocation of XSeries breaks this method.
     *
     * @param enabled Should the Scenario be enabled for servers to use?
     * @param material What material should the Scenario show as?
     * @param alias What is the alias for the Scenario?
     * @param name What is the name of the Scenario?
     * @param description What is the description of the Scenario?
     */
    @Deprecated
    public ScenarioData(boolean enabled, XMaterial material, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Create a ScenarioData.
     *
     * @deprecated Please use {@link #ScenarioData(boolean, Material, boolean, String, String, String...)} as the relocation of XSeries breaks this method.
     *
     * @param enabled Should the Scenario be enabled for servers to use?
     * @param material What material should the Scenario show as?
     * @param lobbyModeOnlyEdit Should the scenario only be able to be enabled from the lobby?
     * @param alias What is the alias for the Scenario?
     * @param name What is the name of the Scenario?
     * @param description What is the description of the Scenario?
     */
    @Deprecated
    public ScenarioData(boolean enabled, XMaterial material, boolean lobbyModeOnlyEdit, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Create a ScenarioData.
     *
     * @param enabled Should the Scenario be enabled for servers to use?
     * @param material What material should the Scenario show as?
     * @param alias What is the alias for the Scenario?
     * @param name What is the name of the Scenario?
     * @param description What is the description of the Scenario?
     */
    public ScenarioData(boolean enabled, Material material, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Create a ScenarioData.
     *
     * @param enabled Should the Scenario be enabled for servers to use?
     * @param material What material should the Scenario show as?
     * @param lobbyModeOnlyEdit Should the scenario only be able to be enabled from the lobby?
     * @param alias What is the alias for the Scenario?
     * @param name What is the name of the Scenario?
     * @param description What is the description of the Scenario?
     */
    public ScenarioData(boolean enabled, Material material, boolean lobbyModeOnlyEdit, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the Scenario be able to be enabled by servers.
     *
     * @return {@link Boolean}
     */
    public boolean isEnabled() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the name of the Scenario.
     *
     * @return {@link String}
     */
    public String getName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the alias of the Scenario.
     *
     * @return {@link String}
     */
    public String getAlias() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the scenario active?
     *
     * @return {@link Boolean}
     */
    public boolean isActive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the description of the Scenario.
     *
     * @return {@link String[}
     */
    public String[] getDescription() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the Scenario only able to be edited in the lobby?
     *
     * @return {@link Boolean}
     */
    public boolean isLobbyModeOnlyEdit() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the item stack for the scenario.
     *
     * @return {@link ItemStack}
     */
    public ItemStack toItemStack() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
