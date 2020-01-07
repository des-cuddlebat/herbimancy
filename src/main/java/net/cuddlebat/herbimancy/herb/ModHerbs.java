package net.cuddlebat.herbimancy.herb;

import java.util.HashSet;
import java.util.Set;

import net.cuddlebat.herbimancy.Modid;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public final class ModHerbs
{
	static Set<ModHerb> all = new HashSet<ModHerb>();
	
	// Poisonous
	public static final ModHerb DEADLY_BOLETE;
	public static final ModHerb POISON_TEARS;
	public static final ModHerb MIDNIGHT_LILY; 
	// Ancient
	public static final ModHerb SPRING_CAP;
	public static final ModHerb CTHULHUS_BREAD;
	public static final ModHerb ETERNAL_ROOT;
	// Celestial
	public static final ModHerb ASTRAL_RADISH;
	public static final ModHerb MOONLIGHT_BLOSSOM;
	public static final ModHerb OTHERWORLDLY_LEAF;
	// Ordinary
	public static final ModHerb ICICLIS;
	public static final ModHerb RAINBERRY;
	public static final ModHerb LIGNEOUS_GRASS;
	// Elemental
	public static final ModHerb ZEPHYRS_EMBRACE;
	public static final ModHerb ROCKLEAF;
	public static final ModHerb FLAMESTALK;
	// Material
	public static final ModHerb SHATTERWEED;
	public static final ModHerb CRYSTALLINE_LOTUS;
	public static final ModHerb STEEL_REED;
	// Sinister
	public static final ModHerb MIDAS_BERRY;
	public static final ModHerb INSATIABLE_POTATO;
	public static final ModHerb WRATH_VINE;
	
	private ModHerbs()
	{
	}
	
	static
	{
		Item.Settings  is = new Item.Settings().group(ItemGroup.MISC).maxCount(64);
		Block.Settings bs = FabricBlockSettings.copy(Blocks.WHEAT).build();
		
		// Poisonous
		DEADLY_BOLETE = new HerbBuilder("deadly_bolete", "death").itemSettings(is).blockSettings(bs).type(HerbType.FUNGUS).clazz(HerbClass.POISONOUS).rarity(HerbRarity.PLENTIFUL).trait(HerbTraits.HUMID_PREF).buildAndRegister(Modid.MODID);
		POISON_TEARS = new HerbBuilder("poison_tears", "poison").itemSettings(is).blockSettings(bs).type(HerbType.BERRY).clazz(HerbClass.POISONOUS).rarity(HerbRarity.UNCOMMON).buildAndRegister(Modid.MODID);
		MIDNIGHT_LILY = new HerbBuilder("midnight_lily", "dark").itemSettings(is).blockSettings(bs).type(HerbType.BLOSSOM).clazz(HerbClass.POISONOUS).rarity(HerbRarity.COMMON).trait(HerbTraits.COLD_PREF).buildAndRegister(Modid.MODID);

		// Ancient
		SPRING_CAP = new HerbBuilder("spring_cap", "life").itemSettings(is).blockSettings(bs).type(HerbType.FUNGUS).clazz(HerbClass.ANCIENT).rarity(HerbRarity.UNCOMMON).trait(HerbTraits.LOW_PREF).buildAndRegister(Modid.MODID);
		CTHULHUS_BREAD = new HerbBuilder("cthulhus_bread", "evil").itemSettings(is).blockSettings(bs).type(HerbType.GRAIN).clazz(HerbClass.ANCIENT).rarity(HerbRarity.RARE).buildAndRegister(Modid.MODID);
		ETERNAL_ROOT = new HerbBuilder("eternal_root", "time").itemSettings(is).blockSettings(bs).type(HerbType.ROOT).clazz(HerbClass.ANCIENT).rarity(HerbRarity.UNCOMMON).trait(HerbTraits.LOW_PREF).buildAndRegister(Modid.MODID);

		// Celestial
		ASTRAL_RADISH = new HerbBuilder("astral_radish", "astral").itemSettings(is).blockSettings(bs).type(HerbType.ROOT).clazz(HerbClass.CELESTIAL).rarity(HerbRarity.COMMON).trait(HerbTraits.HIGH_PREF).buildAndRegister(Modid.MODID);
		MOONLIGHT_BLOSSOM = new HerbBuilder("moonlight_blossom", "light").itemSettings(is).blockSettings(bs).type(HerbType.BLOSSOM).clazz(HerbClass.CELESTIAL).rarity(HerbRarity.PLENTIFUL).trait(HerbTraits.LOW_PREF).trait(HerbTraits.COLD_PREF).buildAndRegister(Modid.MODID);
		OTHERWORLDLY_LEAF = new HerbBuilder("otherworldly_leaf", "ender").itemSettings(is).blockSettings(bs).type(HerbType.LEAF).clazz(HerbClass.CELESTIAL).rarity(HerbRarity.UNCOMMON).buildAndRegister(Modid.MODID);

		// Ordinary
		ICICLIS = new HerbBuilder("iciclis", "ice").itemSettings(is).blockSettings(bs).type(HerbType.GRAIN).clazz(HerbClass.ORDINARY).rarity(HerbRarity.COMMON).trait(HerbTraits.COLD_PREF).buildAndRegister(Modid.MODID);
		RAINBERRY = new HerbBuilder("rainberry", "water").itemSettings(is).blockSettings(bs).type(HerbType.BERRY).clazz(HerbClass.ORDINARY).rarity(HerbRarity.UNCOMMON).trait(HerbTraits.ARID_PREF).buildAndRegister(Modid.MODID);
		LIGNEOUS_GRASS = new HerbBuilder("ligneous_grass", "wood").itemSettings(is).blockSettings(bs).type(HerbType.LEAF).clazz(HerbClass.ORDINARY).rarity(HerbRarity.PLENTIFUL).trait(HerbTraits.LOW_PREF).buildAndRegister(Modid.MODID);

		// Elemental
		ZEPHYRS_EMBRACE = new HerbBuilder("zephyrs_embrace", "air").itemSettings(is).blockSettings(bs).type(HerbType.FUNGUS).clazz(HerbClass.ELEMENTAL).rarity(HerbRarity.PLENTIFUL).buildAndRegister(Modid.MODID);
		ROCKLEAF = new HerbBuilder("rockleaf", "earth").itemSettings(is).blockSettings(bs).type(HerbType.LEAF).clazz(HerbClass.ELEMENTAL).rarity(HerbRarity.COMMON).trait(HerbTraits.COLD_PREF).buildAndRegister(Modid.MODID);
		FLAMESTALK = new HerbBuilder("flamestalk", "fire").itemSettings(is).blockSettings(bs).type(HerbType.STALK).clazz(HerbClass.ELEMENTAL).rarity(HerbRarity.UNCOMMON).trait(HerbTraits.WARM_PREF).trait(HerbTraits.ARID_PREF).buildAndRegister(Modid.MODID);

		// Material
		SHATTERWEED = new HerbBuilder("shatterweed", "dust").itemSettings(is).blockSettings(bs).type(HerbType.GRAIN).clazz(HerbClass.MATERIAL).rarity(HerbRarity.COMMON).trait(HerbTraits.HUMID_PREF).buildAndRegister(Modid.MODID);
		CRYSTALLINE_LOTUS = new HerbBuilder("crystalline_lotus", "crystal").itemSettings(is).blockSettings(bs).type(HerbType.BLOSSOM).clazz(HerbClass.MATERIAL).rarity(HerbRarity.UNCOMMON).trait(HerbTraits.WARM_PREF).trait(HerbTraits.HIGH_PREF).buildAndRegister(Modid.MODID);
		STEEL_REED = new HerbBuilder("steel_reed", "metal").itemSettings(is).blockSettings(bs).type(HerbType.STALK).clazz(HerbClass.MATERIAL).rarity(HerbRarity.COMMON).trait(HerbTraits.WARM_PREF).buildAndRegister(Modid.MODID);

		// Sinister
		MIDAS_BERRY = new HerbBuilder("midas_berry", "greed").itemSettings(is).blockSettings(bs).type(HerbType.BERRY).clazz(HerbClass.SINISTER).rarity(HerbRarity.RARE).trait(HerbTraits.HUMID_PREF).buildAndRegister(Modid.MODID);
		INSATIABLE_POTATO = new HerbBuilder("insatiable_potato", "food").itemSettings(is).blockSettings(bs).type(HerbType.ROOT).clazz(HerbClass.SINISTER).rarity(HerbRarity.COMMON).trait(HerbTraits.HIGH_PREF).trait(HerbTraits.WARM_PREF).buildAndRegister(Modid.MODID);
		WRATH_VINE = new HerbBuilder("wrath_vine", "wrath").itemSettings(is).blockSettings(bs).type(HerbType.STALK).clazz(HerbClass.SINISTER).rarity(HerbRarity.RARE).trait(HerbTraits.ARID_PREF).trait(HerbTraits.COLD_PREF).buildAndRegister(Modid.MODID);
	}
	
//	public static void init()
//	{
//		
//	}
}
