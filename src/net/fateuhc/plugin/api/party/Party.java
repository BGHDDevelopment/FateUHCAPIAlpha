package net.fateuhc.plugin.api.party;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

public class Party {

    public Party(Player owner, int id) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean isAlive() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void increaseKills() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public static Party get(UUID uuid) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<String> toList() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void removePlayer(OfflinePlayer player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void addPlayer(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<UUID> getOnlinePlayers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<Player> getOnlineMembers() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void sendTeamMessage(String message, boolean usePrefix) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
