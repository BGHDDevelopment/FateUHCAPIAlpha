/*
 * Copyright (c) 2015-2022. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;


import lombok.Getter;
import lombok.Setter;
import net.fateuhc.plugin.api.scenarios.Scenario;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

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
    private Scenario scenario;
    private boolean toEnable;
    private boolean cancelled;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public ScenarioToggleEvent(Player player, Scenario scenario, boolean toEnable) {
        this.player = player;
        this.scenario = scenario;
        this.toEnable = toEnable;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Scenario getScenario() {
        return this.scenario;
    }

    public boolean isToEnable() {
        return this.toEnable;
    }
}
