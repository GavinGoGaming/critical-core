package com.klashdevelopment.criticalcore.api.commands;

import com.klashdevelopment.criticalcore.api.Critical;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AliasCommand {

    /**
     * Makes a critical command with name as an alias for originalCommand.
     * @param name The alias command.
     * @param originalCommand The original command.
     * @return A created crititcalcommand.
     */
    public static CriticalCommand createAlias(String name, String originalCommand) {
        return new CriticalCommand() {
            @Override
            public String getCommand() {
                return name;
            }

            @Override
            public String getDescription() {
                return Critical.getInstanceIfExists().getCommander().getCommandByName(name).getDescription();
            }

            @Override
            public void runCommand(CommandSender sender, Command cmd, String[] args, boolean isSenderPlayer) {
                if(isSenderPlayer) {
                    ((Player)sender).performCommand(originalCommand);
                }else {
                    Bukkit.dispatchCommand(sender, originalCommand);
                }
            }
        };
    }

}
