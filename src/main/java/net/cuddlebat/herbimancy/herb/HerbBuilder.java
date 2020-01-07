package net.cuddlebat.herbimancy.herb;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HerbBuilder
{
	private Item.Settings itemSettings;
	private Block.Settings blockSettings;
	private String id;
	private String essence;
	private HerbType type;
	private HerbClass clazz;
	private HerbRarity rarity;
	private Set<HerbTrait> traits = new HashSet<HerbTrait>();
	
	public HerbBuilder(String id, String essence)
	{
		this.id = id;
		this.essence = essence;
	}
	
	public HerbBuilder itemSettings(Item.Settings settings)
	{
		itemSettings = settings;
		return this;
	}
	
	public HerbBuilder blockSettings(Block.Settings settings)
	{
		blockSettings = settings;
		return this;
	}

	public Item.Settings getItemSettings()
	{
		return itemSettings;
	}

	public Block.Settings getBlockSettings()
	{
		return blockSettings;
	}
	
	public ModHerb build()
	{
		return new ModHerb(this);
	}
	
	public void register(String modid, ModHerb herb)
	{
		Registry.register(Registry.BLOCK, new Identifier(modid, id + "_crop")       , herb.getCrop());
		Registry.register(Registry.BLOCK, new Identifier(modid, id + "_crop_poor")  , herb.getPoorCrop());
		Registry.register(Registry.BLOCK, new Identifier(modid, id + "_crop_rich")  , herb.getRichCrop());
		Registry.register(Registry.BLOCK, new Identifier(modid, id + "_crop_synth") , herb.getSynthCrop());
		
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_seeds")      , herb.getSeeds());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_seeds_poor") , herb.getPoorSeeds());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_seeds_rich") , herb.getRichSeeds());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_seeds_synth"), herb.getSynthSeeds());
		
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_fruit")      , herb.getFruit());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_fruit_poor") , herb.getPoorFruit());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_fruit_rich") , herb.getRichFruit());
		Registry.register(Registry.ITEM , new Identifier(modid, id + "_fruit_synth"), herb.getSynthFruit());
	}
	
	public ModHerb buildAndRegister(String modid)
	{
		ModHerb herb = build();
		register(modid, herb);
		return herb;
	}

	public HerbBuilder type(HerbType type)
	{
		this.type = type;
		return this;
	}

	public HerbBuilder clazz(HerbClass clazz)
	{
		this.clazz = clazz;
		return this;
	}

	public HerbBuilder rarity(HerbRarity rarity)
	{
		this.rarity = rarity;
		return this;
	}

	public HerbBuilder trait(HerbTrait trait)
	{
		traits.add(trait);
		return this;
	}

	public HerbType getType()
	{
		return type;
	}

	public HerbClass getClz()
	{
		return clazz;
	}

	public HerbRarity getRarity()
	{
		return rarity;
	}

	public Set<HerbTrait> getTraits()
	{
		return traits;
	}

	public String getId()
	{
		return id;
	}

	public String getEssenceName()
	{
		return essence;
	}
}
