package com.klashdevelopment.criticalcore.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface CriticalCommander {

    public void addCommand(CriticalCommand cmd);
    public CriticalCommand getCommandByName(String command);
    public boolean onCommand(String label, Command command, String[] args, CommandSender sender);

}
