package net.mindustry.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mindustry.init.MindustryModBlocks;

public class DrillInitializationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 0;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("cache") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("cache", 0);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("ani", 0);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.setBlock(new BlockPos(x, y, z + 1), MindustryModBlocks.VOIDFILL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), MindustryModBlocks.VOIDFILL.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z + 1), MindustryModBlocks.VOIDFILL.get().defaultBlockState(), 3);
	}
}
