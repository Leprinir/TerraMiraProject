
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terramiraproject.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.terramiraproject.TerramiraprojectMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerramiraprojectModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerramiraprojectMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TerramiraprojectModBlocks.PRISMATICORE.get().asItem());
			tabData.accept(TerramiraprojectModBlocks.ORONORE.get().asItem());
			tabData.accept(TerramiraprojectModBlocks.FERROSORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TerramiraprojectModItems.SPIRIT_GLYPH.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TerramiraprojectModItems.COPPER_PLATE.get());
			tabData.accept(TerramiraprojectModItems.ORONINGOT.get());
			tabData.accept(TerramiraprojectModItems.FERROSINGOT.get());
			tabData.accept(TerramiraprojectModItems.COPRAN.get());
		}
	}
}
