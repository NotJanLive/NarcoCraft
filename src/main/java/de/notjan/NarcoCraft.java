package de.notjan;

import de.notjan.block.ModBlocks;
import de.notjan.items.ModItemGroups;
import de.notjan.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NarcoCraft implements ModInitializer {
	public static final String MOD_ID = "narcocraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}