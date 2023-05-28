
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import com.darksmp.upgradesmpmod.world.inventory.CUMMenu;
import com.darksmp.upgradesmpmod.client.gui.CUMScreen;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModMenus {
	public static MenuType<CUMMenu> CUM;

	public static void load() {
		CUM = Registry.register(Registry.MENU, new ResourceLocation(UpgradesmpmodMod.MODID, "cum"), new ExtendedScreenHandlerType<>(CUMMenu::new));
		CUMScreen.screenInit();
	}
}
