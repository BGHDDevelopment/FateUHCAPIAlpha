package net.fateuhc.plugin.utilities.uhc.items;

import com.cryptomorin.xseries.XMaterial;
import net.fateuhc.plugin.api.StubGuard;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ItemBuilder {

    static {
        StubGuard.warnIfShaded("net.fateuhc.plugin.utilities.uhc.items.ItemBuilder");
    }

    private ItemStack is;
    private static Method SET_CUSTOM_MODEL_DATA;

    public static XMaterial getMaterial(String source) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder(Material m) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    private static Material getValidMaterial(Material m) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder(ItemStack is) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder(Material m, int amount) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder(Material m, int amount, byte durability) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder clone() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setDurability(short dur) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setDurability(int dur) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setName(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setNameWithArrows(String name) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addUnsafeEnchantment(Enchantment ench, int level) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder removeEnchantment(Enchantment ench) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addEnchant(Enchantment ench, int level) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addEnchantment(Enchantment ench, int level) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addEnchantments(Map<Enchantment, Integer> enchantments) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setLore(String... lore) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setLore(List<String> lore) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder removeLoreLine(String line) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder removeLoreLine(int index) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addLoreLine(String line) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder addLoreLine(String line, int pos) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setCustomModelDataInt(int data) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    private static Method META_GET_CMD_COMPONENT; // getCustomModelDataComponent()
    private static Method META_SET_CMD_COMPONENT; // setCustomModelDataComponent(CustomModelDataComponent)
    private static Method CMD_GET_STRINGS;        // component.getStrings()
    private static Method CMD_SET_STRINGS;        // component.setStrings(List)

    public ItemBuilder setCustomModelDataString(String id, boolean replace) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemBuilder setCustomModelData(String id) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Accepts the traditional integer CustomModelData value and the string
     * model identifiers introduced by newer Minecraft versions.
     */
    public ItemBuilder setConfiguredCustomModelData(String configuredValue) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    // ----------------------------
    // Added: ItemFlags helper (safe)
    // ----------------------------
    public ItemBuilder addItemFlags(ItemFlag... flags) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    public ItemStack toItemStack() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }
}
