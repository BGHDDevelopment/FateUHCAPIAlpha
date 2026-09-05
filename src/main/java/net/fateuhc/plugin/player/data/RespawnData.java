package net.fateuhc.plugin.player.data;

import lombok.Data;
import net.fateuhc.plugin.api.StubGuard;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Data
public class RespawnData {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.player.data.RespawnData");
    }

    private ItemStack[] inventory;
    private ItemStack[] armor;
    private Location location;
    private int order;
    private int expLevel;
    private boolean used = false;
    private String respawnDate, deathMessage;
    private String usedBy;
    private String reason;
    private transient List<TrackedDeathDrop> trackedDeathDrops;


    public boolean isLast(ProfileData profileData) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public void trackDeathDrop(Item item, int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public int removeTrackedDeathDrops() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    private static final class TrackedDeathDrop {
        private final Item item;
        private final int amount;

        private TrackedDeathDrop(Item item, int amount) {
            throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
        }
    }
}