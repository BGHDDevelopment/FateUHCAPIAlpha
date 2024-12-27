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
 * This event is called when a team is created.
 *
 * @since API v0.4-ALPHA
 */
public class TeamCreateEvent extends Event {

    private Team team;
    private int teamId;
    private Player owner;
    private HandlerList handlers = new HandlerList();

    /**
     * Get the new team.
     *
     * @return {@link Team}
     */
    public Team getTeam() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the new team id.
     *
     * @return {@link Integer}
     */
    public int getTeamId() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the owner of the new team.
     *
     * @return {@link Player}
     */
    public Player getOwner() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
