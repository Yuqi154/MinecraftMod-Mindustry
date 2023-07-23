package net.mindustry.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DrillMechanicalplaceProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.AIR == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()) {
			return false;
		}
		if (Blocks.AIR == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()) {
			return false;
		}
		if (Blocks.AIR == (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()) {
			return false;
		}
		return true;
	}
}
