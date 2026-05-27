package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class WarnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (args.length < 2) {

            p.sendMessage("§cUse /warn <player> <motivo>");
            return true;
        }

        Player alvo = Bukkit.getPlayer(args[0]);

        if (alvo == null) {

            p.sendMessage("§cJogador offline.");
            return true;
        }

        StringBuilder motivo = new StringBuilder();

        for (int i = 1; i < args.length; i++) {

            motivo.append(args[i]).append(" ");
        }

        alvo.sendMessage("§cVocê recebeu um WARN.");
        alvo.sendMessage("§7Motivo: §f" + motivo);

        Bukkit.broadcastMessage(
                "§4" + alvo.getName() + " recebeu WARN."
        );

        return true;
    }
}
