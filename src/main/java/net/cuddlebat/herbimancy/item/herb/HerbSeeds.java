package net.cuddlebat.herbimancy.item.herb;

import net.cuddlebat.herbimancy.block.herb.HerbCrop;
import net.cuddlebat.herbimancy.herb.HerbQuality;
import net.cuddlebat.herbimancy.herb.ModHerb;
import net.cuddlebat.herbimancy.util.ItemDurabilityBar;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HerbSeeds extends AliasedBlockItem implements ItemDurabilityBar
{
	private final ModHerb herb;
	private final HerbQuality quality;
	
	public HerbSeeds(Item.Settings settings, HerbCrop crop, ModHerb herb, HerbQuality quality)
	{
		super(crop, settings);
		this.herb = herb;
		this.quality = quality;
	}

	@Override
	public boolean hasEnchantmentGlint(ItemStack stack)
	{
		return quality == HerbQuality.RICH;
	}

	public ModHerb getHerb()
	{
		return herb;
	}

	public HerbQuality getQuality()
	{
		return quality;
	}

	@Override
	public boolean shouldRenderDurabilityBar(ItemStack stack)
	{
		return quality == HerbQuality.POOR || quality == HerbQuality.SYNTH;
	}

	@Override
	public int getDurabilityBarColor(ItemStack stack)
	{
		if(quality == HerbQuality.POOR)
			return 0x7F0000;
		if(quality == HerbQuality.SYNTH)
			return 0xFFFFFF;
		return 0;
	}

	@Override
	public float getDurabilityAmount(ItemStack stack)
	{
		return quality == HerbQuality.POOR || quality == HerbQuality.SYNTH ? 1.0f : 0.0f;
	}
}
