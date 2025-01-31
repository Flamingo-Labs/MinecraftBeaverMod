package com.madellz.beavermod.common.event;

import com.madellz.beavermod.BeaverMod;
import com.madellz.beavermod.common.entity.EntityRegistry;
import com.madellz.beavermod.common.entity.animal.Beaver;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Handles common game events for the mod.
 * <p>
 * This class is responsible for managing various game events that affect entities, gameplay mechanics,
 * and other mod-specific functionality.
 * </p>
 */
@Mod.EventBusSubscriber(modid = BeaverMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler
{
    /**
     * Registers entity attributes for the beaver entity.
     * <p>
     * This method runs during the {@link EntityAttributeCreationEvent} and assigns the
     * necessary attributes to the beaver, such as movement speed, attack damage, and health.
     * </p>
     *
     * @param event The event that handles entity attribute registration.
     */
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)
    {
        event.put(EntityRegistry.BEAVER.get(), Beaver.createLivingAttributes().build());
    }
}
