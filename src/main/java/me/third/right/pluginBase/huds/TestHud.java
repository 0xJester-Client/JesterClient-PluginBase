package me.third.right.pluginBase.huds;

import me.third.right.jester.hud.Hud;
import me.third.right.jester.hud.HudInfo;
import me.third.right.jester.util.render.FontUtils;
import net.minecraft.client.util.math.MatrixStack;

@HudInfo(name = "TestHud")
public class TestHud extends Hud {

    @Override
    public void render(MatrixStack matrixStack, float partialTicks) {
        FontUtils.drawString(matrixStack, "TestHud Working.", getX(), getY(), -1, true);
    }
}
