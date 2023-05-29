
package com.darksmp.upgradesmpmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvent;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModTabs;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModSounds;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;

public abstract class ReinforcedIronArmorItem extends ArmorItem {
	public ReinforcedIronArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 8, 11, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 35;
			}

			@Override
			public SoundEvent getEquipSound() {
				return UpgradesmpmodModSounds.BLUEMF;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UpgradesmpmodModItems.REINFORCEDIRON));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "iron_";
			}

			@Override
			public float getToughness() {
				return 5.199999999999999f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ReinforcedIronArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS));
		}

	}

	public static class Chestplate extends ReinforcedIronArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS));
		}

	}

	public static class Leggings extends ReinforcedIronArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS));
		}

	}

	public static class Boots extends ReinforcedIronArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS));
		}

	}
}
