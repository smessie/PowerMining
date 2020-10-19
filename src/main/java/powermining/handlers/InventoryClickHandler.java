/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included LICENSE or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Handler class for the InventoryClickEvent Listener, used to create the listener and keep a reference to it
 */

package powermining.handlers;

import powermining.PowerMining;
import powermining.listeners.InventoryClickListener;

public class InventoryClickHandler {
	public InventoryClickHandler() {}
	public InventoryClickListener listener;

	public void Init(PowerMining plugin) {
		listener = new InventoryClickListener(plugin);
	}

	public InventoryClickListener getListener() {
		return listener;
	}
}
