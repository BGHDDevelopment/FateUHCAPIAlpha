/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.api.configuration.Config;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

public class ConfigManager {

    /**
     * Used to get a game configuration.
     *
     * @param name Config Name
     * @return Config
     */
    public Config getConfigByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a game configuration.
     *
     * @param source
     * @return Config
     */
    public Config getConfig(Config source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to get a list of configurations.
     *
     * @return List of configurations
     */
    public List<Config> getConfigurations() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Used to set configurations.
     *
     * @param configurations
     */
    public void setConfigurations(List<Config> configurations) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
