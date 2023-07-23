package net.mindustry.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mindustry.block.model.DrillMechanicalDisplayModel;
import net.mindustry.block.display.DrillMechanicalDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DrillMechanicalDisplayItemRenderer extends GeoItemRenderer<DrillMechanicalDisplayItem> {
	public DrillMechanicalDisplayItemRenderer() {
		super(new DrillMechanicalDisplayModel());
	}

	@Override
	public RenderType getRenderType(DrillMechanicalDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
