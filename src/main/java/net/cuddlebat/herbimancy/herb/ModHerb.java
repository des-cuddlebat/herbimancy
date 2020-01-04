package net.cuddlebat.herbimancy.herb;

import net.cuddlebat.herbimancy.block.herb.HerbCrop;
import net.cuddlebat.herbimancy.item.herb.HerbFruit;
import net.cuddlebat.herbimancy.item.herb.HerbSeeds;

public class ModHerb
{
	private final HerbCrop crop;
	private final HerbCrop poorCrop;
	private final HerbCrop richCrop;
	private final HerbCrop synthCrop;
	
	private final HerbSeeds seeds;
	private final HerbSeeds poorSeeds;
	private final HerbSeeds richSeeds;
	private final HerbSeeds synthSeeds;
	
	private final HerbFruit fruit;
	private final HerbFruit poorFruit;
	private final HerbFruit richFruit;
	private final HerbFruit synthFruit;
	
	public ModHerb(HerbBuilder builder)
	{
		// yoink traits from the builder so that the constructor can use them
		
		crop       = new HerbCrop(builder.getBlockSettings(), this, HerbQuality.NORMAL);
		poorCrop   = new HerbCrop(builder.getBlockSettings(), this, HerbQuality.POOR  );
		richCrop   = new HerbCrop(builder.getBlockSettings(), this, HerbQuality.RICH  );
		synthCrop  = new HerbCrop(builder.getBlockSettings(), this, HerbQuality.SYNTH );

		seeds      = new HerbSeeds(builder.getItemSettings(), this, HerbQuality.NORMAL);
		poorSeeds  = new HerbSeeds(builder.getItemSettings(), this, HerbQuality.POOR  );
		richSeeds  = new HerbSeeds(builder.getItemSettings(), this, HerbQuality.RICH  );
		synthSeeds = new HerbSeeds(builder.getItemSettings(), this, HerbQuality.SYNTH );

		fruit      = new HerbFruit(builder.getItemSettings(), this, HerbQuality.NORMAL);
		poorFruit  = new HerbFruit(builder.getItemSettings(), this, HerbQuality.POOR  );
		richFruit  = new HerbFruit(builder.getItemSettings(), this, HerbQuality.RICH  );
		synthFruit = new HerbFruit(builder.getItemSettings(), this, HerbQuality.SYNTH );
	}

	public HerbCrop getCrop()
	{
		return crop;
	}

	public HerbCrop getPoorCrop()
	{
		return poorCrop;
	}

	public HerbCrop getRichCrop()
	{
		return richCrop;
	}

	public HerbCrop getSynthCrop()
	{
		return synthCrop;
	}

	public HerbSeeds getSeeds()
	{
		return seeds;
	}

	public HerbSeeds getPoorSeeds()
	{
		return poorSeeds;
	}

	public HerbSeeds getRichSeeds()
	{
		return richSeeds;
	}

	public HerbSeeds getSynthSeeds()
	{
		return synthSeeds;
	}

	public HerbFruit getFruit()
	{
		return fruit;
	}

	public HerbFruit getPoorFruit()
	{
		return poorFruit;
	}

	public HerbFruit getRichFruit()
	{
		return richFruit;
	}

	public HerbFruit getSynthFruit()
	{
		return synthFruit;
	}
	
//	public <T> T get(HerbQuality quality)
//	{
//		
//	}
}
