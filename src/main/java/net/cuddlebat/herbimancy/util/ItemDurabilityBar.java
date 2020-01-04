package net.cuddlebat.herbimancy.util;

import net.minecraft.item.ItemStack;

public interface ItemDurabilityBar
{
	public boolean shouldRenderDurabilityBar(ItemStack stack);

	public int getDurabilityBarColor(ItemStack stack);

	public float getDurabilityAmount(ItemStack stack);
}
