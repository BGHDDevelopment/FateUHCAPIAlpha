/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.team.Team;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player joins a team.
 *
 * This event will also be called when a player creates a team.
 *
 * @since API v0.4-ALPHA
 */
public class PlayerJoinTeamEvent extends Event {

    private Team team;
    private int teamId;
    private Player player;
    private HandlerList handlers = new HandlerList();

    /**
     * Get the team.
     *
     * @return {@link Team}
     */
    public Team getTeam() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the id of the Team.
     *
     * @return {@link Integer}
     */
    public int getTeamId() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player who joined the team.
     *
     * @return {@link Player}
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
