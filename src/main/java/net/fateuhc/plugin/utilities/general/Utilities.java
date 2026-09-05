package net.fateuhc.plugin.utilities.general;

import com.cryptomorin.xseries.XMaterial;
import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;

public class Utilities {

    public static XMaterial getMaterial(String source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public static XMaterial getMaterial(Material source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }


}
