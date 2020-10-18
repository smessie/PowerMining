/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included LICENSE or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Main Plugin class, responsible for initializing the plugin and it's respective systems, also keeps a reference to the handlers
 */

package powermining;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.bukkit.Material;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import powermining.handlers.BlockBreakHandler;
import powermining.handlers.CraftItemHandler;
import powermining.handlers.EnchantItemHandler;
import powermining.handlers.InventoryClickHandler;
import powermining.handlers.PlayerInteractHandler;
import powermining.lib.Reference;

import me.ryanhamshire.GriefPrevention.GriefPrevention;

import com.palmergames.bukkit.towny.Towny;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

public final class PowerMining extends JavaPlugin {
	PlayerInteractHandler handlerPlayerInteract;
	BlockBreakHandler handlerBlockBreak;
	CraftItemHandler handlerCraftItem;
	EnchantItemHandler handlerEnchantItem;
	InventoryClickHandler handlerInventoryClick;

	Plugin worldguard;
	Plugin griefprevention;
	Plugin towny;

	@Override
	public void onEnable(){
		handlerPlayerInteract = new PlayerInteractHandler();
		handlerBlockBreak = new BlockBreakHandler();
		handlerCraftItem = new CraftItemHandler();
		handlerEnchantItem = new EnchantItemHandler();
		handlerInventoryClick = new InventoryClickHandler();

		handlerPlayerInteract.Init(this);
		handlerBlockBreak.Init(this);
		handlerCraftItem.Init(this);
		handlerEnchantItem.Init(this);
		handlerInventoryClick.Init(this);

		worldguard = getServer().getPluginManager().getPlugin("WorldGuard");
		griefprevention = getServer().getPluginManager().getPlugin("GriefPrevention");
		towny = getServer().getPluginManager().getPlugin("Towny");

		this.saveDefaultConfig();

		getLogger().info("PowerMining plugin was enabled.");

		processConfig();
		getLogger().info("Finished processing config file.");
	}

	@Override
	public void onDisable() {
		getLogger().info("PowerMining plugin was disabled.");
	}


	public void processConfig() {
		try {
			for (Object x : (ArrayList<?>) getConfig().getList("Minable")) {
				LinkedHashMap<String, ArrayList> l = (LinkedHashMap<String, ArrayList>)x;

				for (String blockType: l.keySet()) {
					if (blockType == null || blockType.isEmpty())
						continue;

					if (Material.getMaterial(blockType) == null || Reference.MINABLE.containsKey(Material.getMaterial(blockType)))
						continue;

					Reference.MINABLE.put(Material.getMaterial(blockType), new ArrayList<Material>());
					ArrayList<Material> temp = Reference.MINABLE.get(Material.getMaterial(blockType));

					for (String hammerType: (ArrayList<String>)l.get(blockType)) {
						if (hammerType == null || hammerType.isEmpty())
							continue;

						if (hammerType.equals("any"))
							temp = null;

						if (hammerType != null && (Material.getMaterial(hammerType) == null ||
								(temp != null && temp.contains(Material.getMaterial(hammerType)))))
							continue;

						if (temp != null)
							temp.add(Material.getMaterial(hammerType));
					}

					Reference.MINABLE.put(Material.getMaterial(blockType), temp);
				}
			}
		}
		catch (NullPointerException e) {
			getLogger().info("NPE when trying to read the Minable list from the config file, check if it's set correctly!");
		}

		try {
			for (String blockType : getConfig().getStringList("Diggable")) {
				if (blockType == null || blockType.isEmpty())
					continue;

				if (Material.getMaterial(blockType) != null && ! Reference.DIGGABLE.contains(Material.getMaterial(blockType)))
					Reference.DIGGABLE.add(Material.getMaterial(blockType));
			}
		}
		catch (NullPointerException e) {
			getLogger().info("NPE when trying to read the Digable list from the config file, check if it's set correctly!");
		}
	}

	public PlayerInteractHandler getPlayerInteractHandler() {
		return handlerPlayerInteract;
	}

	public BlockBreakHandler getBlockBreakHandler() {
		return handlerBlockBreak;
	}

	public CraftItemHandler getCraftItemHandler() {
		return handlerCraftItem;
	}

	public EnchantItemHandler getEnchantItemHandler() {
		return handlerEnchantItem;
	}

	public InventoryClickHandler getInventoryClickHandler() {
		return handlerInventoryClick;
	}

	public WorldGuardPlugin getWorldGuard() {
		return (WorldGuardPlugin) worldguard;
	}

	public GriefPrevention getGriefPrevention() {
		return (GriefPrevention) griefprevention;
	}

	public Towny getTowny() {
		return (Towny) towny;
	}
}
