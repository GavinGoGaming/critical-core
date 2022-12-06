package com.gavingogaming.criticalcore.api;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CriticalChatUtil {

    public static void sendFormattedMessage(CommandSender s, String msg) {
        s.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

}
