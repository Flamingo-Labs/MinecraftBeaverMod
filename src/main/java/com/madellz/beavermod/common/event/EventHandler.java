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
     * Registers entity attributes for the mod entities.
     *
     * @param event The event that handles entity attribute registration.
     */
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)
    {
        event.put(EntityRegistry.BEAVER.get(), Beaver.createAttributes().build());
        event.put(EntityRegistry.BABY_BEAVER.get(), Beaver.createAttributes().build());
    }
}
