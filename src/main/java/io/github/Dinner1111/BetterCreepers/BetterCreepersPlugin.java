package io.github.Dinner1111.BetterCreepers;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterCreepersPlugin extends JavaPlugin implements Listener {
	public void onEnable() {
		getLogger().info("Colorful creepers!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	public void onDisable() {
		getLogger().info("No colorful creeper explosions?");
	}
	@EventHandler
	public void spawnFirework(EntityExplodeEvent e) {
		if (e.getEntity() instanceof Creeper) {
			Firework fw = (Firework) e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), EntityType.FIREWORK);
			FireworkMeta fwm = fw.getFireworkMeta();
			fwm.setPower(1);
			fwm.addEffect(FireworkEffect.builder() 
					.with(Type.CREEPER)
					.withColor(Color.LIME, Color.AQUA, Color.GREEN)
					.build());
			fw.setFireworkMeta(fwm);
		}
	}
}