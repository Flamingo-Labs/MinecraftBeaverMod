package com.madellz.beavermod.client.renderer;

import com.madellz.beavermod.BeaverMod;
import com.madellz.beavermod.client.model.ModelLayers;
import com.madellz.beavermod.client.model.animal.BeaverModel;
import com.madellz.beavermod.common.entity.animal.Beaver;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/**
 * Handles rendering of the {@link Beaver} entity.
 * <p>
 * This class specifies the beaver's model, texture, and rendering behavior.
 * It extends {@link MobRenderer} to manage the rendering pipeline for the entity.
 * </p>
 */
public class BeaverRenderer extends MobRenderer<Beaver, BeaverModel>
{
    /**
     * Constructs a new {@link BeaverRenderer}.
     *
     * @param pContext The rendering context provided by Minecraft
     */
    public BeaverRenderer(EntityRendererProvider.Context pContext)
    {
        super(pContext, new BeaverModel(pContext.bakeLayer(ModelLayers.BEAVER_LAYER)), .45f);
    }

    /**
     * Returns the texture location for the beaver entity.
     *
     * @param pEntity The beaver entity instance
     * @return A {@link ResourceLocation} pointing to the beaver's texture
     */
    @Override
    @NotNull
    public ResourceLocation getTextureLocation(@NotNull Beaver pEntity)
    {
        return new ResourceLocation(BeaverMod.MOD_ID, "textures/entity/beaver.png");
    }

    /**
     * Renders the beaver entity.
     *
     * <p>
     * This method calls the superclass's render method to handle the default rendering behavior.
     * </p>
     *
     * @param pEntity       The beaver entity instance.
     * @param pEntityYaw    The entity's yaw rotation.
     * @param pPartialTicks The partial tick time for smooth rendering.
     * @param pPoseStack    The pose stack used for transformations.
     * @param pBuffer       The buffer source.
     * @param pPackedLight  The lighting information.
     */
    @Override
    public void render(@NotNull Beaver pEntity, float pEntityYaw, float pPartialTicks, @NotNull PoseStack pPoseStack,
            @NotNull MultiBufferSource pBuffer, int pPackedLight)
    {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
