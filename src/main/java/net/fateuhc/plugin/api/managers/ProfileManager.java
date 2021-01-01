/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.states.PlayerState;
import net.fateuhc.plugin.player.Profile;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProfileManager {

    /**
     * Used to create a player's profile.
     * This is done on the first join of the player.
     *
     * @param uuid Player's UUID
     * @param name Player's name
     */
    public void handleProfileCreation(UUID uuid, String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a player's profile.
     *
     * @param object Player's UUID or Name
     * @return Player's profile
     */
    public Profile getProfile(Object object) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to check a player's spectating status.
     *
     * @param player Player's name
     * @return True/False if the player can spectate
     */
    public boolean canSpectate(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to check a player's spectating radius.
     *
     * @param player Player's Name
     * @return Current player's spectator radius
     */
    public int getSpectatorRadius(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to gather the users in a PlayerState.
     *
     * @param playerState Designate the PlayerState
     * @return List of players in the designated PlayerState
     */
    public List<Player> getPlayersInState(PlayerState playerState) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to see if a player is a spectator.
     *
     * @param player Player's name
     * @return True/False based upon if the player is spectating
     */
    public boolean isSpectator(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to see if a player is the host.
     *
     * @param player PLayer's name
     * @return True/False if the player is the host of the game
     */
    public boolean isHost(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to set a player to spectator mode.
     *
     * @param player  Player's name
     * @param profile Player's profile
     */
    public void setSpectating(Player player, Profile profile) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the list of profiles.
     *
     * @return List of profiles
     */
    public Map<UUID, Profile> getProfiles() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to set the list of profiles.
     *
     * @param profiles List of profiles
     */
    public void setProfiles(Map<UUID, Profile> profiles) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
