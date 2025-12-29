/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.player.stats.Winner;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Called when a solo player wins the game
 *
 * Handles win and player data
 */
@Getter
@Setter
public class UHCWinEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private Winner winner;

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
     * Get the winner of the UHC Game.
     *
     * @return {@link Winner}
     */
    public Winner getWinner() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the winner of the UHC game as a player.
     *
     * @return {@link Player} of the game.
     */
    public Player getWinnerAsPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
