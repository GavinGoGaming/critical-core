package com.klashdevelopment.criticalcore.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface CriticalCommand {

    /**
     * The command name (after the /)
     * @return The command name, equal to plugin.yml
     */
    public String getCommand();
    /**
     * The command description
     * @return The command description
     */
    public String getDescription();

    /**
     * This is run once the command is executed.
     * @param sender The command sender.
     * @param cmd The bukkit command instance
     * @param args The args in the command.
     * @param isSenderPlayer Is the sender instance a Player (true) or Console (false)?
     */
    public void runCommand(CommandSender sender, Command cmd, String[] args, boolean isSenderPlayer);
}
