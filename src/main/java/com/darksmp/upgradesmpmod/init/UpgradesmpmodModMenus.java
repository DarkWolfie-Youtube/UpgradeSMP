
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModMenus {
	public static MenuType<BadModsMenu> BAD_MODS;

	public static void load() {
		BAD_MODS = Registry.register(Registry.MENU, new ResourceLocation(UpgradesmpmodMod.MODID, "bad_mods"), new ExtendedScreenHandlerType<>(BadModsMenu::new));
		BadModsScreen.screenInit();
	}
}
