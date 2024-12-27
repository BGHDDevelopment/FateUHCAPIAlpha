/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.utilties.uhc.timers.api;

import org.bukkit.plugin.IllegalPluginAccessException;

import java.text.DecimalFormat;

/**
 * The cooldown data.
 */
public class Cooldown {

    private long start;
    private long expire;
    private static DecimalFormat SECONDS_FORMAT;

    /**
     * Get when the cooldown started.
     *
     * @return {@link Long}
     */
    public long getStart() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get when the cooldown will expire.
     *
     * @return {@link Long}
     */
    public long getExpire() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get how many seconds are left.
     *
     * @return {@link DecimalFormat}
     */
    public DecimalFormat getSecondsFormat() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get is the time has passed.
     *
     * @return {@link Long}
     */
    public long getPassed() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the time that is remaining.
     *
     * @return {@link Long}
     */
    public long getRemaining() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Has the cooldown expired?
     *
     * @return {@link Boolean}
     */
    public boolean hasExpired() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount of seconds left.
     *
     * @return {@link Integer}
     */
    public int getSecondsLeft() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount of miliseconds left.
     *
     * @return {@link String}
     */
    public String getMiliSecondsLeft() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}