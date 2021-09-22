/*
 * Copyright (c) 2015-2022. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;


import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.player.stats.Winner;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

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

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public UHCWinEvent(Winner winner) {
        this.winner = winner;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Winner getWinner() {
        return this.winner;
    }
}
