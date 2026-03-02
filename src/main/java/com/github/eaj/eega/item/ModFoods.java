package com.github.eaj.eega.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SUPER_COLDEN_APPLE_PROPS = new FoodProperties.Builder()
            // 食物效果
            .nutrition(20)            // 恢复20饥饿值（10个鸡腿）
            .saturationModifier(1.2f) // 饱和度（营养价值乘数）
            .alwaysEdible()           // 满血也能吃

            .build();
}
