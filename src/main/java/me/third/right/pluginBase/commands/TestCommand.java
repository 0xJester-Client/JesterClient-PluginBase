package me.third.right.pluginBase.commands;

import me.third.right.jester.command.Command;
import me.third.right.jester.command.CommandInfo;
import me.third.right.jester.command.errors.CmdException;
import me.third.right.jester.util.enums.MessageTypeEnum;
import me.third.right.jester.util.utils.ChatUtils;

@CommandInfo(name = "TestCommand", description = "Test Command", syntax = "Test Command")
public class TestCommand extends Command {

    @Override
    public void call(String[] strings) throws CmdException {
        ChatUtils.post(MessageTypeEnum.NORMAL, "Test Command Worky :P");
    }
}
