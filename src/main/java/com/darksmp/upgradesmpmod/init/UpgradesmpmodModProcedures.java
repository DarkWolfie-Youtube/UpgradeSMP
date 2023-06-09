
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import com.darksmp.upgradesmpmod.procedures.ReinforcedIronOre2OreBlockDestroyedByPlayerProcedure;
import com.darksmp.upgradesmpmod.procedures.MyCreeperOnEntityTickUpdateProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonStage0UpdateTickProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonSeedsRightclickedOnBlockProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonSaplingAdditionalGenerationConditionProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonLeavesOnBlockRightClickedProcedure;
import com.darksmp.upgradesmpmod.procedures.HellAdvancementProcedure;
import com.darksmp.upgradesmpmod.procedures.GlowSwordLivingEntityIsHitWithToolProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class UpgradesmpmodModProcedures {
	public static void load() {
		new HellAdvancementProcedure();
		new LemonSeedsRightclickedOnBlockProcedure();
		new LemonStage0UpdateTickProcedure();
		new LemonLeavesOnBlockRightClickedProcedure();
		new LemonSaplingAdditionalGenerationConditionProcedure();
		new GlowSwordLivingEntityIsHitWithToolProcedure();
		new ReinforcedIronOre2OreBlockDestroyedByPlayerProcedure();
		new MyCreeperOnEntityTickUpdateProcedure();
	}
}
