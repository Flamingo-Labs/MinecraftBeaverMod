package com.madellz.beavermod.client.renderer;

import com.madellz.beavermod.BeaverMod;
import com.madellz.beavermod.client.model.ModelLayers;
import com.madellz.beavermod.client.model.animal.BabyBeaverModel;
import com.madellz.beavermod.common.entity.animal.Beaver;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BabyBeaverRenderer extends MobRenderer<Beaver, BabyBeaverModel>
{
    /**
     * Constructs a new {@link BabyBeaverRenderer}.
     *
     * @param pContext The rendering context provided by Minecraft
     */
    public BabyBeaverRenderer(EntityRendererProvider.Context pContext)
    {
        super(pContext, new BabyBeaverModel(pContext.bakeLayer(ModelLayers.BABY_BEAVER_LAYER)), .25f);
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
        return new ResourceLocation(BeaverMod.MOD_ID, "textures/entity/baby_beaver.png");
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
