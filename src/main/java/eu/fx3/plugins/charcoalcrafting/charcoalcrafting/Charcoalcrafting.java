package eu.fx3.plugins.charcoalcrafting.charcoalcrafting;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Charcoalcrafting extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin statup message
        getLogger().info("Plugin wird initialisiert...");

        // Create crafting result
        ItemStack coalblock = new ItemStack(Material.COAL_BLOCK);

        // Create unique key & crafting recipe
        NamespacedKey recipeKey = new NamespacedKey(getPlugin(this.getClass()), "coalblock_from_charcoal");
        ShapedRecipe coalblockRecipe = new ShapedRecipe(recipeKey, coalblock);

        // Set crafting recipe
        coalblockRecipe.shape("***", "***", "***");
        coalblockRecipe.setIngredient('*', Material.CHARCOAL);

        // Add recipe to server
        getServer().addRecipe(coalblockRecipe);

        // Send success message
        getLogger().info(ChatColor.GREEN + "Plugin wurde initialisiert!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin entladen!");
    }
}
