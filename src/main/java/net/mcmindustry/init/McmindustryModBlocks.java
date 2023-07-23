
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcmindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcmindustry.block.DrillCopperBlock;
import net.mcmindustry.McmindustryMod;

public class McmindustryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McmindustryMod.MODID);
	public static final RegistryObject<Block> DRILL_MECHANICAL = REGISTRY.register("drill_mechanical", () -> new DrillCopperBlock());
}
