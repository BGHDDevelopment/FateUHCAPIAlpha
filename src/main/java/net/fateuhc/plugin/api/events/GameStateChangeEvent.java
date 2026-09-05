package net.fateuhc.plugin.api.events;

import net.fateuhc.plugin.api.states.GameState;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

/**
 * Is called when the GameState is changed.
 */
public class GameStateChangeEvent extends Event {

    private GameState newGameState;
    private static final HandlerList handlers = new HandlerList();

    public GameStateChangeEvent(GameState newGameState) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the new GameState.
     *
     * @return {@link Boolean}
     */
    public GameState getNewGameState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    @NotNull
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

}