/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.player.data;

import org.bukkit.plugin.IllegalPluginAccessException;

public class Settings {

    /**
     * Do they have XP Sounds enabled?
     *
     * @return {@link Boolean}
     */
    public boolean isXpSounds() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Do they have the scoreboard toggled?
     *
     * @return {@link Boolean}
     */
    public boolean isScoreboardToggle() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
