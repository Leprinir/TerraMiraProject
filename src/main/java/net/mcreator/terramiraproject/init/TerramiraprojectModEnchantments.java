
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.terramiraproject.enchantment.PoisonedtouchEnchantment;
import net.mcreator.terramiraproject.enchantment.AnemiaEnchantment;
import net.mcreator.terramiraproject.TerramiraprojectMod;

public class TerramiraprojectModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TerramiraprojectMod.MODID);
	public static final RegistryObject<Enchantment> POISONEDTOUCH = REGISTRY.register("poisonedtouch", () -> new PoisonedtouchEnchantment());
	public static final RegistryObject<Enchantment> ANEMIA = REGISTRY.register("anemia", () -> new AnemiaEnchantment());
}
