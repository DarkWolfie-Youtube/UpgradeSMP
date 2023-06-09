
package com.darksmp.upgradesmpmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;

public class ReinforcedirontoolsPickaxeItem extends PickaxeItem {
	public ReinforcedirontoolsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 98;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UpgradesmpmodModItems.REINFORCEDIRON));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
