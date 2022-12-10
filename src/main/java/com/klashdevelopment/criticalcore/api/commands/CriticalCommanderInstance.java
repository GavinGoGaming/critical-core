package com.klashdevelopment.criticalcore.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CriticalCommanderInstance implements CriticalCommander {

    public List<CriticalCommand> criticalCommandList = new ArrayList<>();

    @Override
    public void addCommand(CriticalCommand cmd) {
        criticalCommandList.add(cmd);
    }

    @Override
    public CriticalCommand getCommandByName(String command) {
        return criticalCommandList.stream().filter(commandFound -> commandFound.getCommand().equals(command)).findFirst().get();
    }

    @Override
    public boolean onCommand(String label, Command command, String[] args, CommandSender sender) {
        for (CriticalCommand c : criticalCommandList) {
            if (label.equalsIgnoreCase(c.getCommand())) {
                c.runCommand(sender, command, args, (sender instanceof Player));
                return true;
            }
        }
        return false;
    }

}
