/*
 * Copyright (c) 2015-2022. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;


import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * Called on DeathMessagesListener
 *
 * Handles death messages, death tracking, etc
 */
@Getter
@Setter
public class DeathMessageEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private PlayerDeathEvent deathEvent;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public DeathMessageEvent(PlayerDeathEvent event) {
        this.deathEvent = event;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public PlayerDeathEvent getDeathEvent() {
        return this.deathEvent;
    }
}
