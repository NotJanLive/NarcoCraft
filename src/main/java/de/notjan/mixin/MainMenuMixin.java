package de.notjan.mixin;

import de.notjan.sound.ModSounds;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainMenuMixin {

    private static PositionedSoundInstance customMusicInstance;

    @Inject(method = "init", at = @At("RETURN"))
    private void onInit(CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && client.getMusicTracker() != null) {
            client.getMusicTracker().stop();
            client.getSoundManager().stopAll();
            playCustomMusic(client);
        }
    }

    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && (customMusicInstance == null || !client.getSoundManager().isPlaying(customMusicInstance))) {
            playCustomMusic(client);
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            client.getMusicTracker().stop();
        }
    }

    private void playCustomMusic(MinecraftClient client) {
        if (customMusicInstance == null || !client.getSoundManager().isPlaying(customMusicInstance)) {
            customMusicInstance = PositionedSoundInstance.music(ModSounds.NARCOS_MUSIC);
            client.getSoundManager().play(customMusicInstance);
        }
    }
}