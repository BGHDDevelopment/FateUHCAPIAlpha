package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.configuration.Config;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

public class ConfigManager {

    public Config getConfigByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Config getConfig(Config source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<Config> getConfigurations() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setConfigurations(List<Config> configurations) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
