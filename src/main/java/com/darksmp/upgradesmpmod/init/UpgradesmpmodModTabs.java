
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class UpgradesmpmodModTabs {
	public static CreativeModeTab TAB_ALLITEMS;

	public static void load() {
		TAB_ALLITEMS = FabricItemGroupBuilder.create(new ResourceLocation("upgradesmpmod", "allitems")).icon(() -> new ItemStack(Blocks.STONE)).build();
	}
}
