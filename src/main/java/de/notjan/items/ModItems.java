package de.notjan.items;

import de.notjan.NarcoCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WEED_LEAF = registerItem("weed_leaf", new Item(new Item.Settings()));
    public static final Item CANNABIS_SEEDS = registerItem("cannabis_seeds", new Item(new Item.Settings()));
    public static final Item CHOPPED_LEAVES = registerItem("chopped_leaves", new Item(new Item.Settings()));
    public static final Item COCA_LEAF = registerItem("coca_leaf", new Item(new Item.Settings()));
    public static final Item COCA_SEEDS = registerItem("coca_seeds", new Item(new Item.Settings()));
    public static final Item COCAINE_BRICK = registerItem("cocaine_brick", new Item(new Item.Settings()));
    public static final Item COCAINE_LINE = registerItem("cocaine_line", new Item(new Item.Settings()));
    public static final Item COCAINE_PASTE = registerItem("cocaine_paste", new Item(new Item.Settings()));
    public static final Item COCAINE_POWDER = registerItem("cocaine_powder", new Item(new Item.Settings()));
    public static final Item FLUID_COCAINE = registerItem("fluid_cocaine", new Item(new Item.Settings()));
    public static final Item TUYO_MUSIC_DISC = registerItem("tuyo_music_disc", new Item(new Item.Settings())); //.jukeboxPlayable(ModSounds.TUYO_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NarcoCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NarcoCraft.LOGGER.info("Registering Mod Items for " + NarcoCraft.MOD_ID);
    }
}
