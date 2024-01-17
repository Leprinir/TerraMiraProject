
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.terramiraproject.enchantment.TestenchaEnchantment;
import net.mcreator.terramiraproject.TerramiraprojectMod;

public class TerramiraprojectModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TerramiraprojectMod.MODID);
	public static final RegistryObject<Enchantment> TESTENCHA = REGISTRY.register("testencha", () -> new TestenchaEnchantment());
}
