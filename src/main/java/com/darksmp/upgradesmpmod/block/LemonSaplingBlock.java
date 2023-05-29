
package com.darksmp.upgradesmpmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

import com.darksmp.upgradesmpmod.procedures.LemonStage0UpdateTickProcedure;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;

public class LemonSaplingBlock extends FlowerBlock {
	public LemonSaplingBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission());
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(UpgradesmpmodModItems.LEMON_SEEDS));
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		LemonStage0UpdateTickProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", pos.getX()).put("y", pos.getY()).put("z", pos.getZ()).put("world", world).build());
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(UpgradesmpmodModBlocks.LEMON_SAPLING, RenderType.cutoutMipped());
	}
}
