/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when the player toggles their spectator mode.
 *
 * @since API v0.4-ALPHA
 */
public class SpectatorToggledEvent extends Event {

    private Player player;
    private boolean enabled;
    private HandlerList handlers = new HandlerList();

    /**
     * Get the player who has toggled spectator mode.
     *
     * @return {@link Player}
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is spectator mode enabled?
     *
     * @return {@link Boolean}
     */
    public boolean isEnabled() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}

