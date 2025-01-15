package net.omni.weaponryexpansion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omni.weaponryexpansion.WeaponryExpansion;

public class ModItems {
    public static final Item WOODEN_CLAYMORE = registerItem("wooden_claymore",
            new SwordItem(ToolMaterials.WOOD, 6, -3.1f, new FabricItemSettings()));
    public static final Item STONE_CLAYMORE = registerItem("stone_claymore",
            new SwordItem(ToolMaterials.STONE, 6, -3.1f, new FabricItemSettings()));
    public static final Item IRON_CLAYMORE = registerItem("iron_claymore",
            new SwordItem(ToolMaterials.IRON, 6, -3.0f, new FabricItemSettings()));
    public static final Item GOLDEN_CLAYMORE = registerItem("golden_claymore",
            new SwordItem(ToolMaterials.GOLD, 6, -3.0f, new FabricItemSettings()));
    public static final Item DIAMOND_CLAYMORE = registerItem("diamond_claymore",
            new SwordItem(ToolMaterials.DIAMOND, 6, -3.0f, new FabricItemSettings()));
    public static final Item NETHERITE_CLAYMORE = registerItem("netherite_claymore",
            new SwordItem(ToolMaterials.NETHERITE, 6, -3.0f, new FabricItemSettings()));
    public static final Item WOODEN_HALBERD = registerItem("wooden_halberd",
            new SwordItem(ToolMaterials.WOOD, 5, -2.9f, new FabricItemSettings()));
    public static final Item STONE_HALBERD = registerItem("stone_halberd",
            new SwordItem(ToolMaterials.STONE, 5, -2.9f, new FabricItemSettings()));
    public static final Item IRON_HALBERD = registerItem("iron_halberd",
            new SwordItem(ToolMaterials.IRON, 5, -2.8f, new FabricItemSettings()));
    public static final Item GOLDEN_HALBERD = registerItem("golden_halberd",
            new SwordItem(ToolMaterials.GOLD, 5, -2.8f, new FabricItemSettings()));
    public static final Item DIAMOND_HALBERD = registerItem("diamond_halberd",
            new SwordItem(ToolMaterials.DIAMOND, 5, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_HALBERD = registerItem("netherite_halberd",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2.8f, new FabricItemSettings()));
    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 4, -2.6f, new FabricItemSettings()));
    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE, 4, -2.6f, new FabricItemSettings()));
    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, 4, -2.6f, new FabricItemSettings()));
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",
            new SwordItem(ToolMaterials.GOLD, 4, -2.6f, new FabricItemSettings()));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, 4, -2.6f, new FabricItemSettings()));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new SwordItem(ToolMaterials.NETHERITE, 4, -2.6f, new FabricItemSettings()));
    public static final Item WOODEN_RAPIER = registerItem("wooden_rapier",
            new SwordItem(ToolMaterials.WOOD, 2, -2.2f, new FabricItemSettings()));
    public static final Item STONE_RAPIER = registerItem("stone_rapier",
            new SwordItem(ToolMaterials.STONE, 2, -2.2f, new FabricItemSettings()));
    public static final Item IRON_RAPIER = registerItem("iron_rapier",
            new SwordItem(ToolMaterials.IRON, 2, -2.2f, new FabricItemSettings()));
    public static final Item GOLDEN_RAPIER = registerItem("golden_rapier",
            new SwordItem(ToolMaterials.GOLD, 2, -2.2f, new FabricItemSettings()));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier",
            new SwordItem(ToolMaterials.DIAMOND, 2, -2.2f, new FabricItemSettings()));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",
            new SwordItem(ToolMaterials.NETHERITE, 2, -2.2f, new FabricItemSettings()));
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -2.0f, new FabricItemSettings()));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new SwordItem(ToolMaterials.STONE, 1, -2.0f, new FabricItemSettings()));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON, 1, -2.0f, new FabricItemSettings()));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new SwordItem(ToolMaterials.GOLD, 1, -2.0f, new FabricItemSettings()));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND, 1, -2.0f, new FabricItemSettings()));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE, 1, -2.0f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WeaponryExpansion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WeaponryExpansion.LOGGER.info("Registering Mod Items for " + WeaponryExpansion.MOD_ID);
    }
}
