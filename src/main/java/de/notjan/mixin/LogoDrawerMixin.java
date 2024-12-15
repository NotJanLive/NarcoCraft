package de.notjan.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.LogoDrawer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LogoDrawer.class)
public class LogoDrawerMixin {
    @Shadow
    public static final Identifier LOGO_TEXTURE = Identifier.of("narcocraft", "textures/gui/minecraft_title.png");

    @Inject(method = "draw*", at = @At("HEAD"), cancellable = true)
    private void drawCustomLogo(DrawContext context, int screenWidth, float alpha, int y, CallbackInfo ci) {
        context.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
        RenderSystem.enableBlend();
        int logoWidth = 256;
        int logoHeight = 64;
        int logoX = screenWidth / 2 - logoWidth / 2;
        context.drawTexture(LOGO_TEXTURE, logoX, y, 0.0F, 0.0F, logoWidth, logoHeight, logoWidth, logoHeight);

        context.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableBlend();
        ci.cancel();
    }
}