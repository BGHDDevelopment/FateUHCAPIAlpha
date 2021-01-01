/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

public class GameManager {

    /**
     * Used to get the UHCWorld center.
     *
     * @return Location for the UHCWorld center
     */
    public Location getUHCCenter() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to give a player the starter inventory.
     *
     * @param player Player's name
     */
    public void giveStarterInventory(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get the game type.
     *
     * @return GameType name
     */
    public String getGameType() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to give players a golden head.
     */
    public ItemStack getGoldenHead() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to send an Ore Alert.
     *
     * @param ore    Ore
     * @param player Player's name
     * @param amount Amount found
     */
    public void sendOreAlert(Block ore, Player player, int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to send a PvP alert.
     *
     * @param damager Damaging player
     * @param victim  Victim player
     */
    public void sendPvPAlert(Player damager, Player victim) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
