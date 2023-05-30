
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.client.gui.screens.MenuScreens;

public class UpgradesmpmodModScreens {
	public static void load() {
		MenuScreens.register(UpgradesmpmodModMenus.BAD_MODS, BadModsScreen::new);
	}
}
