package net.fateuhc.plugin.api.managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

public class BorderManager {

    public void startBorderShrink() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public String getBorderInfo() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void checkBorder(Player player, int size) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
