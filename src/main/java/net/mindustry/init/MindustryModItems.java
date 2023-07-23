
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mindustry.item.TabIconItem;
import net.mindustry.block.display.DrillMechanicalDisplayItem;
import net.mindustry.MindustryMod;

public class MindustryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MindustryMod.MODID);
	public static final RegistryObject<Item> TAB_ICON = REGISTRY.register("tab_icon", () -> new TabIconItem());
	public static final RegistryObject<Item> DRILL_MECHANICAL = REGISTRY.register(MindustryModBlocks.DRILL_MECHANICAL.getId().getPath(),
			() -> new DrillMechanicalDisplayItem(MindustryModBlocks.DRILL_MECHANICAL.get(), new Item.Properties().tab(MindustryModTabs.TAB_MINDUSTRY_TAB)));
	public static final RegistryObject<Item> VOIDFILL = block(MindustryModBlocks.VOIDFILL, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
