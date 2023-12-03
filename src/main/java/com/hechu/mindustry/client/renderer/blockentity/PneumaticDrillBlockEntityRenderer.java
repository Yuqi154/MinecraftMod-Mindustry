package com.hechu.mindustry.client.renderer.blockentity;

import com.hechu.mindustry.world.level.block.entity.PneumaticDrillBlockEntity;
import com.hechu.mindustry.world.level.block.model.PneumaticDrillModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PneumaticDrillBlockEntityRenderer extends DrillBlockEntityRenderer<PneumaticDrillBlockEntity>{
    public PneumaticDrillBlockEntityRenderer() {
        super(new PneumaticDrillModel());
    }
}
