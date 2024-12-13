package de.notjan.items;

import de.notjan.NarcoCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NARCOCRAFT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NarcoCraft.MOD_ID, "narcocraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WEED_LEAF))
                    .displayName(Text.translatable("itemgroup.narcocraft.narcocraft_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.WEED_LEAF));
                        entries.add(new ItemStack(ModItems.CANNABIS_SEEDS));
                        entries.add(new ItemStack(ModItems.CHOPPED_LEAVES));
                        entries.add(new ItemStack(ModItems.COCA_LEAF));
                        entries.add(new ItemStack(ModItems.COCA_SEEDS));
                        entries.add(new ItemStack(ModItems.COCAINE_BRICK));
                        entries.add(new ItemStack(ModItems.COCAINE_LINE));
                        entries.add(new ItemStack(ModItems.COCAINE_PASTE));
                        entries.add(new ItemStack(ModItems.COCAINE_POWDER));
                        entries.add(new ItemStack(ModItems.FLUID_COCAINE));
                        entries.add(new ItemStack(ModItems.TUYO_MUSIC_DISC));
                    }).build());

    public static void registerItemGroups(){
        NarcoCraft.LOGGER.info("Registering Item Groups for " + NarcoCraft.MOD_ID);
    }
}
