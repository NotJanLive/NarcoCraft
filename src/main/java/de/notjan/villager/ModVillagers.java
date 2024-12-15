package de.notjan.villager;

import com.google.common.collect.ImmutableSet;
import de.notjan.NarcoCraft;
import de.notjan.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> DRUG_POI_KEY = poiKey("drugpoi");
    public static final PointOfInterestType DRUG_POI = registerPoi("drugpoi", ModBlocks.DRUG_BLOCK);

    public static final VillagerProfession DRUG_ADDICT = registerProfession("drug_addict", DRUG_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(NarcoCraft.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
    }

    private static PointOfInterestType registerPoi(String name, Block block){
        return PointOfInterestHelper.register(Identifier.of(NarcoCraft.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(NarcoCraft.MOD_ID, name));
    }

    public static void registerVillagers(){
        NarcoCraft.LOGGER.info("Registering Villagers for " + NarcoCraft.MOD_ID);
    }
}
