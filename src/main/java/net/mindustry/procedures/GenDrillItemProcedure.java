package net.mindustry.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraft.link.CurrentDevice;

import java.util.concurrent.atomic.AtomicInteger;

public class GenDrillItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		ItemStack mine = ItemStack.EMPTY;
		double efficiency = 0;
		double drillcache = 0;
		double animation = 0;
		mine = GetMineUnderProcedure.execute(world, x, y, z);
		efficiency = GetEfficiencyProcedure.execute(world, x, y, z);
		drillcache = 5 + (blockstate.getBlock().getStateDefinition().getProperty("cache") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1);
		if (drillcache >= efficiency) {
			{
				int _value = (int) (drillcache - efficiency);
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("cache") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		CurrentDevice.sendMessage((new java.text.DecimalFormat("##.##").format(drillcache)));
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent != null) {
				final int _slotid = 0;
				final ItemStack _setstack = mine;
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 0) + 1));
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
	}
}
