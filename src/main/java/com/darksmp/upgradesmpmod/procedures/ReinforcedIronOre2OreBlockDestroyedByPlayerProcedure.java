package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.Map;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class ReinforcedIronOre2OreBlockDestroyedByPlayerProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure ReinforcedIronOre2OreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == UpgradesmpmodModItems.REINFORCEDIRONTOOLS_PICKAXE
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_PICKAXE) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(UpgradesmpmodModBlocks.REINFORCED_IRON_ORE_2_ORE);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
