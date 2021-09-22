/*
 * Copyright (c) 2015-2022. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;


import lombok.Getter;
import lombok.Setter;
import org.bukkit.block.Chest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called on TimeBombListener
 *
 * Handles player and the chest
 */
@Getter
@Setter
public class TimeBombEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private String playerName;
    private Chest chest;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public TimeBombEvent(String name, Chest chest) {
        this.playerName = name;
        this.chest = chest;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Chest getChest() {
        return this.chest;
    }
}
