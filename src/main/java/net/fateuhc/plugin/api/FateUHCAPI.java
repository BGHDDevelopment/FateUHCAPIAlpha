/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api;

import net.fateuhc.plugin.api.managers.*;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * The FateUHCAPI allows you to hook into FateUHC to either modify and grab data
 * or to add new features and events. Questions? https://bghddevelopment.com/discord
 */
@SuppressWarnings("unused")
public class FateUHCAPI {

    public static FateUHCAPI INSTANCE;

    /**
     * @return Is the FateUHCAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getProfileManager} method allows you to use settings inside the
     * profile management class. This gives you info on specs, settings, and more.
     *
     * @return {@link ProfileManager}
     */
    public ProfileManager getProfileManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This {@link #getTeamManager()} method allows you to grab data
     * about parties and manage them.
     *
     * @return {@link TeamManager}
     */
    public TeamManager getTeamManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This {@link #getConfigManager()} method allows you to grab saved
     * game configurations and save new ones.
     *
     * @return {@link ConfigManager}
     */
    public ConfigManager getConfigManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This {@link #getScenariosManager()} method allows you to modify most aspects
     * about scenarios. You can set mole player's, manually enable scenarios,
     * view current enabled scenarios, list all scenarios, and more.
     *
     * @return {@link ScenariosManager}
     */
    public ScenariosManager getScenariosManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getGameManager()} method allows you to modify almost all parts of the game.
     * You can grab game data including the mode, state, items, game inventories, and much more.
     *
     * @return {@link GameManager}
     */
    public GameManager getGameManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getWorldsManager()} method allows you to grab and modify
     * world names, settings, and game world loading.
     *
     * @return {@link WorldsManager}
     */
    public WorldsManager getWorldsManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getBorderManager()} method allows you to get border
     * settings and shrinks along with modifying values.
     *
     * @return {@link BorderManager}
     */
    public BorderManager getBorderManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getMongoManager()} method allows you to get the
     * stats and server databases to modify stats or game
     * settings directly via MongoDB.
     *
     * @return {@link MongoManager}
     */
    public MongoManager getMongoManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The {@link #getMySQLManager()} method allows you to get the
     * stats and server databases to modify stats or game
     * settings directly via MySQL.
     *
     * @return {@link MySQLManager}.
     */
    public MySQLManager getMySQLManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
