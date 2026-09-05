/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.states;

import net.fateuhc.plugin.api.StubGuard;

/**
 * Provides the possible GameStates
 */
public enum GameState {

    LOADING, LOBBY, STARTING, GAME, DEATHMATCH, ENDING;

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.states.GameState");
    }

}
