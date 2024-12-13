package de.notjan.datagen;

import de.notjan.block.ModBlocks;
import de.notjan.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRUG_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WEED_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANNABIS_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOPPED_LEAVES, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE_LINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE_PASTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLUID_COCAINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUYO_MUSIC_DISC, Models.GENERATED);
    }
}
