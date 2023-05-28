
package com.darksmp.upgradesmpmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import com.darksmp.upgradesmpmod.procedures.LemonSeedsRightclickedOnBlockProcedure;

public class LemonSeedsItem extends Item {
	public LemonSeedsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		LemonSeedsRightclickedOnBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", context.getLevel()).put("x", context.getClickedPos().getX()).put("y", context.getClickedPos().getY())
				.put("z", context.getClickedPos().getZ()).put("blockstate", context.getLevel().getBlockState(context.getClickedPos())).put("entity", context.getPlayer()).build());
		return retval;
	}
}
