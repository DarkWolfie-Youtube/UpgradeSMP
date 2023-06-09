
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.darksmp.upgradesmpmod.client.model.Modelcustom_model;

@Environment(EnvType.CLIENT)
public class UpgradesmpmodModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
