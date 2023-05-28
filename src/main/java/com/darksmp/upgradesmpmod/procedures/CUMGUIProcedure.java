package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class CUMGUIProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure CUMGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof ServerPlayer _plrSlotItem ? _plrSlotItem.containerMenu.getSlot(0).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_HELMET
				&& (entity instanceof ServerPlayer _plrSlotItem ? _plrSlotItem.containerMenu.getSlot(1).getItem() : ItemStack.EMPTY).getItem() == UpgradesmpmodModItems.REINFORCEDIRON) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(UpgradesmpmodModItems.REINFORCED_IRON_ARMOR_HELMET);
				_setstack.setCount(1);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
