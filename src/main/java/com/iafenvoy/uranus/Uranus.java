package com.iafenvoy.uranus;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Uranus.MOD_CONTAINER_ID)
public final class Uranus {
    public static final String MOD_ID = "uranus"; // content namespace (unchanged)
    public static final String MOD_CONTAINER_ID = "uranus_port263"; // FML mod id of this unofficial port
    public static final Logger LOGGER = LogUtils.getLogger();

    public Uranus() {
    }
}
