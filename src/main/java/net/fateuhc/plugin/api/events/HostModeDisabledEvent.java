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
 * This event is called when a host disables host mode.
 *
 * @since API v0.4-ALPHA
 */
public class HostModeDisabledEvent extends Event {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.events.HostModeDisabledEvent");
    }

    private Host host;
    private Player player;
    private HandlerList handlers = new HandlerList();

    /** Internal — constructed by the FateUHC plugin. */
    public HostModeDisabledEvent(Host host, Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     *  Get the host profile that has been disabled.
     *
     * @return {@link Host} of the old host.
     */
    public Host getHost() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player instance of the old host.
     *
     * @return {@link Player} of the old host.
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
