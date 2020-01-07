package net.cuddlebat.herbimancy;

import net.cuddlebat.herbimancy.herb.ModHerb;
import net.cuddlebat.herbimancy.herb.ModHerbs;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer
{
	@Override
	@SuppressWarnings("unused")
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// running the static constructor
		ModHerb ygubijk = ModHerbs.ASTRAL_RADISH;
	}
}
