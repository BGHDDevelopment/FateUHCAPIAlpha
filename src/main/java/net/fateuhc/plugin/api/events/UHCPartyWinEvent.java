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

import java.util.List;

/**
 * Called when a team wins the game
 *
 * Handles win and player data
 */
@Getter
@Setter
public class UHCPartyWinEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private List<Winner> winners;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public UHCPartyWinEvent(List<Winner> winners) {
        this.winners = winners;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public List<Winner> getWinners() {
        return this.winners;
    }
}
