
package com.darksmp.upgradesmpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModTabs;

public class ReinforcedironItem extends Item {
	public ReinforcedironItem() {
		super(new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
