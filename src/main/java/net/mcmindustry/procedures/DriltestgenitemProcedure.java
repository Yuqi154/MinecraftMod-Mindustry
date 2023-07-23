package net.mcmindustry.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class DriltestgenitemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemgot = ItemStack.EMPTY;
		if (Blocks.COAL_ORE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.COAL);
		}
		if (Blocks.DEEPSLATE_COAL_ORE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			itemgot = new ItemStack(Items.COAL);
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent != null) {
				final int _slotid = 0;
				final ItemStack _setstack = itemgot;
				_setstack.setCount(10);
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
	}
}
