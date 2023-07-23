
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcmindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcmindustry.McmindustryMod;

public class McmindustryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McmindustryMod.MODID);
	public static final RegistryObject<Item> DRILL_MECHANICAL = block(McmindustryModBlocks.DRILL_MECHANICAL);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
