package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TrackerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (args.length == 0) {

            p.sendMessage("§cUse /tracker <player>");
            return true;
        }

        Player alvo = Bukkit.getPlayer(args[0]);

        if (alvo == null) {

            p.sendMessage("§cJogador offline.");
            return true;
        }

        p.setCompassTarget(alvo.getLocation());

        p.sendMessage("§aRastreando " + alvo.getName());

        return true;
    }
}
