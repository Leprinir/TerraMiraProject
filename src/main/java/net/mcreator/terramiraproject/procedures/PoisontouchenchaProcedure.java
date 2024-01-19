package net.mcreator.terramiraproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.terramiraproject.init.TerramiraprojectModMobEffects;
import net.mcreator.terramiraproject.init.TerramiraprojectModItems;
import net.mcreator.terramiraproject.init.TerramiraprojectModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PoisontouchenchaProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(TerramiraprojectModItems.NAMALONBLADE.get())) : false)
				&& EnchantmentHelper.getItemEnchantmentLevel(TerramiraprojectModEnchantments.POISONEDTOUCH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TerramiraprojectModMobEffects.POISONEDTOUCHEFFECT.get(), 160, 1));
		}
	}
}
