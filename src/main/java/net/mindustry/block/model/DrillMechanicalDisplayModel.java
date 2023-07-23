package net.mindustry.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mindustry.block.display.DrillMechanicalDisplayItem;

public class DrillMechanicalDisplayModel extends AnimatedGeoModel<DrillMechanicalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrillMechanicalDisplayItem animatable) {
		return new ResourceLocation("mindustry", "animations/drill-mechanical.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrillMechanicalDisplayItem animatable) {
		return new ResourceLocation("mindustry", "geo/drill-mechanical.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrillMechanicalDisplayItem entity) {
		return new ResourceLocation("mindustry", "textures/blocks/mechanical_drill.png");
	}
}
