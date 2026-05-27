package com.humandemon;

import com.humandemon.commands.*;
import com.humandemon.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        getCommand("lista").setExecutor(new ListaCommand());
        getCommand("ajuda").setExecutor(new AjudaCommand());
        getCommand("panel").setExecutor(new PanelCommand());
        getCommand("apc").setExecutor(new APCCommand());
        getCommand("freeze").setExecutor(new FreezeCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("staffmode").setExecutor(new StaffModeCommand());
        getCommand("inspect").setExecutor(new InspectCommand());
        getCommand("warn").setExecutor(new WarnCommand());
        getCommand("logs").setExecutor(new LogsCommand());
        getCommand("fakejoin").setExecutor(new FakeJoinCommand());
        getCommand("fakeleave").setExecutor(new FakeLeaveCommand());
        getCommand("tpall").setExecutor(new TpallCommand());
        getCommand("blackout").setExecutor(new BlackoutCommand());
        getCommand("signal").setExecutor(new SignalCommand());
        getCommand("tracker").setExecutor(new TrackerCommand());
        getCommand("alerts").setExecutor(new AlertsCommand());

        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        getLogger().info("Human Demon ligado.");
    }

    @Override
    public void onDisable() {

        getLogger().info("Human Demon desligado.");
    }
}
