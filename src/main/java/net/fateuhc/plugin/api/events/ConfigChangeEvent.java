/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.api.data.ConfigData;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

public class ConfigChangeEvent extends Event implements Cancellable {

    private String configName;
    private int newAmount;
    private boolean newActive;
    private ConfigData configData;
    private Player player;
    private boolean cancelled;
    private HandlerList handlers = new HandlerList();

    @Override
    public void setCancelled(boolean b) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the name of the config file.
     *
     * @return {@link String}
     */
    public String getConfigName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the new amount thats been set.
     *
     * @return {@link Integer}
     */
    public int getNewAmount() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the new active status.
     *
     * @return {@link Boolean}
     */
    public boolean getNewActive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the data for the config option thats been changed.
     *
     * @return {@link ConfigData}
     */
    public ConfigData getConfigData() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player who has changed the config option.
     *
     * @return {@link Player}
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the event cancelled?
     *
     * @return {@link Boolean}
     */
    @Override
    public boolean isCancelled() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
