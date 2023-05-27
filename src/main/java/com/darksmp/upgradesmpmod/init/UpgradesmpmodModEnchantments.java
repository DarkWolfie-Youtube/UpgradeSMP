
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.enchantment.ReinfocedDamageEnchantment;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModEnchantments {
	public static Enchantment REINFOCED_DAMAGE;

	public static void load() {
		REINFOCED_DAMAGE = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(UpgradesmpmodMod.MODID, "reinfoced_damage"), new ReinfocedDamageEnchantment());
	}
}
