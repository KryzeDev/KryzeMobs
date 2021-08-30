package com.kryzedev.kryzemobs.client.render.entity;

import com.kryzedev.kryzemobs.client.model.entity.ModelHunter;
import com.kryzedev.kryzemobs.server.entity.glith.EntityHunter;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RenderHunter extends GeoEntityRenderer<EntityHunter>{

    public RenderHunter(EntityRendererManager renderManager) {
        super(renderManager, new ModelHunter());
    }

    @Override
    public ResourceLocation getEntityTexture(EntityHunter entity) {
        return this.getGeoModelProvider().getTextureLocation(entity);
    }

    @Override
    public RenderType getRenderType(EntityHunter animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.getEntityTranslucent(getTextureLocation(animatable));
    }
}
