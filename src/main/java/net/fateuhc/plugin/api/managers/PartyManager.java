/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import party.Party;

import java.util.List;
import java.util.UUID;

public class PartyManager {

    /**
     * Used to get the party of a player.
     *
     * @param player Player's name
     * @return Party
     */
    public party.Party getParty(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the party of a player.
     *
     * @param uuid Player's UUID
     * @return Party
     */
    public Party getParty(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @param player Player's name
     * @return True/False if the party is alive
     */
    public boolean isAlive(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a party kill count.
     *
     * @param player Player's name
     * @return Party kill count
     */
    public int getKills(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to the online members of a party.
     *
     * @param player The player who your wanting to get the members of.
     * @return List of online party members.
     */
    public List<Player> getOnlineMembers(Player player) { throw new IllegalPluginAccessException("FateUHCAPI is not registered!"); }

    /**
     * Used to get the members of a party.
     *
     * @param player The player who your wanting to get the members of.
     * @return List of the party members.
     */
    public List<UUID> getMembers(Player player) { throw new IllegalPluginAccessException("FateUHCAPI is not registered!"); }

    /**
     * Used to get the state of a party.
     *
     * @param player Player's name
     * @return TEAM-LIST-FORMAT
     */
    public List<String> toList(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to remove a player from a party.
     *
     * @param player Player's name
     * @param party  Player's party
     */
    public void removePlayer(OfflinePlayer player, party.Party party) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to add a player to a party.
     *
     * @param player Player's name
     * @param party  Player's party
     */
    public void addPlayer(Player player, party.Party party) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to unregister a party using Party.
     *
     * @param party Party
     */
    public void unregisterParty(Party party) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to unregister a party using player's UUID.
     *
     * @param uuid Player's UUID
     */
    public void unregisterParty(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @param owner Player's name
     */
    public void createParty(Player owner) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @param player Player's name
     * @param party  Party
     * @param create True/False is the player forming the party
     */
    public void registerParty(Player player, Party party, boolean create) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @param party Party
     */
    public void disbandParty(Party party) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * @return Int of active Parties
     */
    public int getPartiesAlive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
