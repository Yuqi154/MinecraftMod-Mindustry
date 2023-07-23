package net.mindustry.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DrillUninitializationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
	}
}
