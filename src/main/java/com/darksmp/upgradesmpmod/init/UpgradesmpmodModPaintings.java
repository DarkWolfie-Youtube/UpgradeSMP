
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModPaintings {
	public static void load() {
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(UpgradesmpmodMod.MODID, "utensils"), new PaintingVariant(32, 32));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(UpgradesmpmodMod.MODID, "sunley_logo"), new PaintingVariant(32, 32));
	}
}
