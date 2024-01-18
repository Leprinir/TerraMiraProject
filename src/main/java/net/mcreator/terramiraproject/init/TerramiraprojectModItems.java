
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.terramiraproject.item.SpiritGlyphItem;
import net.mcreator.terramiraproject.item.RedstoneplateItem;
import net.mcreator.terramiraproject.item.PrismaticshardItem;
import net.mcreator.terramiraproject.item.OroningotItem;
import net.mcreator.terramiraproject.item.JumpingPlateItem;
import net.mcreator.terramiraproject.item.IronPlateItem;
import net.mcreator.terramiraproject.item.GoldPlateItem;
import net.mcreator.terramiraproject.item.FusionPrismaItem;
import net.mcreator.terramiraproject.item.FerrosingotItem;
import net.mcreator.terramiraproject.item.CopranItem;
import net.mcreator.terramiraproject.item.CopperPlateItem;
import net.mcreator.terramiraproject.TerramiraprojectMod;

public class TerramiraprojectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TerramiraprojectMod.MODID);
	public static final RegistryObject<Item> COPPER_PLATE = REGISTRY.register("copper_plate", () -> new CopperPlateItem());
	public static final RegistryObject<Item> GOLD_PLATE = REGISTRY.register("gold_plate", () -> new GoldPlateItem());
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> JUMPING_PLATE = REGISTRY.register("jumping_plate", () -> new JumpingPlateItem());
	public static final RegistryObject<Item> REDSTONEPLATE = REGISTRY.register("redstoneplate", () -> new RedstoneplateItem());
	public static final RegistryObject<Item> PRISMATICSHARD = REGISTRY.register("prismaticshard", () -> new PrismaticshardItem());
	public static final RegistryObject<Item> PRISMATICORE = block(TerramiraprojectModBlocks.PRISMATICORE);
	public static final RegistryObject<Item> SPIRIT_GLYPH = REGISTRY.register("spirit_glyph", () -> new SpiritGlyphItem());
	public static final RegistryObject<Item> FUSION_PRISMA = REGISTRY.register("fusion_prisma", () -> new FusionPrismaItem());
	public static final RegistryObject<Item> ORONORE = block(TerramiraprojectModBlocks.ORONORE);
	public static final RegistryObject<Item> ORONINGOT = REGISTRY.register("oroningot", () -> new OroningotItem());
	public static final RegistryObject<Item> FERROSORE = block(TerramiraprojectModBlocks.FERROSORE);
	public static final RegistryObject<Item> FERROSINGOT = REGISTRY.register("ferrosingot", () -> new FerrosingotItem());
	public static final RegistryObject<Item> COPRAN = REGISTRY.register("copran", () -> new CopranItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
