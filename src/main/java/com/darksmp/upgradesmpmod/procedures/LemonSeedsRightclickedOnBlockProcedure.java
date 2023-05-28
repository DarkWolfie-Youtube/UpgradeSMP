package com.darksmp.upgradesmpmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import java.util.Map;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModSounds;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class LemonSeedsRightclickedOnBlockProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency world for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency x for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency y for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UpgradesmpmodMod.LOGGER.warn("Failed to load dependency z for procedure LemonSeedsRightclickedOnBlock!");
			return;
		}
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
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		BlockState blockstate = (BlockState) dependencies.get("blockstate");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack seeds = ItemStack.EMPTY;
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState farmland = Blocks.AIR.defaultBlockState();
		String isRunning = "";
		seeds = new ItemStack(UpgradesmpmodModItems.LEMON_SEEDS);
		stage0 = UpgradesmpmodModBlocks.LEMON_STAGE_0.defaultBlockState();
		farmland = Blocks.FARMLAND.defaultBlockState();
		if ((isRunning).equals("true") == false && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == seeds.getItem()) {
			isRunning = "true";
			if (farmland.getBlock() == blockstate.getBlock() && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				{
					BlockPos _bp = new BlockPos(x, y + 1, z);
					BlockState _bs = stage0;
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(UpgradesmpmodModItems.LEMON_SEEDS);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), UpgradesmpmodModSounds.LEMON_PLANTED, SoundSource.MASTER, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, UpgradesmpmodModSounds.LEMON_PLANTED, SoundSource.MASTER, 1, 1, false);
					}
				}
				isRunning = "false";
			}
		}
	}
}
