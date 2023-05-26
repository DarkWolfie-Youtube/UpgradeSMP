
package com.darksmp.upgradesmpmod.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;
import java.util.List;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;

public class ReinforcedIronOreFeature extends OreFeature {
	public static ReinforcedIronOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new ReinforcedIronOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("upgradesmpmod:reinforced_iron_ore", FEATURE, new OreConfiguration(ReinforcedIronOreFeatureRuleTest.INSTANCE, UpgradesmpmodModBlocks.REINFORCED_IRON_ORE.defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("upgradesmpmod:reinforced_iron_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-61), VerticalAnchor.absolute(0)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_dark")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_ocean")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("desert")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forest")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("grove")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("ice_spikes")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jagged_peaks")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jungle")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jungle")));

	public ReinforcedIronOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class ReinforcedIronOreFeatureRuleTest extends RuleTest {
		static final ReinforcedIronOreFeatureRuleTest INSTANCE = new ReinforcedIronOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<ReinforcedIronOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<ReinforcedIronOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("upgradesmpmod:reinforced_iron_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, RandomSource random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
