
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.darksmp.upgradesmpmod.client.renderer.ShitskeleRenderer;
import com.darksmp.upgradesmpmod.client.renderer.MyCreeperRenderer;

@Environment(EnvType.CLIENT)
public class UpgradesmpmodModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(UpgradesmpmodModEntities.MY_CREEPER, MyCreeperRenderer::new);
		EntityRendererRegistry.register(UpgradesmpmodModEntities.SHITSKELE, ShitskeleRenderer::new);
	}
}
