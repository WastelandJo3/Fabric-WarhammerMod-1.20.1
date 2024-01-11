package net.wastelandjoe.warhammermod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wastelandjoe.warhammermod.WarhammerMod;

public class ModBlocks {
    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block RAW_BRASS_BLOCK = registerBlock("raw_brass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block BRASS_DEPOSIT = registerBlock("brass_deposit",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WarhammerMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WarhammerMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WarhammerMod.LOGGER.info("Registering ModBlocks for " + WarhammerMod.MOD_ID);
    }
}
