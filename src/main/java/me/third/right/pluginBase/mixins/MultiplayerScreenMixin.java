package me.third.right.pluginBase.mixins;

import me.third.right.jester.util.enums.MessageTypeEnum;
import me.third.right.jester.util.utils.LoggerUtils;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiplayerScreen.class)
public class MultiplayerScreenMixin {

    @Inject(
            method = {"tick"},
            at = {@At("HEAD")}
    )
    public void tick(CallbackInfo ci) {
        LoggerUtils.post(MessageTypeEnum.NORMAL,"Sample text");
    }
}
