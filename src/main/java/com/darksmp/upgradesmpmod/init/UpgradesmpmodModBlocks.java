
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.block.ReinforcedIronOre2OreBlock;
import com.darksmp.upgradesmpmod.block.LemonStage1Block;
import com.darksmp.upgradesmpmod.block.LemonStage0Block;
import com.darksmp.upgradesmpmod.block.FuckinLilacBlock;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModBlocks {
	public static Block REINFORCED_IRON_ORE_2_ORE;
	public static Block FUCKIN_LILAC;
	public static Block LEMON_STAGE_0;
	public static Block LEMON_STAGE_1;

	public static void load() {
		REINFORCED_IRON_ORE_2_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_ore_2_ore"), new ReinforcedIronOre2OreBlock());
		FUCKIN_LILAC = Registry.register(Registry.BLOCK, new ResourceLocation(UpgradesmpmodMod.MODID, "fuckin_lilac"), new FuckinLilacBlock());
		LEMON_STAGE_0 = Registry.register(Registry.BLOCK, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_stage_0"), new LemonStage0Block());
		LEMON_STAGE_1 = Registry.register(Registry.BLOCK, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_stage_1"), new LemonStage1Block());
	}

	public static void clientLoad() {
		ReinforcedIronOre2OreBlock.clientInit();
		FuckinLilacBlock.clientInit();
		LemonStage0Block.clientInit();
		LemonStage1Block.clientInit();
	}
}
