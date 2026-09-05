/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.api.StubGuard;
import org.bukkit.block.Chest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Called on TimeBombListener
 *
 * Handles player and the chest
 */
@Getter
@Setter
public class TimeBombEvent extends Event {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.events.TimeBombEvent");
    }

    private static HandlerList handlers = new HandlerList();
    private String playerName;
    private Chest chest;

    /** Internal — constructed by the FateUHC plugin. */
    public TimeBombEvent(String name, Chest chest) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

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
     * Get the player name of who died.
     *
     * @return {@link String} - player name.
     */
    public String getPlayerName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the drops chest.
     *
     * @return {@link Chest}
     */
    public Chest getChest() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
