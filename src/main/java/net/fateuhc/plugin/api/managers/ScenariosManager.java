/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.scenarios.Scenario;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

public class ScenariosManager {

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
     * Used to get a Scenario from a scenario name.
     *
     * @param name Scenario name (case sensitive)
     * @return Scenario
     */
    public Scenario getByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a scenario from source.
     *
     * @param source Scenario
     * @return Scenario
     */
    public Scenario getScenario(Scenario source) {
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
}
