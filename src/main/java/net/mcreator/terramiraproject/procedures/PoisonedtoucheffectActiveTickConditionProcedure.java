package net.mcreator.terramiraproject.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.terramiraproject.TerramiraprojectMod;

public class PoisonedtoucheffectActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerramiraprojectMod.queueServerWork(40, () -> {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), (float) (1 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.08));
		});
	}
}
