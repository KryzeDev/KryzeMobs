package com.kryzedev.kryzemobs.server.entity.glith;

import com.kryzedev.kryzemobs.server.entity.KryzeEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class EntityGlith extends KryzeEntity {

    public EntityGlith(EntityType<? extends KryzeEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute getAttrbuteMap() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 4.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.9D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
//      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 0.6F));
    }
}

