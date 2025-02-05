package com.madellz.beavermod.common.entity;

import com.madellz.beavermod.BeaverMod;
import com.madellz.beavermod.common.entity.animal.Beaver;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Handles the registration of all custom entities in the beaver mod.
 */
public class EntityRegistry
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(
            ForgeRegistries.ENTITY_TYPES, BeaverMod.MOD_ID);

    public static final RegistryObject<EntityType<Beaver>> BEAVER = ENTITY_TYPES.register("beaver",
            () -> EntityType.Builder.of(Beaver::new, MobCategory.CREATURE).sized(.625f, .625f).build("beaver"));

    public static final RegistryObject<EntityType<Beaver>> BABY_BEAVER = ENTITY_TYPES.register("baby_beaver",
            () -> EntityType.Builder.of(Beaver::new, MobCategory.CREATURE).sized(.5f, .5f).build("baby_beaver"));
    /**
     * Registers the entity types with the provided event bus.
     *
     * @param eventBus The event bus used for registration.
     */
    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
