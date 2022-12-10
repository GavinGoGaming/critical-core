package com.klashdevelopment.criticalcore.api.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class BetterConfig {

    public FileConfiguration bukkitConfig;
    public File configFile;

    public BetterConfig(FileConfiguration bukkitConfig, File pluginDataDir, String fileName) {
        this.bukkitConfig = bukkitConfig;
        this.configFile = new File(pluginDataDir, fileName);
        if(!pluginDataDir.exists()) {
            pluginDataDir.mkdirs();
        }
        if(!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (IOException e) {throw new RuntimeException("[Critical BetterConfig] The config file didnt exist and was not able to be created.", e);}
        }
    }

    public void set(String path, Object value) {
        bukkitConfig.set(path, value);
        try{bukkitConfig.save(configFile);}
        catch(Exception e){e.printStackTrace();}
    }
    public <T> T get(String path) {
        return (T) bukkitConfig.get(path);
    }
    public <T> T get(String path, Class<T> clazz) {
        return (T) clazz.cast(bukkitConfig.get(path));
    }

}
