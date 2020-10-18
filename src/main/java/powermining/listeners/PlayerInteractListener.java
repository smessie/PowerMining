/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included LICENSE or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * This class is responsible for getting the BlockFace from which the player is breaking the block
 */

package powermining.listeners;

import java.util.HashMap;

import powermining.PowerMining;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
	public PowerMining plugin;
	private HashMap<String, BlockFace> faces = new HashMap<String, BlockFace>();

	public PlayerInteractListener(PowerMining plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
	public void saveBlockFace(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		BlockFace bf = event.getBlockFace();

		if (player != null && bf != null) {
			String name = player.getName();
			faces.put(name, bf);
		}
	}

	public BlockFace getBlockFaceByPlayerName(String name) {
		return faces.get(name);
	}
}
