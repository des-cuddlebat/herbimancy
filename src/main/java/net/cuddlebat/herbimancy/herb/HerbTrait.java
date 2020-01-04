package net.cuddlebat.herbimancy.herb;

public interface HerbTrait
{
	public double temperatureWeight(double temperature);
	
	public double humidityWeight(double humidity);
	
	public double elevationWeight(double elevation);
	
	public String getTranslationKey();
}
