/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included LICENSE or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Handler class for the PlayerInteractEvent Listener, used to create the listener and keep a reference to it
 */

package powermining.handlers;

import powermining.PowerMining;
import powermining.listeners.PlayerInteractListener;

public class PlayerInteractHandler {
	public PlayerInteractHandler() {}
	public PlayerInteractListener listener;

	public void Init(PowerMining plugin) {
		listener = new PlayerInteractListener(plugin);
	}

	public PlayerInteractListener getListener() {
		return listener;
	}
}
