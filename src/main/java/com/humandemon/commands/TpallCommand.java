package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TpallCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        for (Player online : Bukkit.getOnlinePlayers()) {

            online.teleport(p);
        }

        Bukkit.broadcastMessage("§cTodos foram teleportados.");

        return true;
    }
}
