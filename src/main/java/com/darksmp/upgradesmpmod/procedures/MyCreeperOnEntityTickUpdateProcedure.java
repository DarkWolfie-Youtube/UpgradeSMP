package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.Map;

import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class MyCreeperOnEntityTickUpdateProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency world for procedure MyCreeperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency x for procedure MyCreeperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency y for procedure MyCreeperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency z for procedure MyCreeperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure MyCreeperOnEntityTickUpdate!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 8 && entity.isInWaterRainOrBubble()) {
			entity.clearFire();
		}
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 8) {
			entity.setSecondsOnFire(15);
		}
	}
}
