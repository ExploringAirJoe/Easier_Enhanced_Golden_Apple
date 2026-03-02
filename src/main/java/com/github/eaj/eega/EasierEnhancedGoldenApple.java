package com.github.eaj.eega;

import org.slf4j.Logger;

import com.github.eaj.eega.item.ModItems;
import com.github.eaj.eega.tab.ModCreativeTabs;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EasierEnhancedGoldenApple.MODID)
public class EasierEnhancedGoldenApple {
    public static final String MODID = "eega";

    // 日志记录器
    public static final Logger LOGGER = LogUtils.getLogger();

    public EasierEnhancedGoldenApple(IEventBus modEventBus, ModContainer modContainer) {
        // 1. 注册物品
        ModItems.ITEMS.register(modEventBus);

        // 2. 注册创造模式标签页
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        LOGGER.info("Easier Enhanced Golden Apple Mod has been initialized!");
    }
}
