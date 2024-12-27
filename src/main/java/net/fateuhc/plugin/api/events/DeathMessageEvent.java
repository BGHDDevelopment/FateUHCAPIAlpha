/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Called on DeathMessagesListener
 *
 * Handles death messages, death tracking, etc
 */
public class DeathMessageEvent extends Event {

    private static HandlerList handlers = new HandlerList();
    private PlayerDeathEvent deathEvent;

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
     * Get the handler list.
     *
     * @return {@link HandlerList}
     */
    public static HandlerList getHandlerList() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the {@link PlayerDeathEvent}.
     *
     * @return {@link PlayerDeathEvent}
     */
    public PlayerDeathEvent getDeathEvent() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
