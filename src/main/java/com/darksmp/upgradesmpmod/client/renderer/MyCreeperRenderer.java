package com.darksmp.upgradesmpmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.darksmp.upgradesmpmod.entity.MyCreeperEntity;

public class MyCreeperRenderer extends MobRenderer<MyCreeperEntity, CreeperModel<MyCreeperEntity>> {
	public MyCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MyCreeperEntity entity) {
		return new ResourceLocation("upgradesmpmod:textures/entities/creeper.png");
	}
}
