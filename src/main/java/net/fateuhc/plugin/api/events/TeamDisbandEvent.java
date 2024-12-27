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
 * This event is called when a team is disbanded.
 *
 * @since API v0.4-ALPHA
 */
public class TeamDisbandEvent extends Event {

    private Team disbandedTeam;
    private int disbandedTeamId;
    private Player oldOwner;
    private HandlerList handlers = new HandlerList();

    /**
     * Get the disbanded team.
     *
     * @return {@link Team}
     */
    public Team getDisbandedTeam() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the disbanded team's id.
     *
     * @return {@link Integer}
     */
    public int getDisbandedTeamId() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the owner of the disbanded team.
     *
     * @return {@link Player}
     */
    public Player getOldOwner() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
