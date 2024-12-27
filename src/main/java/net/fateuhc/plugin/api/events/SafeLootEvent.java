/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
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
import org.bukkit.plugin.IllegalPluginAccessException;

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
     * Get the player's name.
     *
     * @return {@link String} - player's name
     */
    public String getPlayerName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the loot claimers name.
     *
     * @return {@link String} - player's name
     */
    public String getClaimerName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the loot chest.
     *
     * @return {@link Chest}
     */
    public Chest getChest() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
