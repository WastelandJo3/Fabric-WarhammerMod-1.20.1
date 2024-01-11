package net.wastelandjoe.warhammermod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wastelandjoe.warhammermod.WarhammerMod;

public class ModItems {
    public static final Item BRASS_SCRAP = registerItem("brass_scrap", new Item(new FabricItemSettings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new FabricItemSettings()));

    /*
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BRASS_SCRAP);
        entries.add(BRASS_INGOT);
    }
     */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WarhammerMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WarhammerMod.LOGGER.info("Registering Mod Items for " + WarhammerMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
