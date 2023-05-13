package me.third.right.pluginBase;

import me.third.right.jester.command.Command;
import me.third.right.jester.hud.Hud;
import me.third.right.jester.module.Module;
import me.third.right.jester.plugins.PluginBase;
import me.third.right.pluginBase.commands.TestCommand;
import me.third.right.pluginBase.huds.TestHud;
import me.third.right.pluginBase.modules.TestModule;

@PluginBase.PluginInfo(name = "PluginBase", author = "Third_Right")
public class PluginMain extends PluginBase {


    @Override
    public Module[] registerHacks() {
        return new Module[] { new TestModule() };
    }

    @Override
    public Hud[] registerHuds() {
        return new Hud[] { new TestHud() };
    }

    @Override
    public Command[] registerCommands() {
        return new Command[] { new TestCommand() };
    }
}
