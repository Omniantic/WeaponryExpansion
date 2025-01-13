package net.omni.weaponryexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.omni.weaponryexpansion.WeaponryExpansion;

public class ModItemGroups {
    public static final ItemGroup WEAPONRY_EXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WeaponryExpansion.MOD_ID, "weaponry_expansion"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weaponry_expansion"))
                    .icon(() -> new ItemStack(ModItems.STONE_HALBERD)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_HALBERD);
                        entries.add(ModItems.STONE_HALBERD);
                        entries.add(ModItems.IRON_HALBERD);
                        entries.add(ModItems.GOLDEN_HALBERD);
                        entries.add(ModItems.DIAMOND_HALBERD);
                        entries.add(ModItems.NETHERITE_HALBERD);
                        entries.add(ModItems.WOODEN_CLAYMORE);
                        entries.add(ModItems.STONE_CLAYMORE);
                        entries.add(ModItems.IRON_CLAYMORE);
                        entries.add(ModItems.GOLDEN_CLAYMORE);
                        entries.add(ModItems.DIAMOND_CLAYMORE);
                        entries.add(ModItems.NETHERITE_CLAYMORE);
                        entries.add(ModItems.WOODEN_RAPIER);
                        entries.add(ModItems.STONE_RAPIER);
                        entries.add(ModItems.IRON_RAPIER);
                        entries.add(ModItems.GOLDEN_RAPIER);
                        entries.add(ModItems.DIAMOND_RAPIER);
                        entries.add(ModItems.NETHERITE_RAPIER);

                    })).build());

    public static void registerItemGroups() {
        WeaponryExpansion.LOGGER.info("Registering Item Groups for " + WeaponryExpansion.MOD_ID);
    }
}
