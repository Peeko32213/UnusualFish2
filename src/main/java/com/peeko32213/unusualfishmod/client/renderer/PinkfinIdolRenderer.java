package com.peeko32213.unusualfishmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.peeko32213.unusualfishmod.client.model.PinkfinIdolModel;
import com.peeko32213.unusualfishmod.common.entity.ambient.predator.PinkfinIdol;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class PinkfinIdolRenderer extends MobRenderer<PinkfinIdol, PinkfinIdolModel<PinkfinIdol>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/pinkfin.png");

    public PinkfinIdolRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new PinkfinIdolModel<>(renderManagerIn.bakeLayer(PinkfinIdolModel.LAYER_LOCATION)), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(PinkfinIdol entity) {
        return TEXTURE;
    }

    //this code right here is what you insert when you want to give side flop to your fish \/
    protected void setupRotations(PinkfinIdol p_116226_, PoseStack p_116227_, float p_116228_, float p_116229_, float p_116230_) {
        super.setupRotations(p_116226_, p_116227_, p_116228_, p_116229_, p_116230_);
        float f = 4.3F * Mth.sin(0.6F * p_116228_);
        p_116227_.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!p_116226_.isInWater()) {
            p_116227_.translate((double) 0.2F, (double) 0.1F, 0.0D);
            p_116227_.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }

}

