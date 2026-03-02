package com.github.eaj.eega.item;

import com.github.eaj.eega.EasierEnhancedGoldenApple;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EasierEnhancedGoldenApple.MODID);

    public static final DeferredItem<Item> SUPER_GOLDEN_APPLE = ITEMS.registerSimpleItem("super_golden_apple", p -> p
            .rarity(Rarity.EPIC)

            // 设置食物基础属性
            .food(ModFoods.SUPER_COLDEN_APPLE_PROPS)

            // 设置消耗品属性
            .component(DataComponents.CONSUMABLE, Consumable.builder().onConsume(
                    // 给予状态&时间
                    new ApplyStatusEffectsConsumeEffect(List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 6000, 4), // 生命恢复Ⅴ，5min
                            new MobEffectInstance(MobEffects.RESISTANCE, 6000, 4), // 抗性提升Ⅴ，5min
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), // 抗火，5min
                            new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3) // 伤害吸收Ⅳ，5min
                    )))

                    // 食用时间
                    .consumeSeconds(1.0f)

                    .build())
    );
}
