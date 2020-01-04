package net.cuddlebat.herbimancy.herb;

public enum HerbQuality
{
	NORMAL ("quality.herbimancy.normal", 10),
	POOR   ("quality.herbimancy.poor"  ,  5),
	RICH   ("quality.herbimancy.rich"  , 20),
	SYNTH  ("quality.herbimancy.synth" ,  5);
	
	private String id;
	private int yield;
	
	private HerbQuality(String id, int yield)
	{
		this.id = id;
		this.yield = yield;
	}
	
	public int getYield()
	{
		return yield;
	}
	
	public String getTranslationKey()
	{
		return id;
	}
}
