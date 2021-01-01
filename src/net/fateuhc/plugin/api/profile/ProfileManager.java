package net.fateuhc.plugin.api.profile;

import net.fateuhc.plugin.player.Profile;
import net.fateuhc.plugin.states.PlayerState;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProfileManager {

    public void handleProfileCreation(UUID uuid, String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Profile getProfile(Object object) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean canSpectate(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public int getSpectatorRadius(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public List<Player> getPlayersInState(PlayerState playerState) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean isSpectator(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public boolean isHost(Player player) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setSpectating(Player player, Profile profile) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public Map<UUID, Profile> getProfiles() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void setProfiles(Map<UUID, Profile> profiles) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
