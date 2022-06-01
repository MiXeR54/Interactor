package dev.chernykh.interactor;

import dev.chernykh.interactor.listeners.InteractorListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Interactor extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new InteractorListener(),this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
