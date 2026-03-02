package com.github.eaj.eega.tab;

import com.github.eaj.eega.EasierEnhancedGoldenApple;
import com.github.eaj.eega.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EasierEnhancedGoldenApple.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EEGA_TAB = CREATIVE_MODE_TABS.register("eega_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.eega"))
                    .icon(() -> ModItems.SUPER_GOLDEN_APPLE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SUPER_GOLDEN_APPLE.get());
                    }).build());
}
