package net.enekraftii.andiogranite.item;

import net.enekraftii.andiogranite.Andiogranite;
import net.enekraftii.andiogranite.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Andiogranite.MOD_ID);


    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("andiogranite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS))
                    .title(Component.translatable("creativetab.tutorialmod.andiogranite_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ANDESITE_BRICKS);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
