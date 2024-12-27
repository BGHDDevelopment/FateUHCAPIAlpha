/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.team;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.*;

/**
 * The data that is kept for a team.
 */
public class Team {

    private Player owner;
    private List<UUID> members = new ArrayList<>();
    private Map<UUID, Team> playerParties = new HashMap<>();
    private int id;
    private int kills = 0;
    private Inventory teamInv;
    private Location scatterLocation;
    private ChatColor chatColor;
    private String formatting;

    /**
     * Get the owner of the team.
     *
     * @return {@link Player} instance of the owner
     */
    public Player getOwner() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the uuid of the members of the party.
     *
     * @return {@link List} of {@link UUID}
     */
    public List<UUID> getMembers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player parties.
     *
     * @return {@link Map} of {@link UUID} and {@link Team}
     */
    public Map<UUID, Team> getPlayerParties() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the ID of the team.
     *
     * @return {@link Integer}
     */
    public int getId() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount of kills the team has.
     *
     * @return {@link Integer}
     */
    public int getKills() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the shared team inventory.
     *
     * @return {@link Inventory}
     */
    public Inventory getTeamInv() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the scatter location for the team.
     *
     * @return {@link Location}
     */
    public Location getScatterLocation() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Set the scatter location for the team.
     *
     * @param location The location the team will scatter in.
     */
    public void setScatterLocation(Location location) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the team's chat colour.
     *
     * @return {@link ChatColor}
     */
    public ChatColor getChatColor() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the formatting for the team.
     *
     * @return {@link String}
     */
    public String getFormatting() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the team still alive?
     *
     * @return {@link Boolean}
     */
    public boolean isAlive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Increase the amount of kills the team has.
     */
    public void increaseKills() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get a list of the online players.
     *
     * @return {@link List} of {@link UUID}s.
     */
    public List<UUID> getOnlinePlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get a list of the online players.
     *
     * @return {@link List} of {@link Player}s
     */
    public List<Player> getOnlineMembers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Send a message to the team.
     *
     * @param message The message you wish to send.
     * @param usePrefix Should the prefix be added on?
     */
    public void sendTeamMessage(String message, boolean usePrefix) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the team full?
     *
     * @return {@link Boolean}
     */
    public boolean isFull() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
