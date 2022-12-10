package com.klashdevelopment.criticalcore;

import com.klashdevelopment.criticalcore.api.Critical;
import com.klashdevelopment.criticalcore.api.CriticalChatUtil;
import com.klashdevelopment.criticalcore.api.commands.CriticalCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CriticalPluginDefaultCommand implements CriticalCommand {

    @Override
    public String getCommand() {
        return "critical";
    }

    @Override
    public String getDescription() {
        return "An admin command for Critical options & utility.";
    }

    @Override
    public void runCommand(CommandSender sender, Command cmdInstance, String[] args, boolean isSenderPlayer) {
        if(args.length < 1) {
            CriticalChatUtil.sendFormattedMessage(sender, "&d&lCritical&a&lCore&r&5 Options & Commands");
            CriticalChatUtil.sendFormattedMessage(sender, "&6/critical commands &f-&e List all commands");
        }else if(args[0].equalsIgnoreCase("commands")){
            for(CriticalCommand cmd : Critical.getInstanceIfExists().getCommander().criticalCommandList) {
                CriticalChatUtil.sendFormattedMessage(sender, "&6" + cmd.getCommand() + "&f - &e" + cmd.getDescription());
            }
        }
    }
}












