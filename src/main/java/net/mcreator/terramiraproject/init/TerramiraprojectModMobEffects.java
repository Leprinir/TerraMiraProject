
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.terramiraproject.potion.PoisonedtoucheffectMobEffect;
import net.mcreator.terramiraproject.potion.AnemiapotionMobEffect;
import net.mcreator.terramiraproject.TerramiraprojectMod;

public class TerramiraprojectModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TerramiraprojectMod.MODID);
	public static final RegistryObject<MobEffect> ANEMIAPOTION = REGISTRY.register("anemiapotion", () -> new AnemiapotionMobEffect());
	public static final RegistryObject<MobEffect> POISONEDTOUCHEFFECT = REGISTRY.register("poisonedtoucheffect", () -> new PoisonedtoucheffectMobEffect());
}
