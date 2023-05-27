package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

import java.util.Map;
import java.util.HashMap;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModEnchantments;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class EnchantmentDamageProcedure {
	public EnchantmentDamageProcedure() {
		ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, damageSource, amount) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", entity);
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", entity.level);
			dependencies.put("sourceentity", damageSource.getEntity());
			dependencies.put("immediatesourceentity", damageSource.getDirectEntity());
			dependencies.put("amount", amount);
			execute(dependencies);
			return true;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure EnchantmentDamage!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure EnchantmentDamage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof Player) {
			if (EnchantmentHelper.getItemEnchantmentLevel(UpgradesmpmodModEnchantments.REINFOCED_DAMAGE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), (false));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(UpgradesmpmodModEnchantments.REINFOCED_DAMAGE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), (false));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(UpgradesmpmodModEnchantments.REINFOCED_DAMAGE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), (false));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(UpgradesmpmodModEnchantments.REINFOCED_DAMAGE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 4) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), (false));
			}
		}
	}
}
