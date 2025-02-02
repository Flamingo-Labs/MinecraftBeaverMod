package com.madellz.beavermod.client.event;

import com.madellz.beavermod.BeaverMod;
import com.madellz.beavermod.client.model.ModelLayers;
import com.madellz.beavermod.client.model.animal.BabyBeaverModel;
import com.madellz.beavermod.client.model.animal.BeaverModel;
import com.madellz.beavermod.client.renderer.BabyBeaverRenderer;
import com.madellz.beavermod.client.renderer.BeaverRenderer;
import com.madellz.beavermod.common.entity.EntityRegistry;
import com.madellz.beavermod.common.entity.animal.Beaver;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Handles client-side event registration for the mod.
 * <p>
 * This class ensures that the beaver entity is properly rendered by registering its renderer
 * and model layer definitions. It only runs on the client side.
 * </p>
 */
@Mod.EventBusSubscriber(modid = BeaverMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler
{
    /**
     * Registers the {@link BeaverRenderer} for the {@link Beaver} entity.
     * <p>
     * This method runs during the client setup phase and ensures that the beaver entity is
     * rendered using the correct model and texture.
     * </p>
     *
     * @param event The client setup event.
     */
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        EntityRenderers.register(EntityRegistry.BEAVER.get(), BeaverRenderer::new);
        EntityRenderers.register(EntityRegistry.BABY_BEAVER.get(), BabyBeaverRenderer::new);
    }

    /**
     * Registers the model layer definition for the beaver entity.
     * <p>
     * This method ensures that the beaver model is properly registered and can be used
     * for rendering by defining its model layer.
     * </p>
     *
     * @param event The event for registering entity layer definitions.
     */
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(ModelLayers.BEAVER_LAYER, BeaverModel::createBodyLayer);
        event.registerLayerDefinition(ModelLayers.BABY_BEAVER_LAYER, BabyBeaverModel::createBodyLayer);
    }
}
