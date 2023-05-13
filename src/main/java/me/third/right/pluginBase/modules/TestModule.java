package me.third.right.pluginBase.modules;

import me.third.right.jester.module.ModuleInfo;
import me.third.right.jester.module.ModuleStandard;
import me.third.right.jester.util.enums.CategoryEnum;
import me.third.right.jester.util.enums.MessageTypeEnum;
import me.third.right.jester.util.utils.ChatUtils;

@ModuleInfo(name = "TestModule", description = "TestModule", category = CategoryEnum.CLIENT)
public class TestModule extends ModuleStandard {

    @Override
    protected void onEnable() {
        ChatUtils.post(MessageTypeEnum.NORMAL, "TestModule working :3");
        setEnabled(false);
    }
}
