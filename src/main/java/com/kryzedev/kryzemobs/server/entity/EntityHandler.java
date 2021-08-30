package com.kryzedev.kryzemobs.server.entity;

import com.kryzedev.kryzemobs.KryzeMobs;
import com.kryzedev.kryzemobs.server.entity.Hunter.EntityHunter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityHandler {

    public static EntityType<EntityHunter> HUNTER;

    public static void register() {
        HUNTER = register("hunter", EntityType.Builder.create(EntityHunter::new, EntityClassification.CREATURE).size(1.4f, 3.4f));

        ForgeRegistries.ENTITIES.registerAll(
                HUNTER
        );
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation regName = new ResourceLocation(KryzeMobs.MOD_ID,name );
        return (EntityType<T>) builder.build(name).setRegistryName(regName);
    }

    public static void initializeAttributes() {
        GlobalEntityTypeAttributes.put(HUNTER, EntityHunter.createAttributes().create());
    }
}
