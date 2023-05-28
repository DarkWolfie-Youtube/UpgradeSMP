
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.client.gui.screens.MenuScreens;

import com.darksmp.upgradesmpmod.client.gui.CUMScreen;

public class UpgradesmpmodModScreens {
	public static void load() {
		MenuScreens.register(UpgradesmpmodModMenus.CUM, CUMScreen::new);
	}
}
