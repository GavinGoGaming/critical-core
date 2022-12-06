package com.gavingogaming.criticalcore.api.commands;

public interface CriticalCommander {

    public void addCommand(CriticalCommand cmd);
    public CriticalCommand getCommandByName(String command);

}
