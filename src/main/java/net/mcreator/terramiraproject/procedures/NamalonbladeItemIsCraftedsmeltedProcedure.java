package net.mcreator.terramiraproject.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.terramiraproject.init.TerramiraprojectModEnchantments;

public class NamalonbladeItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(TerramiraprojectModEnchantments.POISONEDTOUCH.get(), 1);
	}
}
