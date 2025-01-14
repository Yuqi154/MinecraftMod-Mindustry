package com.hechu.mindustry.world.level.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;

import java.util.Arrays;

import static com.hechu.mindustry.kiwi.BlockEntityModule.PNEUMATIC_DRILL_BLOCK_ENTITY;

public class PneumaticDrillBlockEntity extends DrillBlockEntity {
    public static final String NAME = "pneumatic_drill";

    public PneumaticDrillBlockEntity(BlockPos pos, BlockState state) {
        super(PNEUMATIC_DRILL_BLOCK_ENTITY.get(),pos, state,
                Arrays.stream(new BlockPos[]{pos.below(),pos.below().east(),pos.below().south(),pos.below().east().south()}).toList(),
                state1 -> state1.is(Tags.Blocks.SAND) ||
                        state1.is(Tags.Blocks.ORES_COAL) ||
                        state1.is(Tags.Blocks.ORES_COPPER), 0.6f);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, state -> state.setAndContinue(ROTATION_ANIMS)));
    }
    private static final RawAnimation ROTATION_ANIMS = RawAnimation.begin().thenLoop("pneumatic_drill.rotate");

/*    @Override
    public void tick() {
        if (level == null)
            return;
        BlockPos miningBlockPos = getBlockPos().below();
        BlockState miningBlockState = level.getBlockState(miningBlockPos);
        boolean isMining = miningBlockState.getTags().anyMatch(tag ->
                tag.equals(BlockTags.COPPER_ORES) ||
                        tag.equals(BlockTags.COAL_ORES) ||
                        tag.equals(BlockTags.SAND));
        if (level.isClientSide) {
            LocalPlayer localPlayer = Minecraft.getInstance().player;
            if (isMining) {
                progress += 0.4 / 20;
                if (localPlayer != null)
                    level.destroyBlockProgress(localPlayer.getId(), miningBlockPos, (int) (progress * 10));
                if (progress >= 1) {
                    level.addDestroyBlockEffect(miningBlockPos, miningBlockState);
                    progress = 0;
                }
            } else {
                if (localPlayer != null)
                    level.destroyBlockProgress(localPlayer.getId(), miningBlockPos, 10);
            }
            return;
        }
        if (isMining) {
            progress += 0.4 / 20;
            if (progress >= 1) {
                for (ItemStack drop : Block.getDrops(miningBlockState, (ServerLevel) level, miningBlockPos, null)) {
                    Block.popResource(level, getBlockPos().above(), drop);
                }
                level.playSound(null, getBlockPos(), SoundEvents.STONE_BREAK, SoundSource.BLOCKS, 1f, 1f);
                progress = 0;
            }
        } else {
            progress = 0;
        }
    }*/
}
