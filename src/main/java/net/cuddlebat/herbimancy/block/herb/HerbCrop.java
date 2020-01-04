package net.cuddlebat.herbimancy.block.herb;

import net.cuddlebat.herbimancy.herb.HerbQuality;
import net.cuddlebat.herbimancy.herb.ModHerb;
import net.minecraft.block.Block;

public class HerbCrop extends Block
{
	private final ModHerb herb;
	private final HerbQuality quality;
	
	public HerbCrop(Block.Settings settings, ModHerb herb, HerbQuality quality)
	{
		super(settings);
		this.herb = herb;
		this.quality = quality;
	}

	public ModHerb getHerb()
	{
		return herb;
	}

	public HerbQuality getQuality()
	{
		return quality;
	}
}
