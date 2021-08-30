package com.kryzedev.kryzemobs;

import com.kryzedev.kryzemobs.client.ClientHandler;
import com.kryzedev.kryzemobs.server.entity.EntityHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KryzeMobs.MOD_ID)
@Mod.EventBusSubscriber(modid = KryzeMobs.MOD_ID)
public class KryzeMobs {

    public static final String MOD_ID = "kryzemobs";

    public KryzeMobs() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        EntityHandler.register();
    }

    private void init(FMLLoadCompleteEvent event) {
        EntityHandler.initializeAttributes();
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        ClientHandler.setup();
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {}
}
