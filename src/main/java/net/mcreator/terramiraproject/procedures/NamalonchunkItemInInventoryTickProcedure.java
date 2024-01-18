package net.mcreator.terramiraproject.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.terramiraproject.TerramiraprojectMod;

public class NamalonchunkItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerramiraprojectMod.queueServerWork(40, () -> {
			for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 2); index0++) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
						@Override
						public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
							String _translatekey = "death.attack." + "\u041D\u0435 \u0432\u044B\u0434\u0435\u0440\u0436\u0430\u043B \u0442\u043E\u043A\u0441\u0438\u0447\u043D\u043E\u0439 \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u0438";
							if (this.getEntity() == null && this.getDirectEntity() == null) {
								return _msgEntity.getKillCredit() != null
										? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
										: Component.translatable(_translatekey, _msgEntity.getDisplayName());
							} else {
								Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
								ItemStack _itemstack = ItemStack.EMPTY;
								if (this.getEntity() instanceof LivingEntity _livingentity)
									_itemstack = _livingentity.getMainHandItem();
								return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
										? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
										: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
							}
						}
					}, 1);
			}
		});
	}
}
