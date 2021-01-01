package net.fateuhc.plugin.api.managers;


import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

public class GameManager {

    public void setupJoinItems() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setupFlowerPowerBreakableBlocks() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setupFlowerPowerBannedBlocks() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setupSpectatorItems() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Location getUHCCenter() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void updateLocations() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void loadLocations() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void saveStarterInventory() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void updateStarterInventory(ItemStack[] contents) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void giveStarterInventory(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleItems(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleSpectatorItems(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public String getGameType() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void hideSpectators() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void hideSpectators(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemStack getGoldenHead() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean checkReloggedPlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemStack getExpBottleFromExp(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public int getLevelFromExpBottle(ItemStack item) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void sendOreAlert(Block ore, Player player, int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void sendPvPAlert(Player damager, Player victim) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void sendConfigInfo(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
