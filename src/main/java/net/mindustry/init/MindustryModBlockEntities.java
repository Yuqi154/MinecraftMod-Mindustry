
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mindustry.block.entity.DrillMechanicalTileEntity;
import net.mindustry.MindustryMod;

public class MindustryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MindustryMod.MODID);
	public static final RegistryObject<BlockEntityType<DrillMechanicalTileEntity>> DRILL_MECHANICAL = REGISTRY.register("drill_mechanical",
			() -> BlockEntityType.Builder.of(DrillMechanicalTileEntity::new, MindustryModBlocks.DRILL_MECHANICAL.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
