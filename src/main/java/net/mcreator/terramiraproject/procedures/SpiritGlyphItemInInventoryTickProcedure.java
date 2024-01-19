package net.mcreator.terramiraproject.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.terramiraproject.TerramiraprojectMod;

public class SpiritGlyphItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl0 && _lvl0.isDay() || world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) > 10) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, true, false));
		} else if ((world instanceof Level _lvl4 && _lvl4.isDay()) == false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 2, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, true, false));
		}
		if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.POISON)) {
			for (int index0 = 0; index0 < 5; index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, x, y, z, 5, 3, 3, 3, 1.5);
				TerramiraprojectMod.queueServerWork(80, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 15, 3, 3, 3, 0);
					for (int index1 = 0; index1 < 5; index1++) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.POISON);
					}
				});
			}
		}
	}
}
