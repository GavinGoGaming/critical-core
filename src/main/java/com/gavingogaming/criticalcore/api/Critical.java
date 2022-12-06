package com.gavingogaming.criticalcore.api;

import com.gavingogaming.criticalcore.api.commands.CriticalCommander;
import com.gavingogaming.criticalcore.api.commands.CriticalCommanderInstance;
import org.bukkit.plugin.Plugin;

public class Critical {

    private CriticalCommander commander;
    private Plugin plugin;

    static Critical instance_critical;
    public static Critical getInstanceIfExists() {
        if(instance_critical == null) {
            throw new NullPointerException("Please instantiate a Critical instance atleast once before using this.");
        }else {
            return instance_critical;
        }
    }

    public Critical(Plugin p) {
        this.plugin = p;
        this.commander = new CriticalCommanderInstance();
        this.commander.addCommand(new CriticalPluginDefaultCommand());

        instance_critical = this;
    }

    public CriticalCommanderInstance getCommander() {
        return (CriticalCommanderInstance) commander;
    }
}
