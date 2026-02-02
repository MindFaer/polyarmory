package com.mindfaer.fabric;

import net.fabricmc.api.ModInitializer;

import com.mindfaer.Polyarmory;

public final class PolyarmoryFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Polyarmory.init();
    }
}
