/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api.configuration;

import net.fateuhc.plugin.api.StubGuard;

/**
 * ConfigType
 */
public enum ConfigType {

    BOOLEAN, INTEGER;

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.api.configuration.ConfigType");
    }

}
