package net.cuddlebat.herbimancy.herb;

public enum HerbTraits implements HerbTrait
{
	WARM_PREF         ("pref.herbimancy.warm"        ,  1,  0,  0),
	COLD_PREF         ("pref.herbimancy.cold"        , -1,  0,  0),
	HUMID_PREF        ("pref.herbimancy.humid"       ,  0,  1,  0),
	ARID_PREF         ("pref.herbimancy.arid"        ,  0, -1,  0),
	HIGH_PREF         ("pref.herbimancy.high"        ,  0,  0,  1),
	LOW_PREF          ("pref.herbimancy.low"         ,  0,  0, -1),
	STRONG_WARM_PREF  ("pref.herbimancy.strong_warm" ,  3,  0,  0),
	STRONG_COLD_PREF  ("pref.herbimancy.strong_cold" , -3,  0,  0),
	STRONG_HUMID_PREF ("pref.herbimancy.strong_humid",  0,  3,  0),
	STRONG_ARID_PREF  ("pref.herbimancy.strong_arid" ,  0, -3,  0),
	STRONG_HIGH_PREF  ("pref.herbimancy.strong_high" ,  0,  0,  3),
	STRONG_LOW_PREF   ("pref.herbimancy.strong_low"  ,  0,  0, -3);
	
	private static final double LOW_TEMP  = 0.35;	
	private static final double HIGH_TEMP = 0.75;	
	private static final double LOW_HUMI  = 0.35;	
	private static final double HIGH_HUMI = 0.75;	
	private static final double LOW_ELEV  = 0.35;
	private static final double HIGH_ELEV = 0.75;
	
	private String id;
	private int tempPref;
	private int humiPref;
	private int elevPref;
	
	private HerbTraits(String id, int tempPref, int humiPref, int elevPref)
	{
		this.id = id;
		this.tempPref = tempPref;
		this.humiPref = humiPref;
		this.elevPref = elevPref;
	}

	@Override
	public double temperatureWeight(double temperature)
	{
		return getWeight(temperature, LOW_TEMP, HIGH_TEMP, tempPref);
	}

	@Override
	public double humidityWeight(double humidity)
	{
		return getWeight(humidity, LOW_HUMI, HIGH_HUMI, humiPref);
	}

	@Override
	public double elevationWeight(double elevation)
	{
		return getWeight(elevation, LOW_ELEV, HIGH_ELEV, elevPref);
	}

	@Override
	public String getTranslationKey()
	{
		return id;
	}
	
	private double getWeight(double val, double low, double high, int pref)
	{
		if((pref < 0 && val > low) || (pref > 0 && val < high))
		{
			return 1.0 / (1 + pref * pref);
		}
		else
		{
			return 1.0;  
		}
	}
}
