
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import com.darksmp.upgradesmpmod.command.UpgradeCommand;

public class UpgradesmpmodModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			UpgradeCommand.register(dispatcher, commandBuildContext);
		});
	}
}
