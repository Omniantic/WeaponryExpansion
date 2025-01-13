package net.omni.weaponryexpansion.mixin;

import net.omni.weaponryexpansion.WeaponryExpansion;
import net.omni.weaponryexpansion.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useBigModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.WOODEN_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "wooden_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.STONE_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "stone_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.IRON_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "iron_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.GOLDEN_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "golden_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.DIAMOND_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "diamond_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.NETHERITE_HALBERD) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "netherite_halberd_held", "inventory"));
        }
        if (stack.isOf(ModItems.WOODEN_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "wooden_claymore_held", "inventory"));
        }
        if (stack.isOf(ModItems.STONE_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "stone_claymore_held", "inventory"));
        }
        if (stack.isOf(ModItems.IRON_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "iron_claymore_held", "inventory"));
        }
        if (stack.isOf(ModItems.GOLDEN_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "golden_claymore_held", "inventory"));
        }
        if (stack.isOf(ModItems.DIAMOND_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "diamond_claymore_held", "inventory"));
        }
        if (stack.isOf(ModItems.NETHERITE_CLAYMORE) && renderMode != ModelTransformationMode.GUI && renderMode != ModelTransformationMode.GROUND) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "netherite_claymore_held", "inventory"));
        }
        return value;
    }
}