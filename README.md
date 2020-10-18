# PowerMining
Updated version of JodellePowerMining/PowerMining created by bloodyshade and previously updated by JodelleLover.

This plugin adds 2 new item types to the game: Hammer and Excavator.  
These were inspired by mDiyo's Tinker's Construct items of the same name.  

<br />

## Notable updates
Following updates were added by me (smessie) since I continued this plugin:
- Support for Netherite tools were added.

<br />

## Items
Both the Hammer and Excavator will dig in a 3x3 area around the target block.  
They take the block face in consideration to determine the breaking direction/pattern.  
You can sneak while breaking the block to make it work like a normal pickaxe/shovel.

**The Base Item determines what can be mined/dug and they won't break blocks if they are going to be destroyed and not drop anything.**

### Hammer
The Hammer is a mining tool much like the Pickaxe, and uses that as a base item for it's crafting.

### Excavator
The Excavator is a digging tool much like the Shovel, and uses that as a base item for it's crafting.

<br />

## Commands 
At this moment, there are no available commands for this plugin

<br />

## Permissions
- powermining.* : Grants all permissions (default: op)
  - powermining.highdurability: Allows player's Hammers/Excavators to use only 1 durability per use (default: true)
  - powermining.craft.* : Allows players to craft the Hammer and Excavator tools (default: op)
    - powermining.craft.hammer.* : Allows players to craft all hammers (default: op)
      - powermining.craft.hammer.wood: Allows players to craft the Wooden Hammer (default: false)
      - powermining.craft.hammer.stone: Allows players to craft the Stone Hammer (default: false)
      - powermining.craft.hammer.iron: Allows players to craft the Iron Hammer (default: false)
      - powermining.craft.hammer.gold: Allows players to craft the Golden Hammer (default: false)
      - powermining.craft.hammer.diamond: Allows players to craft the Diamond Hammer (default: false)
      - powermining.craft.hammer.netherite: Allows players to craft the Netherite Hammer (default: false)
    - powermining.craft.excavator.* : Allows players to craft all excavators (default: op)
      - powermining.craft.excavator.wood: Allows players to craft the Wooden Excavator (default: false)
      - powermining.craft.excavator.stone: Allows players to craft the Stone Excavator (default: false)
      - powermining.craft.excavator.iron: Allows players to craft the Iron Excavator (default: false)
      - powermining.craft.excavator.gold: Allows players to craft the Golden Excavator (default: false)
      - powermining.craft.excavator.diamond: Allows players to craft the Diamond Excavator (default: false)
      - powermining.craft.excavator.netherite: Allows players to craft the Netherite Excavator (default: false)
  - powermining.use.* : Allows players to use the Hammer and Excavator tools (default: op)
    - powermining.use.hammer.* : Allows players to use all hammers (default: op)
      - powermining.use.hammer.wood: Allows players to use the Wooden Hammer (default: false)
      - powermining.use.hammer.stone: Allows players to use the Stone Hammer (default: false)
      - powermining.use.hammer.iron: Allows players to use the Iron Hammer (default: false)
      - powermining.use.hammer.gold: Allows players to use the Golden Hammer (default: false)
      - powermining.use.hammer.diamond: Allows players to use the Diamond Hammer (default: false)
      - powermining.use.hammer.netherite: Allows players to use the Netherite Hammer (default: false)
    - powermining.use.excavator.* : Allows players to use all excavators (default: op)
      - powermining.use.excavator.wood: Allows players to use the Wooden Excavator (default: false)
      - powermining.use.excavator.stone: Allows players to use the Stone Excavator (default: false)
      - powermining.use.excavator.iron: Allows players to use the Iron Excavator (default: false)
      - powermining.use.excavator.gold: Allows players to use the Golden Excavator (default: false)
      - powermining.use.excavator.diamond: Allows players to use the Diamond Excavator (default: false)
      - powermining.use.excavator.netherite: Allows players to use the Netherite Excavator (default: false)
  - powermining.enchant.* : Allows players to enchant the Hammer and Excavator tools (default: op)
    - powermining.enchant.hammer.* : Allows players to enchant all hammers (default: op)
      - powermining.enchant.hammer.wood: Allows players to enchant the Wooden Hammer (default: false)
      - powermining.enchant.hammer.stone: Allows players to enchant the Stone Hammer (default: false)
      - powermining.enchant.hammer.iron: Allows players to enchant the Iron Hammer (default: false)
      - powermining.enchant.hammer.gold: Allows players to enchant the Golden Hammer (default: false)
      - powermining.enchant.hammer.diamond: Allows players to enchant the Diamond Hammer (default: false)
      - powermining.enchant.hammer.netherite: Allows players to enchant the Netherite Hammer (default: false)
    - powermining.enchant.excavator.* : Allows players to enchant all excavators (default: op)
      - powermining.enchant.excavator.wood: Allows players to enchant the Wooden Excavator (default: false)
      - powermining.enchant.excavator.stone: Allows players to enchant the Stone Excavator (default: false)
      - powermining.enchant.excavator.iron: Allows players to enchant the Iron Excavator (default: false)
      - powermining.enchant.excavator.gold: Allows players to enchant the Golden Excavator (default: false)
      - powermining.enchant.excavator.diamond: Allows players to enchant the Diamond Excavator (default: false)
      - powermining.enchant.excavator.netherite: Allows players to enchant the Netherite Excavator (default: false)
      
The group nodes also have alternate names:
- powermining.craft.all
- powermining.craft.hammer.all
- powermining.craft.excavator.all
- powermining.use.all
- powermining.use.hammer.all
- powermining.use.excavator.all
- powermining.enchant.all
- powermining.enchant.hammer.all
- powermining.enchant.excavator.all

**Please note that the enchant permission affects both enchantment tables and anvils (when applying books or trying to combine 2 power tools).**

<br />

## Installation
Simply put the jar file into your plugins folder.

<br />

## Configuration
Right now the config.yml file has the following values that can be changed:

- useDurabilityPerBlock
  - Description: Determines if durability is reduced with each broken block
  - Default: False
  - Version: 2.2
- Minable
  - Description: Define the blocks that can be mined by the hammer, and which quality of base pickaxe is needed (these are set according to the information on the minecraft wiki)
  - Version: 2.7.5
  - Type: Nested list
- Diggable
  - Description: Define the blocks that can be dug by the excavator
  - Version: 2.7.5
  - Type: Simple list

<br />

To add something to the Diggable list, just add a new list row to the existing list:
```YAML
Diggable:
- NEW_BLOCK
```
<br />

To add something to the Minable list, you need to add the target block as a new list row, but you also need to specify a list of pickaxes that can mine it:
```YAML
Minable:
- IRON_BLOCK: [STONE_PICKAXE, IRON_PICKAXE, DIAMOND_PICKAXE, NETHERITE_PICKAXE]
```

<br />

In case you want all hammers to be able to mine the specific block, use **[any]**  
**It's important to note that even if you only want one pickaxe to be able to mine it, it needs to be inside the list (look at the obsidian definition).**
