/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.team.Team;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when the player leaves the team.
 *
 * @since API v0.4-ALPHA
 */
public class PlayerLeaveTeamEvent extends Event {

    private Team oldTeam;
    private int oldTeamId;
    private OfflinePlayer player;
    private HandlerList handlers = new HandlerList();

    /**
     * Get the player's old team.
     *
     * @return The old {@link Team}
     */
    public Team getOldTeam() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's old team id.
     *
     * @return {@link Integer}
     */
    public int getOldTeamId() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player who has left the team.
     *
     * @return {@link OfflinePlayer}
     */
    public OfflinePlayer getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}