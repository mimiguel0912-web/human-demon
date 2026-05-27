package com.humandemon.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class ListaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(" ");
        p.sendMessage("§4§lHUMAN DEMON");
        p.sendMessage(" ");

        p.sendMessage("§c/panel");
        p.sendMessage("§c/inspect");
        p.sendMessage("§c/staffmode");
        p.sendMessage("§c/vanish");
        p.sendMessage("§c/freeze");
        p.sendMessage("§c/warn");
        p.sendMessage("§c/logs");
        p.sendMessage("§c/fakejoin");
        p.sendMessage("§c/fakeleave");
        p.sendMessage("§c/tpall");
        p.sendMessage("§c/apc");
        p.sendMessage("§c/blackout");
        p.sendMessage("§c/signal");
        p.sendMessage("§c/tracker");
        p.sendMessage("§c/alerts");

        p.sendMessage(" ");

        return true;
    }
}
