package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class InspectCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (args.length == 0) {

            p.sendMessage("§cUse /inspect <player>");
            return true;
        }

        Player alvo = Bukkit.getPlayer(args[0]);

        if (alvo == null) {

            p.sendMessage("§cJogador offline.");
            return true;
        }

        p.sendMessage(" ");
        p.sendMessage("§4§lINSPECT");
        p.sendMessage(" ");

        p.sendMessage("§cNome: §f" + alvo.getName());
        p.sendMessage("§cVida: §f" + alvo.getHealth());
        p.sendMessage("§cPing: §f" + alvo.getPing());

        p.sendMessage("§cMundo: §f" + alvo.getWorld().getName());

        p.sendMessage("§cX: §f" + alvo.getLocation().getBlockX());
        p.sendMessage("§cY: §f" + alvo.getLocation().getBlockY());
        p.sendMessage("§cZ: §f" + alvo.getLocation().getBlockZ());

        return true;
    }
}
