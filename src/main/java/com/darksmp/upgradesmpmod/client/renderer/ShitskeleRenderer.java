package com.darksmp.upgradesmpmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.darksmp.upgradesmpmod.entity.ShitskeleEntity;
import com.darksmp.upgradesmpmod.client.model.Modelcustom_model;

public class ShitskeleRenderer extends MobRenderer<ShitskeleEntity, Modelcustom_model<ShitskeleEntity>> {
	public ShitskeleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShitskeleEntity entity) {
		return new ResourceLocation("upgradesmpmod:textures/entities/skeleton.png");
	}
}
