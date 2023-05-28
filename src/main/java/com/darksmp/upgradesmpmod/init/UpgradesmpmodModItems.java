
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.item.ReinforcedironItem;
import com.darksmp.upgradesmpmod.item.ReinforcedIronArmorItem;
import com.darksmp.upgradesmpmod.item.LemonSeedsItem;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModItems {
	public static Item REINFORCEDIRON;
	public static Item REINFORCED_IRON_ARMOR_HELMET;
	public static Item REINFORCED_IRON_ARMOR_CHESTPLATE;
	public static Item REINFORCED_IRON_ARMOR_LEGGINGS;
	public static Item REINFORCED_IRON_ARMOR_BOOTS;
	public static Item REINFORCED_IRON_ORE_2_ORE;
	public static Item FUCKIN_LILAC;
	public static Item LEMON_SEEDS;
	public static Item LEMON_STAGE_0;
	public static Item LEMON_STAGE_1;

	public static void load() {
		REINFORCEDIRON = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcediron"), new ReinforcedironItem());
		REINFORCED_IRON_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_armor_helmet"), new ReinforcedIronArmorItem.Helmet());
		REINFORCED_IRON_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_armor_chestplate"), new ReinforcedIronArmorItem.Chestplate());
		REINFORCED_IRON_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_armor_leggings"), new ReinforcedIronArmorItem.Leggings());
		REINFORCED_IRON_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_armor_boots"), new ReinforcedIronArmorItem.Boots());
		REINFORCED_IRON_ORE_2_ORE = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforced_iron_ore_2_ore"),
				new BlockItem(UpgradesmpmodModBlocks.REINFORCED_IRON_ORE_2_ORE, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS)));
		FUCKIN_LILAC = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "fuckin_lilac"), new BlockItem(UpgradesmpmodModBlocks.FUCKIN_LILAC, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS)));
		LEMON_SEEDS = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_seeds"), new LemonSeedsItem());
		LEMON_STAGE_0 = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_stage_0"), new BlockItem(UpgradesmpmodModBlocks.LEMON_STAGE_0, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS)));
		LEMON_STAGE_1 = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_stage_1"), new BlockItem(UpgradesmpmodModBlocks.LEMON_STAGE_1, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS)));
	}
}
