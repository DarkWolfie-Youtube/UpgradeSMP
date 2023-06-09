
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.upgradesmpmod.item.ReinforcedirontoolsSwordItem;
import com.darksmp.upgradesmpmod.item.ReinforcedirontoolsShovelItem;
import com.darksmp.upgradesmpmod.item.ReinforcedirontoolsPickaxeItem;
import com.darksmp.upgradesmpmod.item.ReinforcedirontoolsHoeItem;
import com.darksmp.upgradesmpmod.item.ReinforcedirontoolsAxeItem;
import com.darksmp.upgradesmpmod.item.ReinforcedironItem;
import com.darksmp.upgradesmpmod.item.ReinforcedIronArmorItem;
import com.darksmp.upgradesmpmod.item.LemonSeedsItem;
import com.darksmp.upgradesmpmod.item.LemonItem;
import com.darksmp.upgradesmpmod.item.GlowSwordItem;
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
	public static Item LEMON_LEAVES;
	public static Item LEMON_SAPLING;
	public static Item LEMON;
	public static Item REINFORCEDIRONTOOLS_AXE;
	public static Item REINFORCEDIRONTOOLS_PICKAXE;
	public static Item REINFORCEDIRONTOOLS_SWORD;
	public static Item REINFORCEDIRONTOOLS_SHOVEL;
	public static Item REINFORCEDIRONTOOLS_HOE;
	public static Item GLOW_SWORD;
	public static Item MY_CREEPER_SPAWN_EGG;
	public static Item SHITSKELE_SPAWN_EGG;

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
		LEMON_LEAVES = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_leaves"), new BlockItem(UpgradesmpmodModBlocks.LEMON_LEAVES, new Item.Properties().tab(UpgradesmpmodModTabs.TAB_ALLITEMS)));
		LEMON_SAPLING = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon_sapling"), new BlockItem(UpgradesmpmodModBlocks.LEMON_SAPLING, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
		LEMON = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "lemon"), new LemonItem());
		REINFORCEDIRONTOOLS_AXE = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcedirontools_axe"), new ReinforcedirontoolsAxeItem());
		REINFORCEDIRONTOOLS_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcedirontools_pickaxe"), new ReinforcedirontoolsPickaxeItem());
		REINFORCEDIRONTOOLS_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcedirontools_sword"), new ReinforcedirontoolsSwordItem());
		REINFORCEDIRONTOOLS_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcedirontools_shovel"), new ReinforcedirontoolsShovelItem());
		REINFORCEDIRONTOOLS_HOE = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "reinforcedirontools_hoe"), new ReinforcedirontoolsHoeItem());
		GLOW_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "glow_sword"), new GlowSwordItem());
		MY_CREEPER_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "my_creeper_spawn_egg"),
				new SpawnEggItem(UpgradesmpmodModEntities.MY_CREEPER, -3355648, -16751002, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		SHITSKELE_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(UpgradesmpmodMod.MODID, "shitskele_spawn_egg"), new SpawnEggItem(UpgradesmpmodModEntities.SHITSKELE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	}
}
