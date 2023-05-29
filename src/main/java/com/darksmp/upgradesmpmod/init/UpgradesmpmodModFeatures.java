
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

import com.darksmp.upgradesmpmod.world.features.plants.LemonSaplingFeature;
import com.darksmp.upgradesmpmod.world.features.plants.FuckinLilacFeature;
import com.darksmp.upgradesmpmod.world.features.ores.ReinforcedIronOre2OreFeature;
import com.darksmp.upgradesmpmod.world.features.LemonTreeFeature;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModFeatures {
	public static void load() {
		register("reinforced_iron_ore_2_ore", ReinforcedIronOre2OreFeature.feature(), ReinforcedIronOre2OreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("fuckin_lilac", FuckinLilacFeature.feature(), FuckinLilacFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("lemon_tree", LemonTreeFeature.feature(), LemonTreeFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("lemon_sapling", LemonSaplingFeature.feature(), LemonSaplingFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(UpgradesmpmodMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(UpgradesmpmodMod.MODID, registryName)));
	}
}
