package net.mindustry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mindustry.init.MindustryModBlocks;

public class GetEfficiencyProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double efficiency = 0;
		if (MindustryModBlocks.DRILL_MECHANICAL.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			efficiency = 20;
		}
		return efficiency;
	}
}
