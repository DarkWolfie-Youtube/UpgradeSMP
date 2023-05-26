
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.block.ReinforcedIronOreBlock;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModBlocks {
	public static Block REINFORCED_IRON_ORE;

	public static void load() {
		REINFORCED_IRON_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_ore"), new ReinforcedIronOreBlock());
	}

	public static void clientLoad() {
		ReinforcedIronOreBlock.clientInit();
	}
}
