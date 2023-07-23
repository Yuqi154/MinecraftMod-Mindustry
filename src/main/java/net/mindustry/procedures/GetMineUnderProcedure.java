package net.mindustry.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class GetMineUnderProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemgot = ItemStack.EMPTY;
		if (Blocks.COAL_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.COAL);
		}
		if (Blocks.DEEPSLATE_COAL_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.COAL);
		}
		if (Blocks.IRON_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.RAW_IRON);
		}
		if (Blocks.DEEPSLATE_IRON_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.RAW_IRON);
		}
		if (Blocks.COPPER_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.RAW_COPPER);
		}
		if (Blocks.DEEPSLATE_COPPER_ORE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.RAW_COPPER);
		}
		return itemgot;
	}
}
