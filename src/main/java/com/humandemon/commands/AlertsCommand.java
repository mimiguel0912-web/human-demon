package com.humandemon.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class AlertsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage("§cSistema de alertas ativado.");

        return true;
    }
}
