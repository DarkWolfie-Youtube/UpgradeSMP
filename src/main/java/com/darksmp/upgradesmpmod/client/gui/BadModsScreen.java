
package com.darksmp.upgradesmpmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import com.darksmp.upgradesmpmod.world.inventory.BadModsMenu;

public class BadModsScreen extends AbstractContainerScreen<BadModsMenu> {
	private final static HashMap<String, Object> guistate = BadModsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BadModsScreen(BadModsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 500;
		this.imageHeight = 500;
	}

	private static final ResourceLocation texture = new ResourceLocation("upgradesmpmod:textures/screens/bad_mods.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.upgradesmpmod.bad_mods.label_empty"), 156, 177, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.upgradesmpmod.bad_mods.label_one_of_the_3_mods_listed_below_a"), 129, 193, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.upgradesmpmod.bad_mods.label_xaerominimap_xaeroworldmap_jou"), 143, 208, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.upgradesmpmod.bad_mods.label_please_remove_these_mods"), 175, 226, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}

	public static void screenInit() {
	}
}
