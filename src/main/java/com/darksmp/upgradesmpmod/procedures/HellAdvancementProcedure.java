package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class HellAdvancementProcedure {
	public HellAdvancementProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", handler.getPlayer());
			dependencies.put("x", handler.getPlayer().getX());
			dependencies.put("y", handler.getPlayer().getY());
			dependencies.put("z", handler.getPlayer().getZ());
			dependencies.put("world", handler.getPlayer().getLevel());
			execute(dependencies);
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure HellAdvancement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("upgradesmpmod:welcometohell"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
	}
}
