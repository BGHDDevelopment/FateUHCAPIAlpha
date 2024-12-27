/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import com.cryptomorin.xseries.XMaterial;
import net.fateuhc.plugin.api.data.ScenarioData;
import net.fateuhc.plugin.api.scenarios.Scenario;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public class ScenariosManager {

    /**
     * Register a scenario in FateUHC.
     *
     * @deprecated Please use {@link #registerScenario(boolean, Material, String, String, String...)} as the relocation of XSeries breaks this method.
     *
     * @param enabled Should the scenario be enabled?
     * @param material What material should be used?
     * @param name What should the scenario be called?
     * @param description What is the description of the scenario?
     */
    @Deprecated
    public void registerScenario(boolean enabled, XMaterial material, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a scenario in FateUHC.
     *
     * @deprecated Please use {@link #registerScenario(boolean, Material, boolean, String, String, String...)} as the relocation of XSeries breaks this method.
     *
     * @param enabled Should the scenario be enabled?
     * @param material What material should be used?
     * @param lobbyModeOnlyEdit Should the scenario only be able to be enabled in the lobby?
     * @param name What should the scenario be called?
     * @param description What is the description of the scenario?
     */
    @Deprecated
    public void registerScenario(boolean enabled, XMaterial material, boolean lobbyModeOnlyEdit, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a scenario in FateUHC.
     *
     * @param enabled Should the scenario be enabled?
     * @param material What {@link Material} should be used?
     * @param name What should the scenario be called?
     * @param description What is the description of the scenario?
     */
    public void registerScenario(boolean enabled, Material material, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a scenario in FateUHC.
     *
     * @param enabled Should the scenario be enabled?
     * @param material What {@link Material} should be used?
     * @param lobbyModeOnlyEdit Should the scenario only be able to be enabled in the lobby?
     * @param name What should the scenario be called?
     * @param description What is the description of the scenario?
     */
    public void registerScenario(boolean enabled, Material material, boolean lobbyModeOnlyEdit, String alias, String name, String... description) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a scenario in FateUHC.
     *
     * @param scenario The scenario data you wish to register.
     */
    public void registerScenario(ScenarioData scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a Scenario from a scenario name.
     *
     * @param name Scenario name (case sensitive)
     * @return Scenario
     */
    public Scenario getByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get scenario by an alias
     * @param alias What is the scenario alias?
     * @return ScenarioData
     */
    public ScenarioData getByAlias(String alias) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }


    /**
     * Used to get a scenario from source.
     * @deprecated Use {@link #getByScenario(Scenario)} or {@link #getByScenarioData(ScenarioData)} instead.
     *
     * @param source Scenario
     * @return Scenario
     */
    @Deprecated
    public Scenario getScenario(Scenario source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a scenario from source.
     *
     * @param source Scenario
     * @return Scenario
     */

    public ScenarioData getByScenario(Scenario source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a scenario from source.
     *
     * @param source Scenario
     * @return Scenario
     */
    public ScenarioData getByScenarioData(ScenarioData source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return Enabled Scenarios
     */
    public List<Scenario> getEnabledScenarios() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return Enabled scenario names
     */
    public List<String> getEnabledScenariosNames() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a list of people who are not moles during the Moles scenario.
     *
     * @return List of non-moles players during Moles scenario
     */
    public List<Player> getNoMolesPlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to list moles during moles scenario.
     *
     * @return List of moles during Moles scenario
     */
    public List<Player> getMolesPlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to check a player's moles status during Moles scenario.
     *
     * @param uuid Player's UUID
     * @return True/False depending on player's status
     */
    public boolean isMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to set a player as a mole during Moles scenario.
     *
     * @param uuid Player's UUID
     */
    public void setMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to remove a player from being a mole during Moles scenario.
     *
     * @param uuid Player's UUID
     */
    public void removeMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to give a player the BuildUHC scenario.
     *
     * @param player Player's name
     */
    public void giveBuildUHCScenario(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to handle scenarios that can only be enabled
     * before users are scattered.
     *
     * @param player Player's name
     */
    public void handleLobbyScenarios(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to give the Corona scenario effects to all players.
     */
    public void handleCorona() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to start LuckyRoulette for a player.
     *
     * @param player Player's name
     */
    public void handleLuckyRoulette(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to handle scenarios on scatter.
     * This is where most scenarios are setup.
     *
     * @param player Player's name
     */
    public void handleScenarios(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the item stack of a scenario.
     *
     * @param scenario The scenario you wish to get the item stack for.
     * @return Scenario item ItemStack
     */
    public ItemStack getItemStack(String scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Check if the scenario is active.
     *
     * @param scenario The scenario you wish to check if its active.
     * @return boolean
     */
    public boolean isActive(String scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Check if the scenario is enabled.
     *
     * @param scenario The scenario you wish to check if its enabled.
     * @return boolean
     */
    public boolean isEnabled(String scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the XMaterial of the scenario.
     *
     * @param scenario The scenario you wish to get the XMaterial for.
     * @return {@link XMaterial}
     */
    public XMaterial getXMaterial(String scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Material of the scenario.
     *
     * @param scenario The scenario you wish to get the Material for.
     * @return {@link Material}
     */
    public Material getMaterial(String scenario) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}