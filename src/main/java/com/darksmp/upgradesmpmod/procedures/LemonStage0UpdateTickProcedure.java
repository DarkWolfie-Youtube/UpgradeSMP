package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class LemonStage0UpdateTickProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency world for procedure LemonStage0UpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency x for procedure LemonStage0UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency y for procedure LemonStage0UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency z for procedure LemonStage0UpdateTick!");
			return;
		}
		if (dependencies.get("blockstate") == null) {
			if (!dependencies.containsKey("blockstate"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency blockstate for procedure LemonStage0UpdateTick!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		BlockState blockstate = (BlockState) dependencies.get("blockstate");
		BlockState b0 = Blocks.AIR.defaultBlockState();
		BlockState b2 = Blocks.AIR.defaultBlockState();
		BlockState b1 = Blocks.AIR.defaultBlockState();
		BlockState planted_block = Blocks.AIR.defaultBlockState();
		b0 = UpgradesmpmodModBlocks.LEMON_STAGE_0.defaultBlockState();
		b1 = UpgradesmpmodModBlocks.LEMON_STAGE_1.defaultBlockState();
		b2 = UpgradesmpmodModBlocks.LEMON_STAGE_2.defaultBlockState();
		planted_block = (world.getBlockState(new BlockPos(x, y - 1, z)));
		if (Math.random() < 0.7) {
			if ((planted_block.getBlock() == Blocks.FARMLAND) == false) {
				world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(UpgradesmpmodModBlocks.LEMON_STAGE_0.defaultBlockState()));
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else {
				if (Math.random() < 0.7 && blockstate == b0) {
					world.setBlock(new BlockPos(x, y, z), UpgradesmpmodModBlocks.LEMON_STAGE_1.defaultBlockState(), 3);
				}
				if (Math.random() < 0.5 && blockstate == b1) {
					world.setBlock(new BlockPos(x, y, z), UpgradesmpmodModBlocks.LEMON_STAGE_2.defaultBlockState(), 3);
				}
				if (Math.random() < 0.3 && blockstate == b2) {
					world.setBlock(new BlockPos(x, y, z), UpgradesmpmodModBlocks.LEMON_STAGE_0.defaultBlockState(), 3);
				}
			}
		}
	}
}
