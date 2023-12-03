package com.hechu.mindustry.datagen.block;

import com.hechu.mindustry.annotation.Block;
import com.hechu.mindustry.kiwi.MutilBlockModule;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TurretBlockStateGenerator extends BlockStateProvider {
    public TurretBlockStateGenerator(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        MutilBlockModule.getBlocks().forEach(block -> {
            String name = block.getClass().getAnnotation(Block.class).name();
            this.getVariantBuilder(block)
                    .forAllStates(state -> {
                        IntegerProperty partProperty = block.getPartProperty();
                        int part = state.getValue(partProperty);
                        return ConfiguredModel.builder()
                                .modelFile(this.models().getExistingFile(this.modLoc("block/" + name + "/" + name + "_" + part)))
                                .build();
                    });
        });
    }
}
