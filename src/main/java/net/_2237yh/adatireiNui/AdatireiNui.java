package net._2237yh.adatireiNui;

import net._2237yh.adatireiNui.block.AdatireiNuiBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AdatireiNui implements ModInitializer {
    public static final String MOD_ID = "adatirei-nui";

    public static final Block CUSTOM_BLOCK = new AdatireiNuiBlock();
    public static final Identifier BLOCK_ID = new Identifier(MOD_ID, "adatirei-nui_block");

    public static final Block CUSTOM_BLOCK_2 = new AdatireiNuiBlock();  // 色違いなど
    public static final Identifier BLOCK_ID_2 = new Identifier(MOD_ID, "adatirei-nui_block_smile");

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, BLOCK_ID, CUSTOM_BLOCK);
        Registry.register(Registries.ITEM, BLOCK_ID, new BlockItem(CUSTOM_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, BLOCK_ID_2, CUSTOM_BLOCK_2);
        Registry.register(Registries.ITEM, BLOCK_ID_2, new BlockItem(CUSTOM_BLOCK_2, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(CUSTOM_BLOCK);
            entries.add(CUSTOM_BLOCK_2);
        });
    }
}
