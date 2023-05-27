
package com.darksmp.upgradesmpmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class ReinfocedDamageEnchantment extends Enchantment {
	public ReinfocedDamageEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMinLevel() {
		return 10;
	}

	@Override
	public int getMaxLevel() {
		return 48;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 20;
	}
}
