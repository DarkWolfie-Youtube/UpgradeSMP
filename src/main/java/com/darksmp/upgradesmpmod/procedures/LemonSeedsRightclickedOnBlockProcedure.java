package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.Map;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class LemonSeedsRightclickedOnBlockProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("blockstate") == null) {
			if (!dependencies.containsKey("blockstate"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency blockstate for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency entity for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
		BlockState blockstate = (BlockState) dependencies.get("blockstate");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack seeds = ItemStack.EMPTY;
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState farmland = Blocks.AIR.defaultBlockState();
		seeds = new ItemStack(UpgradesmpmodModItems.LEMON_SEEDS);
		stage0 = UpgradesmpmodModBlocks.LEMON_STAGE_0.defaultBlockState();
		farmland = Blocks.FARMLAND.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == seeds.getItem()) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("" + blockstate)), (false));
		}
	}
}
