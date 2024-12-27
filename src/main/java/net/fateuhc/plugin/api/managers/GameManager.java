/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.states.GameState;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class GameManager {

    /**
     * Retrieves the center location of the UHC game.
     *
     * @return The center location of the UHC game.
     */
    public Location getUHCCenter() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Gives the starter inventory to the specified player.
     *
     * @param player The player to give the starter inventory to.
     */
    public void giveStarterInventory(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the type of the game.
     *
     * @return The type of the game as a string.
     */
    public String getGameType() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the golden head ItemStack from the UHC GameManager.
     *
     * @return The golden head ItemStack.
     */
    public ItemStack getGoldenHead() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Sends an ore alert to the specified player.
     *
     * @param ore    The block representing the ore that was mined.
     * @param player The player who mined the ore.
     * @param amount The amount of ore that was mined.
     */
    public void sendOreAlert(Block ore, Player player, int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Sends a Player versus Player (PvP) alert to the game manager.
     *
     * @param damager The player who attacked another player.
     * @param victim  The player who was attacked.
     */
    public void sendPvPAlert(Player damager, Player victim) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Returns the current status of Player versus Player (PvP) in the UHC game.
     *
     * @return {@code true} if PvP is enabled, {@code false} otherwise.
     */
    public boolean isPVP() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Checks if the game is currently running or in the starting state.
     *
     * @return {@code true} if the game is running or in the starting state, {@code false} otherwise.
     */
    public boolean isRunning() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Checks if the game is currently in progress.
     *
     * @return {@code true} if the game is in progress, {@code false} otherwise.
     */
    public boolean isGame() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the current state of the UHC game.
     *
     * @return The current state of the UHC game as a GameState object.
     */
    public GameState getGameState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Handles the items for the specified player.
     * This method delegates the handling of items to the GameManager class in the UHC instance.
     *
     * @param player The player for whom to handle the items.
     */
    public void handleItems(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Handles the spectator items for the specified player.
     * This method delegates the handling of items to the GameManager class in the UHC instance.
     *
     * @param player The player for whom to handle the spectator items.
     */
    public void handleSpectatorItems(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the host of the UHC game.
     */
    public void getHost() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Retrieves the winner of the UHC game.
     */
    public void getWinner() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
