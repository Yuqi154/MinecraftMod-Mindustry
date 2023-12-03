package com.hechu.mindustry.utils.capabilities;

import net.neoforged.neoforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public interface IHealthHandler {
    float getHealth();
    void setHealth(float health);

    float getMaxHealth();
    void setMaxHealth(float maxHealth);
}
