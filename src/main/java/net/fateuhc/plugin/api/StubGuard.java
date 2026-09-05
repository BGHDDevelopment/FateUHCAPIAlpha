/*
 * Copyright (c) 2015-2025. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.api;

import org.bukkit.Bukkit;

import java.util.logging.Logger;

/**
 * Detects the classic misconfiguration: a third-party plugin shading the
 * FateUHC-API stub jar instead of depending on it with {@code provided}
 * (Maven) / {@code compileOnly} (Gradle) scope.
 *
 * The stub classes share fully-qualified names with the real classes inside
 * the FateUHC plugin. When the API jar is correctly provided-scope, these stub
 * classes never load on a server — the plugin supplies the real ones. If a
 * stub class DOES load while FateUHC is installed, it was shaded into another
 * plugin's jar and will shadow the real implementation for that plugin,
 * breaking its FateUHC integration. Every stub class calls
 * {@link #warnIfShaded(String)} from a static initializer so the mistake is
 * loudly reported the moment it can be detected.
 *
 * This class exists only in the API jar; it has no counterpart in the plugin.
 */
public final class StubGuard {

    private static volatile boolean warned = false;

    private StubGuard() {
    }

    public static void warnIfShaded(String stubClassName) {
        if (warned) {
            return;
        }
        try {
            if (Bukkit.getServer() != null && Bukkit.getPluginManager().getPlugin("FateUHC") != null) {
                warned = true;
                Logger.getLogger("FateUHC-API").severe(
                        "[FateUHC-API] Stub class " + stubClassName + " was loaded even though FateUHC is installed. "
                                + "The FateUHC-API dependency was SHADED into another plugin's jar; it must be "
                                + "'provided' (Maven) / 'compileOnly' (Gradle) scope. That plugin's FateUHC integration "
                                + "will fail with IllegalPluginAccessException until the shaded copy is removed.");
            }
        } catch (Throwable ignored) {
            // Not running on a Bukkit server (unit tests, doc tooling) - nothing to check.
        }
    }
}
