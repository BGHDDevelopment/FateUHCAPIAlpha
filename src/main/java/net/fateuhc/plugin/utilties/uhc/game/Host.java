/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.utilties.uhc.game;

import net.fateuhc.plugin.player.Profile;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class Host {

    private Profile profile;
    private UUID uuid;
    private Player player;
    private String name;

    public Host(Profile profile, UUID uuid, Player player, String name) {
        this.profile = profile;
        this.uuid = uuid;
        this.player = player;
        this.name = name;
    }

    /**
     * Get the {@link Profile} of the host.
     *
     * @return {@link Profile} of the host.
     */
    public Profile getProfile() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the {@link UUID} of the host.
     *
     * @return {@link UUID} of the host
     */
    public UUID getUuid() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the {@link Player} for the host.
     *
     * @return {@link Player} for the host.
     */
    public Player getPlayer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the name of the host.
     *
     * @return {@link String} of the host's name.
     */
    public String getName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Check if the host is online.
     *
     * @return {@link Boolean}
     */
    public boolean isOnline() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
