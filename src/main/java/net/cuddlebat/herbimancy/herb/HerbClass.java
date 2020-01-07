package net.cuddlebat.herbimancy.herb;

public enum HerbClass
{
	POISONOUS ("Poisonous"),
    ANCIENT   ("Ancient"),
    CELESTIAL ("Celestial"),
    ORDINARY  ("Ordinary"),
    ELEMENTAL ("Elemental"),
    MATERIAL  ("Material"),
    SINISTER  ("Sinister");
	
	private String displayName;
	
	HerbClass(String displayName)
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
