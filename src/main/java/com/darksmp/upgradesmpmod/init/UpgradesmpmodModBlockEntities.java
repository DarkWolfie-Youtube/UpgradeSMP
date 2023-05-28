
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import com.darksmp.upgradesmpmod.block.entity.CUMMACHIENeBlockEntity;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModBlockEntities {
	public static BlockEntityType<?> CUMMACHIE_NE;

	public static void load() {
		CUMMACHIE_NE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(UpgradesmpmodMod.MODID, "cummachie_ne"), FabricBlockEntityTypeBuilder.create(CUMMACHIENeBlockEntity::new, UpgradesmpmodModBlocks.CUMMACHIE_NE).build(null));
	}
}
