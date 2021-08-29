package com.kryzedev.kryzemobs.server.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class KryzeEntity extends CreatureEntity {

    public KryzeEntity(EntityType<? extends KryzeEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
