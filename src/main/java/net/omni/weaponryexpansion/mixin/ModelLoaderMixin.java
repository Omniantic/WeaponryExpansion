package net.omni.weaponryexpansion.mixin;

import net.omni.weaponryexpansion.WeaponryExpansion;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void addModel(ModelIdentifier modelId);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;addModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 3, shift = At.Shift.AFTER))
    public void addBigModel(BlockColors blockColors, Profiler profiler, Map<Identifier, JsonUnbakedModel> jsonUnbakedModels, Map<Identifier, List<ModelLoader.SourceTrackedData>> blockStates, CallbackInfo ci) {
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "wooden_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "stone_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "iron_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "golden_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "diamond_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "netherite_claymore_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "wooden_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "stone_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "iron_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "golden_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "diamond_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "netherite_halberd_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "wooden_katana_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "stone_katana_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "iron_katana_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "golden_katana_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "diamond_katana_held", "inventory"));
        this.addModel(new ModelIdentifier(WeaponryExpansion.MOD_ID, "netherite_katana_held", "inventory"));
    }
}