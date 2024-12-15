package de.notjan.sound;

import de.notjan.NarcoCraft;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent NARCOS_MUSIC = registerSoundEvent("narcos");
    public static final SoundEvent TUYO = registerSoundEvent("tuyo");
    public static final RegistryKey<JukeboxSong> TUYO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NarcoCraft.MOD_ID, "tuyo"));


    public static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(NarcoCraft.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        NarcoCraft.LOGGER.info("Registering Sounds for " + NarcoCraft.MOD_ID);
    }
}
