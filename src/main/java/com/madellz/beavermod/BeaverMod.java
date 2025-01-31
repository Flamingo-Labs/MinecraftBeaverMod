package com.madellz.beavermod;

import com.madellz.beavermod.common.entity.EntityRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * The main mod class for Beaver Mod.
 * <p>
 * This class is responsible for mod initialization, including event registration,
 * configuration setup, and entity registration.
 * </p>
 */
@Mod(BeaverMod.MOD_ID)
public class BeaverMod
{
    public static final String MOD_ID = "beavermod";

    private static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Constructor for BeaverMod.
     * <p>
     * This is where the mod event bus is initialized, entities are registered,
     * and the mod's configuration is set up.
     * </p>
     */
    public BeaverMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Entities
        EntityRegistry.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
