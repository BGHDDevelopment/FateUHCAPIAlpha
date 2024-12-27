/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.player.stats;

import org.bukkit.plugin.IllegalPluginAccessException;

public class Stat {

    private int amount;

    /**
     * Get the amount for the stat.
     *
     * @return {@link Integer}
     */
    public int getAmount() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}

