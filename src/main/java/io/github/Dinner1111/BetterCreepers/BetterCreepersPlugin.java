package io.github.Dinner1111.BetterCreepers;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterCreepersPlugin extends JavaPlugin {
    public void onEnable() {
        getLogger().info("Colorful creepers!");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new EventListener(), this);
    }
    public void onDisable() {
        getLogger().info("No colorful creeper explosions? Ok :(");
    }
}
