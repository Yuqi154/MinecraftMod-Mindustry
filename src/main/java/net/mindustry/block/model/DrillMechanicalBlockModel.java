package net.mindustry.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mindustry.block.entity.DrillMechanicalTileEntity;

public class DrillMechanicalBlockModel extends AnimatedGeoModel<DrillMechanicalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrillMechanicalTileEntity animatable) {
		return new ResourceLocation("mindustry", "animations/drill-mechanical.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrillMechanicalTileEntity animatable) {
		return new ResourceLocation("mindustry", "geo/drill-mechanical.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrillMechanicalTileEntity entity) {
		return new ResourceLocation("mindustry", "textures/blocks/mechanical_drill.png");
	}
}
