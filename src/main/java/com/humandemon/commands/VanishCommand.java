package com.humandemon.commands;

import com.humandemon.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        for (Player online : Bukkit.getOnlinePlayers()) {

            online.hidePlayer(Main.getPlugin(Main.class), p);
        }

        p.sendMessage("§aVanish ativado.");

        return true;
    }
}
