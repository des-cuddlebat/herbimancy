package net.cuddlebat.herbimancy.herb;

public enum HerbRarity
{
	PLENTIFUL (3.0, "Plentiful"),
	COMMON    (2.0, "Common"),
	UNCOMMON  (1.5, "Uncommon"),
	RARE      (1.0, "Rare");
	
	private double weight;
	private String displayName;
	
	HerbRarity(double w, String displayName)
	{
		weight = w;
		this.displayName = displayName;
	}

	public double getWeight()
	{
		return weight;
	}

	public String getDisplayName()
	{
		return displayName;
	}
    
	@Override
	public String toString()
	{
		return displayName;
	}
}
