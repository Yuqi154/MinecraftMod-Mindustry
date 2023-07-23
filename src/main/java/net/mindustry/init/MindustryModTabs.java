
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mindustry.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MindustryModTabs {
	public static CreativeModeTab TAB_MINDUSTRY_TAB;

	public static void load() {
		TAB_MINDUSTRY_TAB = new CreativeModeTab("tabmindustry_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MindustryModItems.TAB_ICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
