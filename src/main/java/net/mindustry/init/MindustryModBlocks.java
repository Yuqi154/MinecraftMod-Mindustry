
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mindustry.block.VoidfillBlock;
import net.mindustry.block.DrillMechanicalBlock;
import net.mindustry.MindustryMod;

public class MindustryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MindustryMod.MODID);
	public static final RegistryObject<Block> DRILL_MECHANICAL = REGISTRY.register("drill_mechanical", () -> new DrillMechanicalBlock());
	public static final RegistryObject<Block> VOIDFILL = REGISTRY.register("voidfill", () -> new VoidfillBlock());
}
