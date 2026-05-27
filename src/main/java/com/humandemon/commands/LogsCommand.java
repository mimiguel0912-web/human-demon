package com.humandemon.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class LogsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(" ");
        p.sendMessage("§4§lLOGS");
        p.sendMessage(" ");

        p.sendMessage("§cSistema de logs em desenvolvimento.");

        return true;
    }
}
