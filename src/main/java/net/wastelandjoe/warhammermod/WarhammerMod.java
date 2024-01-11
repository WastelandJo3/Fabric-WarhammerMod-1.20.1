package net.wastelandjoe.warhammermod;

import net.fabricmc.api.ModInitializer;

import net.wastelandjoe.warhammermod.item.ModItemGroups;
import net.wastelandjoe.warhammermod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarhammerMod implements ModInitializer {
	public static final String MOD_ID = "warhammermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}