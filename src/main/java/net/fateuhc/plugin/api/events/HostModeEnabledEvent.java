/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.api.StubGuard;
import net.fateuhc.plugin.utilities.uhc.game.Host;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player enables host mode.
 *
 * @since API v0.4-ALPHA
 */
public class HostModeEnabledEvent extends Event {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.events.HostModeEnabledEvent");
    }

    private Host host;
    private Player player;
    private HandlerList handlers = new HandlerList();

    /** Internal — constructed by the FateUHC plugin. */
    public HostModeEnabledEvent(Host host, Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the host's profile.
     *
     * @return {@link Host}'s profile
     */
    public Host getHost() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the {@link Player} instance of the host.
     *
     * @return {@link Player} instance
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
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
}
