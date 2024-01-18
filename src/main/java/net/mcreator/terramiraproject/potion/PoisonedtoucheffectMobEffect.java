
package net.mcreator.terramiraproject.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.terramiraproject.procedures.PoisonedtoucheffectEffectStartedappliedProcedure;
import net.mcreator.terramiraproject.procedures.PoisonedtoucheffectActiveTickConditionProcedure;

public class PoisonedtoucheffectMobEffect extends MobEffect {
	public PoisonedtoucheffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
	}

	@Override
	public String getDescriptionId() {
		return "effect.terramiraproject.poisonedtoucheffect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PoisonedtoucheffectEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonedtoucheffectActiveTickConditionProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
