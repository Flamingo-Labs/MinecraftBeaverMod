package com.madellz.beavermod.client.model;

import com.madellz.beavermod.BeaverMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

/**
 * This class defines model layer locations for the mod.
 * Model layers are used by Minecraft's rendering system to properly register
 * and render entity models.
 */
public class ModelLayers
{
    /**
     * The model layer location for the beaver entity.
     *
     * <p>
     * This {@link ModelLayerLocation} is used to register and reference the beaver model.
     * The {@link ResourceLocation} ensures that the model layer is correctly namespaced
     * under the mod's ID.
     * </p>
     *
     * @see ModelLayerLocation
     * @see ResourceLocation
     */
    public static final ModelLayerLocation BEAVER_LAYER = new ModelLayerLocation(
            new ResourceLocation(BeaverMod.MOD_ID, "beaver_layer"), "main");

    /**
     * The model layer location for the baby beaver entity.
     *
     * <p>
     * This {@link ModelLayerLocation} is used to register and reference the baby beaver model.
     * The {@link ResourceLocation} ensures that the model layer is correctly namespaced
     * under the mod's ID.
     * </p>
     *
     * @see ModelLayerLocation
     * @see ResourceLocation
     */
    public static final ModelLayerLocation BABY_BEAVER_LAYER = new ModelLayerLocation(
            new ResourceLocation(BeaverMod.MOD_ID, "baby_beaver_layer"), "main");
}
