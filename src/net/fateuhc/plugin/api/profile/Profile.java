package net.fateuhc.plugin.api.profile;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class Profile {

    public Profile(UUID uuid, String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void respawn(Player target, Player respawnedBy, int order) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
