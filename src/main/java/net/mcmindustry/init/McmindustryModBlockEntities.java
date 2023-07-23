
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcmindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcmindustry.block.entity.DrillCopperBlockEntity;
import net.mcmindustry.McmindustryMod;

public class McmindustryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, McmindustryMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DRILL_MECHANICAL = register("drill_mechanical", McmindustryModBlocks.DRILL_MECHANICAL, DrillCopperBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
