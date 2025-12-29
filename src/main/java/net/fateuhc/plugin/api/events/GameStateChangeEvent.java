/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.api.states.GameState;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

public class GameStateChangeEvent extends Event {

    private GameState gameState;
    private GameState oldGameState;
    private HandlerList handlers = new HandlerList();

    /**
     *  Get the new game state.
     *
     * @return {@link GameState} of the new state.
     */
    public GameState getGameState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     *  Get the old game stage.
     *
     * @return {@link GameState} of the old state.
     */
    public GameState getOldGameState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
