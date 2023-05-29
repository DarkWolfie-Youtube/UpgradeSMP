
package com.darksmp.upgradesmpmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModTabs;

public class LemonItem extends Item {
	public LemonItem() {
		super(new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
