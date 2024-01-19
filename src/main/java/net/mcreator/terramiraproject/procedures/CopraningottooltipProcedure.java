package net.mcreator.terramiraproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.terramiraproject.init.TerramiraprojectModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class CopraningottooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == TerramiraprojectModItems.COPRAN.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u041C\u044F\u0433\u043A\u0438\u0439, \u043A\u043E\u0432\u043A\u0438\u0439 \u043C\u0435\u0442\u0430\u043B\u043B"));
			}
		} else {
			tooltip.add(Component.literal("\u041D\u0430\u0436\u043C\u0438\u0442\u0435 Shift \u0447\u0442\u043E\u0431\u044B \u0443\u0432\u0438\u0434\u0435\u0442\u044C \u043F\u043E\u0434\u0440\u043E\u0431\u043D\u043E\u0441\u0442\u0438"));
		}
	}
}
