package com.kryzedev.kryzemobs.client;

import com.kryzedev.kryzemobs.client.render.entity.RenderHunter;
import com.kryzedev.kryzemobs.server.entity.EntityHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ClientHandler {

    public static void setup() {
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.HUNTER, RenderHunter::new);
    }
}
