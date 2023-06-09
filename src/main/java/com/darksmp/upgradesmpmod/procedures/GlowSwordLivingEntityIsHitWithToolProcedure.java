package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.Map;

import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class GlowSwordLivingEntityIsHitWithToolProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure GlowSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1, (false), (false)));
	}
}
