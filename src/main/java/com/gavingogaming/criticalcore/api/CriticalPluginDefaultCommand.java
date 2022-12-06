package com.gavingogaming.criticalcore.api;

import com.gavingogaming.criticalcore.api.commands.CriticalCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CriticalPluginDefaultCommand implements CriticalCommand {
    /**
     * The command name (after the /)
     *
     * @return The command name, equal to plugin.yml
     */
    @Override
    public String getCommand() {
        return "critical";
    }

    /**
     * The command description
     *
     * @return The command description
     */
    @Override
    public String getDescription() {
        return "An admin command for Critical options & utility.";
    }

    /**
     * This is run once the command is executed.
     *
     * @param sender         The command sender.
     * @param cmdInstance            The bukkit command instance
     * @param args           The args in the command.
     * @param isSenderPlayer Is the sender instance a Player (true) or Console (false)?
     */
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












