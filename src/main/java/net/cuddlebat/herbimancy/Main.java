package net.cuddlebat.herbimancy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("biome id,rain,temp,depth,scale");
		Registry.BIOME.forEach((b) ->
		{
			System.out.println(Registry.BIOME.getId(b) + ","
				+ b.getRainfall() + ","
				+ b.getTemperature() + ","
				+ b.getDepth() + ","
				+ b.getScale());
		});
	}
}
