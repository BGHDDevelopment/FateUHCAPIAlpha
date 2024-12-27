/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.player.stats.Winner;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

/**
 * Called when a team wins the game
 *
 * Handles win and player data
 */
public class UHCTeamWinEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private List<Winner> winners;

    /**
     * Get the handlers list.
     *
     * @return {@link HandlerList}
     */
    @Override
    public HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the handlers list.
     *
     * @return {@link HandlerList}
     */
    public static HandlerList getHandlerList() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the winners of the UHC game.
     *
     * @return {@link List} of {@link Winner}s
     */
    public List<Winner> getWinners() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the winners of the UHC game as a player.
     *
     * @return {@link List} of winners as {@link Player}s.
     */
    public List<Player> getWinnersAsPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
