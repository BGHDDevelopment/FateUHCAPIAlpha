/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.api.data.ScenarioData;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Called in EditScenariosMenu
 *
 * Is called when a scenario is toggled on/off
 */
@Getter
@Setter
public class ScenarioToggleEvent extends Event implements Cancellable {

    private static HandlerList handlers = new HandlerList();
    private Player player;
    private ScenarioData scenario;
    private boolean toEnable;
    private boolean cancelled;

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
     * Check if the event has been cancelled or not.
     *
     * @return {@link Boolean}
     */
    @Override
    public boolean isCancelled() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Change if the event is cancelled or not.
     *
     * @param b Should the event be cancelled?
     */
    @Override
    public void setCancelled(boolean b) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player who toggled the scenario.
     *
     * @return {@link Player} that toggled the scenario.
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the scenario data that was triggered
     *
     * @return {@link ScenarioData} of the scenario.
     */
    public ScenarioData getScenario() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the scenario getting enabled?
     *
     * @return {@link Boolean}
     */
    public boolean isToEnable() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
