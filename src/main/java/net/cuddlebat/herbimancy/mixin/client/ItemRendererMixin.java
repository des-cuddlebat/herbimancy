package net.cuddlebat.herbimancy.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;

import net.cuddlebat.herbimancy.util.ItemDurabilityBar;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// This code is totally not yoinked from Tech Reborn what are you talking about,,,
@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin
{
	@Shadow
	protected abstract void renderGuiQuad(BufferBuilder bufferBuilder_1,
		int int_1, int int_2, int int_3, int int_4,
		int int_5, int int_6, int int_7, int int_8);

	@Inject(method = "renderGuiItemOverlay(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V", at = @At("HEAD"))
	private void renderGuiItemOverlay(TextRenderer textRenderer, ItemStack stack,
		int x, int y, String string, CallbackInfo info)
	{
		if (stack.getItem() instanceof ItemDurabilityBar)
		{
			ItemDurabilityBar barItem = (ItemDurabilityBar) stack.getItem();
			if (!barItem.shouldRenderDurabilityBar(stack))
			{
				return;
			}
			
			RenderSystem.disableDepthTest();
			RenderSystem.disableTexture();
			RenderSystem.disableAlphaTest();
			RenderSystem.disableBlend();

			BufferBuilder bufferBuilder = Tessellator.getInstance().getBuffer();

			int length = (int) (13 * (1 - Math.max(0.0F, barItem.getDurabilityAmount(stack))));
			int color = barItem.getDurabilityBarColor(stack);

			this.renderGuiQuad(bufferBuilder, x + 2, y + 13, 13, 2, 0, 0, 0, 255);
			this.renderGuiQuad(bufferBuilder, x + 2, y + 13, length, 1,
				color >> 16 & 255, color >> 8 & 255, color & 255, 255);

			RenderSystem.enableBlend();
			RenderSystem.enableAlphaTest();
			RenderSystem.enableTexture();
			RenderSystem.enableDepthTest();
		}
	}

}