/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.team.Team;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public class TeamManager {

    /**
     * Used to get the team of a player.
     *
     * @param player Player's name
     * @return Team
     */
    public Team getTeam(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the team of a player.
     *
     * @param uuid Player's UUID
     * @return Team
     */
    public Team getTeam(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Check if a player is alive.
     *
     * @param player Player's name
     * @return True/False if the team is alive
     */
    public boolean isAlive(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a team kill count.
     *
     * @param player Player's name
     * @return Team kill count
     */
    public int getKills(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to the online members of a team.
     *
     * @param player The player who you're wanting to get the members of.
     * @return List of online team members.
     */
    public List<Player> getOnlineMembers(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the members of a team.
     *
     * @param player The player who you're wanting to get the team members of.
     * @return List of the team members.
     */
    public List<UUID> getMembers(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the state of a team.
     *
     * @param player Player's name
     * @return TEAM-LIST-FORMAT
     */
    public List<String> toList(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to remove a player from a team.
     *
     * @param player Player's name
     * @param team  Player's team
     */
    public void removePlayer(OfflinePlayer player, Team team) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to add a player to a team.
     *
     * @param player Player's name
     * @param team  Player's team
     */
    public void addPlayer(Player player, Team team) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to unregister a team using Team.
     *
     * @param team Team
     */
    public void unregisterTeam(Team team) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to unregister a team using player's UUID.
     *
     * @param uuid Player's UUID
     */
    public void unregisterTeam(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Create a team.
     *
     * @param owner Player's name
     */
    public void createTeam(Player owner) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Register a team.
     *
     * @param player Player's name
     * @param team  Team
     * @param create True/False if the player is forming the team
     */
    public void registerTeam(Player player, Team team, boolean create) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Disband a team.
     *
     * @param team Team
     */
    public void disbandTeam(Team team) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the number of teams that are still alive.
     *
     * @return Int of active Teams
     */
    public int getTeamsAlive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
