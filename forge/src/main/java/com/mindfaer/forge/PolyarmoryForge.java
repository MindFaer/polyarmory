package com.mindfaer.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.mindfaer.Polyarmory;

@Mod(Polyarmory.MOD_ID)
public final class PolyarmoryForge {
    public PolyarmoryForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Polyarmory.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Polyarmory.init();
    }
}
