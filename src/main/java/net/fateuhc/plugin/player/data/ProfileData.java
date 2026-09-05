/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.player.data;

import net.fateuhc.plugin.api.StubGuard;
import net.fateuhc.plugin.player.stats.Stat;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProfileData {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.player.data.ProfileData");
    }

    /** Internal — constructed by the FateUHC plugin. */
    public ProfileData(UUID uuid, String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The keys of the stats tracked for a player.
     */
    public enum StatKey {
        KILLS("kills"),
        PRACTICE_KILLS("practiceKills"),
        DEATHS("deaths"),
        PRACTICE_DEATHS("practiceDeaths"),
        WINS("wins"),
        GAMES_PLAYED("gamesPlayed"),
        HIGHEST_KILL_STREAK("highestKillStreak"),
        POINTS("points"),
        GOLDEN_HEADS_EATEN("goldenHeadsEaten"),
        GOLDEN_APPLES_EATEN("goldenApplesEaten"),
        BOW_SHOTS("bowShots"),
        DIAMONDS_MINED("diamondsMined"),
        GOLD_MINED("goldMined"),
        EMERALDS_MINED("emeraldsMined"),
        IRON_MINED("ironMined"),
        REDSTONE_MINED("redstoneMined"),
        LAPIS_MINED("lapisMined"),
        COAL_MINED("coalMined"),
        QUARTZ_MINED("quartzMined"),
        SPAWNERS_MINED("spawnersMined");

        private final String key;

        StatKey(String key) {
            this.key = key;
        }

        /**
         * Get the storage key of the stat.
         *
         * @return {@link String}
         */
        public String getKey() {
            return key;
        }
    }

    /**
     * Get all tracked stats, keyed by {@link StatKey#getKey()}.
     *
     * @return {@link Map} of {@link String} and {@link Stat}
     */
    public Map<String, Stat> getStats() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get a stat by its storage key.
     *
     * @param key The storage key of the stat.
     * @return {@link Stat}
     */
    public Stat getStat(String key) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get a stat by its key.
     *
     * @param key The {@link StatKey} of the stat.
     * @return {@link Stat}
     */
    public Stat getStat(StatKey key) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's respawn data.
     *
     * @return {@link List} of {@link RespawnData}
     */
    public List<RespawnData> getRespawnData() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the respawn data with the given order.
     *
     * @param order The order of the respawn.
     * @return {@link RespawnData}
     */
    public RespawnData getRespawnDataByOrder(int order) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Reset all stats, alerts and settings to their defaults.
     */
    public void resetData() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Load the profile data from the storage backend.
     */
    public void load() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Save the profile data to the storage backend.
     */
    public void save() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the alerts settings.
     *
     * @return {@link Alerts}
     */
    public Alerts getAlerts() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's settings
     *
     * @return {@link Settings}
     */
    public Settings getSettings() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's UUID.
     *
     * @return {@link UUID}
     */
    public UUID getUuid() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's name.
     *
     * @return {@link String}
     */
    public String getPlayerName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
