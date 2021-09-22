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
 * Called on SafeLootListener
 *
 * Handles chest claimer and the chest
 */
@Getter
@Setter
public class SafeLootEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private String playerName;
    private String claimerName;
    private Chest chest;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public SafeLootEvent(String name, String claimerName, Chest chest) {
        this.playerName = name;
        this.claimerName = claimerName;
        this.chest = chest;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getClaimerName() {
        return this.claimerName;
    }

    public Chest getChest() {
        return this.chest;
    }
}
