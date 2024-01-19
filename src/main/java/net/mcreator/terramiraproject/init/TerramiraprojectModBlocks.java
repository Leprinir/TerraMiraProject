
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.terramiraproject.block.PrismaticoreBlock;
import net.mcreator.terramiraproject.block.OronoreBlock;
import net.mcreator.terramiraproject.block.FerrosoreBlock;
import net.mcreator.terramiraproject.TerramiraprojectMod;

public class TerramiraprojectModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TerramiraprojectMod.MODID);
	public static final RegistryObject<Block> PRISMATICORE = REGISTRY.register("prismaticore", () -> new PrismaticoreBlock());
	public static final RegistryObject<Block> ORONORE = REGISTRY.register("oronore", () -> new OronoreBlock());
	public static final RegistryObject<Block> FERROSORE = REGISTRY.register("ferrosore", () -> new FerrosoreBlock());
}
