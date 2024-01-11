package net.wastelandjoe.warhammermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wastelandjoe.warhammermod.WarhammerMod;

public class ModItemGroups {
    public static final ItemGroup WARHAMMER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WarhammerMod.MOD_ID, "warhammer"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.warhammer"))
                    .icon(() -> new ItemStack(ModItems.BRASS_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BRASS_SCRAP);
                        entries.add(ModItems.BRASS_INGOT);

                    }).build());

    public static void registerItemGroups() {
        WarhammerMod.LOGGER.info("Registering Item Groups for " + WarhammerMod.MOD_ID);
    }
}
