
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.upgradesmpmod.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class UpgradesmpmodModSounds {
	public static SoundEvent LEMON_PLANTED = new SoundEvent(new ResourceLocation("upgradesmpmod", "lemon_planted"));
	public static SoundEvent BLUEMF = new SoundEvent(new ResourceLocation("upgradesmpmod", "bluemf"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("upgradesmpmod", "lemon_planted"), LEMON_PLANTED);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("upgradesmpmod", "bluemf"), BLUEMF);
	}
}
