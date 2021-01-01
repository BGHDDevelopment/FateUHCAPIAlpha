package net.fateuhc.plugin.api.managers;

import net.fateuhc.plugin.scenarios.Scenario;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

public class ScenariosManager {

    public List<Player> getNoMolesPlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<Player> getMolesPlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean isMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void removeMole(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Scenario getByName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Scenario getScenario(Scenario source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<Scenario> getEnabledScenarios() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<String> getEnabledScenariosNames() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void giveBuildUHCScenario(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleLobbyScenarios(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleCorona() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleRandomizer() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleLuckyRoulette(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    private boolean isBanned(Material type) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void handleScenarios(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
