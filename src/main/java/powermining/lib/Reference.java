/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included LICENSE or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Keeps a reference to several CONSTs used throughout the code
 */

package powermining.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Material;

public class Reference {
	public static HashMap<Material, ArrayList<Material>> MINABLE = new HashMap<>();

	public static ArrayList<Material> DIGGABLE = new ArrayList<>();

	public static ArrayList<Material> MINABLE_SILKTOUCH = new ArrayList<>(Arrays.asList(
			Material.STONE,
			Material.COAL_ORE,
			Material.REDSTONE_ORE,
			Material.LEGACY_GLOWING_REDSTONE_ORE,
			Material.LAPIS_ORE,
			Material.DIAMOND_ORE,
			Material.EMERALD_ORE,
			Material.ICE,
			Material.NETHER_QUARTZ_ORE,
			Material.GLOWSTONE
	));

	public static ArrayList<Material> DIGGABLE_SILKTOUCH = new ArrayList<>(Arrays.asList(
			Material.GRASS,
			Material.CLAY,
			Material.SNOW_BLOCK,
			Material.LEGACY_MYCEL,
			Material.GLOWSTONE
	));

	public static HashMap<Material, Material> MINABLE_FORTUNE;
	static {
		MINABLE_FORTUNE = new HashMap<>();

		MINABLE_FORTUNE.put(Material.COAL_ORE, Material.COAL);
		MINABLE_FORTUNE.put(Material.REDSTONE_ORE, Material.REDSTONE);
		MINABLE_FORTUNE.put(Material.LEGACY_GLOWING_REDSTONE_ORE, Material.REDSTONE);
		MINABLE_FORTUNE.put(Material.LAPIS_ORE, Material.LEGACY_INK_SACK);
		MINABLE_FORTUNE.put(Material.DIAMOND_ORE, Material.DIAMOND);
		MINABLE_FORTUNE.put(Material.EMERALD_ORE, Material.EMERALD);
		MINABLE_FORTUNE.put(Material.NETHER_QUARTZ_ORE, Material.QUARTZ);
		MINABLE_FORTUNE.put(Material.GLOWSTONE, Material.GLOWSTONE_DUST);
	}

	public static HashMap<Material, Material> DIGGABLE_FORTUNE;
	static {
		DIGGABLE_FORTUNE = new HashMap<>();

		DIGGABLE_FORTUNE.put(Material.GRAVEL, Material.FLINT);
		DIGGABLE_FORTUNE.put(Material.GLOWSTONE, Material.GLOWSTONE_DUST);
	}

	public static ArrayList<Material> PICKAXES = new ArrayList<>(Arrays.asList(
			Material.WOODEN_PICKAXE,
			Material.STONE_PICKAXE,
			Material.IRON_PICKAXE,
			Material.GOLDEN_PICKAXE,
			Material.DIAMOND_PICKAXE,
			Material.NETHERITE_PICKAXE
	));

	public static ArrayList<Material> SPADES = new ArrayList<>(Arrays.asList(
			Material.WOODEN_SHOVEL,
			Material.STONE_SHOVEL,
			Material.IRON_SHOVEL,
			Material.GOLDEN_SHOVEL,
			Material.DIAMOND_SHOVEL,
			Material.NETHERITE_SHOVEL
	));
}
