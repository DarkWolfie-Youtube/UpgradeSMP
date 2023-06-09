/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.darksmp.upgradesmpmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.darksmp.upgradesmpmod.init.UpgradesmpmodModTabs;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModSounds;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModProcedures;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModPaintings;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModItems;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModFeatures;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModEntities;
import com.darksmp.upgradesmpmod.init.UpgradesmpmodModBlocks;

public class UpgradesmpmodMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "upgradesmpmod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing UpgradesmpmodMod");
		UpgradesmpmodModTabs.load();

		UpgradesmpmodModEntities.load();
		UpgradesmpmodModBlocks.load();
		UpgradesmpmodModItems.load();

		UpgradesmpmodModFeatures.load();
		UpgradesmpmodModPaintings.load();
		UpgradesmpmodModProcedures.load();

		UpgradesmpmodModSounds.load();

	}
}
