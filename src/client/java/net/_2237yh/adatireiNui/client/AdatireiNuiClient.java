package net._2237yh.adatireiNui.client;

import net._2237yh.adatireiNui.AdatireiNui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AdatireiNuiClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AdatireiNui.CUSTOM_BLOCK, RenderLayer.getCutout());
    }
}
