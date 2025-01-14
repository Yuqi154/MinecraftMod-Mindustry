package com.hechu.mindustry.world.level.block.entity.multiblock;

import com.hechu.mindustry.kiwi.BlockEntityModule;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.capabilities.Capability;
import net.neoforged.neoforge.common.capabilities.Capabilities;
import net.neoforged.neoforge.common.util.LazyOptional;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestTurretMultiblockEntity extends MultiblockEntity {
    public static final String NAME = "test_turret_multiblock_entity";

    public TestTurretMultiblockEntity(BlockPos pos, BlockState blockState) {
        super(BlockEntityModule.TEST_TURRET_MULTIBLOCK_ENTITY_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (/*side == Direction.UP && */cap == ForgeCapabilities.ITEM_HANDLER) {
            return LazyOptional.of(() -> new ItemStackHandler() {
                @Override
                public @NotNull ItemStack extractItem(int slot, int amount, boolean simulate) {
                    return new ItemStack(Items.COBBLESTONE, Math.min(amount, 64));
                }

                @Override
                public @NotNull ItemStack getStackInSlot(int slot) {
                    return new ItemStack(Items.COBBLESTONE, 1);
                }

                @Override
                public boolean isItemValid(int slot, @NotNull ItemStack stack) {
                    return stack.getItem() == Items.COBBLESTONE;
                }
            }).cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    protected void readPacketData(CompoundTag compoundTag) {

    }

    @NotNull
    @Override
    protected CompoundTag writePacketData(CompoundTag compoundTag) {
        return compoundTag;
    }
}
