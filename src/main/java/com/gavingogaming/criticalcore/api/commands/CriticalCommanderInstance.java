package com.gavingogaming.criticalcore.api.commands;

import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

}
