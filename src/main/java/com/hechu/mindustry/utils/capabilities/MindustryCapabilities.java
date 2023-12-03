package com.hechu.mindustry.utils.capabilities;

import net.neoforged.neoforge.common.capabilities.Capability;
import net.neoforged.neoforge.common.capabilities.CapabilityManager;
import net.neoforged.neoforge.common.capabilities.CapabilityToken;

public class MindustryCapabilities {
    public static final Capability<IHealthHandler> HEALTH_HANDLER = CapabilityManager.get(new CapabilityToken<>(){});
}
