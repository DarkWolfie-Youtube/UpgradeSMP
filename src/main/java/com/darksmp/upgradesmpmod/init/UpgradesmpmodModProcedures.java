
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import com.darksmp.upgradesmpmod.procedures.ReinforcedIronOre2OreBlockDestroyedByPlayerProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonStage0UpdateTickProcedure;
import com.darksmp.upgradesmpmod.procedures.LemonSeedsRightclickedOnBlockProcedure;
import com.darksmp.upgradesmpmod.procedures.HellAdvancementProcedure;
import com.darksmp.upgradesmpmod.procedures.EnchantmentDamageProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class UpgradesmpmodModProcedures {
	public static void load() {
		new EnchantmentDamageProcedure();
		new HellAdvancementProcedure();
		new LemonSeedsRightclickedOnBlockProcedure();
		new LemonStage0UpdateTickProcedure();
		new ReinforcedIronOre2OreBlockDestroyedByPlayerProcedure();
	}
}
