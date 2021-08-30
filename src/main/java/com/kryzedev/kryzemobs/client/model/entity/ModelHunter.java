package com.kryzedev.kryzemobs.client.model.entity;

import com.kryzedev.kryzemobs.KryzeMobs;
import com.kryzedev.kryzemobs.server.entity.Hunter.EntityHunter;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelHunter extends AnimatedGeoModel<EntityHunter> {
    @Override
    public ResourceLocation getModelLocation(EntityHunter object) {
        return new ResourceLocation(KryzeMobs.MOD_ID, "geo/chocobo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityHunter object) {
        return new ResourceLocation(KryzeMobs.MOD_ID, "textures/entity/chocobo_yellow.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityHunter animatable) {
        return new ResourceLocation(KryzeMobs.MOD_ID, "animations/chocobo.animation.json");
    }
}
