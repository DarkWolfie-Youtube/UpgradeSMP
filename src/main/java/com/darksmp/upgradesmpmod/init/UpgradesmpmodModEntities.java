
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import com.darksmp.upgradesmpmod.entity.ShitskeleEntity;
import com.darksmp.upgradesmpmod.entity.MyCreeperEntity;
import com.darksmp.upgradesmpmod.UpgradesmpmodMod;

public class UpgradesmpmodModEntities {
	public static EntityType<MyCreeperEntity> MY_CREEPER;
	public static EntityType<ShitskeleEntity> SHITSKELE;

	public static void load() {
		MY_CREEPER = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(UpgradesmpmodMod.MODID, "my_creeper"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, MyCreeperEntity::new).dimensions(new EntityDimensions(0.6f, 1.7f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		MyCreeperEntity.init();
		FabricDefaultAttributeRegistry.register(MY_CREEPER, MyCreeperEntity.createAttributes());
		SHITSKELE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(UpgradesmpmodMod.MODID, "shitskele"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, ShitskeleEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ShitskeleEntity.init();
		FabricDefaultAttributeRegistry.register(SHITSKELE, ShitskeleEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
