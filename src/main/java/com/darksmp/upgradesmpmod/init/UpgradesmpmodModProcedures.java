
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import com.darksmp.upgradesmpmod.procedures.LemonStage0UpdateTickProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonSeedsRightclickedOnBlockProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonLeavesOnBlockRightClickedProcedure;
import com.darksmp.upgradesmpmod.procedures.HellAdvancementProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class UpgradesmpmodModProcedures {
	public static void load() {
		new HellAdvancementProcedure();
		new LemonSeedsRightclickedOnBlockProcedure();
		new LemonStage0UpdateTickProcedure();
		new LemonLeavesOnBlockRightClickedProcedure();
	}
}
