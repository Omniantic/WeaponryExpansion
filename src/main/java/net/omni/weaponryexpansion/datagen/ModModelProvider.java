package net.omni.weaponryexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.omni.weaponryexpansion.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.HANDHELD);
    }
}