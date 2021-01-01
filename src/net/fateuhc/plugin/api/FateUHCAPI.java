/*
 * Copyright (c) 2015-2022. Stephan BH, BGHDDevelopment.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api;

import net.fateuhc.plugin.api.managers.*;
import net.fateuhc.plugin.api.states.GameState;
import net.fateuhc.plugin.api.states.PlayerState;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * The FateUHCAPI allows you to hook into FateUHC to either modify and grab data
 * or to add new features and events. Questions? https://bghddevelopment.com/discord
 */
public class FateUHCAPI {

    public static FateUHCAPI INSTANCE;

    /**
     * @return Is the FateUHCAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getProfileManager method allows you to use settings inside the
     * profile management class. This gives you info on specs, settings, and more.
     *
     * @return player's profile.
     */
    public ProfileManager getProfileManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This #getPartyManager method allows you to grab data
     * about parties and manage them.
     *
     * @return party manager.
     */
    public PartyManager getPartyManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This #getConfigManager method allows you to grab saved
     * game configurations and save new ones.
     *
     * @return config management.
     */
    public ConfigManager getConfigManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * This #getScenariosManager method allows you to modify most aspects
     * about scenarios. You can set mole player's, manually enable scenarios,
     * view current enabled scenarios, list all scenarios, and more.
     *
     * @return scenario manager.
     */
    public ScenariosManager getScenariosManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getGameManager method allows you to modify almost all parts of the game.
     * You can grab game data including the mode, state, items, game inventories, and much more.
     *
     * @return game manager.
     */
    public GameManager getGameManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getWorldManager method allows you to grab and modify
     * world names, settings, and game world loading.
     *
     * @return worlds manager.
     */
    public WorldsManager getWorldsManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getBorderManager method allows you to get border
     * settings and shrinks along with modifying values.
     *
     * @return border manager.
     */
    public BorderManager getBorderManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getMongoManager method allows you to get the
     * stats and server databases to modify stats or game
     * settings directly via MongoDB.
     *
     * @return mongo manager.
     */
    public MongoManager getMongoManager() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getGameState method can be used to get all values
     * in the GameState enum.
     *
     * @return GameState values.
     */
    public GameState[] getGameState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * The #getPlayerState method allows you to get all values
     * in the PlayerState enum.
     *
     * @return PlayerState values.
     */
    public PlayerState[] getPlayerState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}


