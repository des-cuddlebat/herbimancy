package net.cuddlebat.herbimancy.herb;

public enum HerbType
{
    FUNGUS  ("Fungus"),
    GRAIN   ("Grain"),
    BERRY   ("Berry"),
    ROOT    ("Root"),
    BLOSSOM ("Blossom"),
    LEAF    ("Leaf"),
    STALK   ("Stalk");
	
	private String displayName;
	
	HerbType(String displayName)
	{
		this.displayName = displayName;
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
