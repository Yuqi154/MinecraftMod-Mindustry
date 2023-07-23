
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcmindustry.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McmindustryModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("mcmindustry", "mindustry"),
				builder -> builder.title(Component.translatable("item_group.mcmindustry.mindustry")).icon(() -> new ItemStack(McmindustryModBlocks.DRILL_MECHANICAL.get())).displayItems((parameters, tabData) -> {
					tabData.accept(McmindustryModBlocks.DRILL_MECHANICAL.get().asItem());
				})

		);
	}
}
