package com.kryzedev.kryzemobs.server.entity;

import com.kryzedev.kryzemobs.KryzeMobs;
import com.kryzedev.kryzemobs.server.entity.glith.EntityGlith;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = KryzeMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityHandler {

    public static EntityType<EntityGlith> GLITH;

    public static void register() {
        GLITH = register("glich", EntityType.Builder.create(EntityGlith::new, EntityClassification.CREATURE).size(1.4f, 3.4f));

        ForgeRegistries.ENTITIES.registerAll(
                GLITH
        );
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation regName = new ResourceLocation(KryzeMobs.MOD_ID,name );
        return (EntityType<T>) builder.build(name).setRegistryName(regName);
    }

    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {
        GlobalEntityTypeAttributes.put(GLITH, EntityGlith.getAttrbuteMap().create());
    }
}
