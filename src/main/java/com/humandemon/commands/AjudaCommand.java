package com.humandemon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AjudaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(" ");
        p.sendMessage("§4§lAJUDA HUMAN DEMON");
        p.sendMessage("§8§m----------------------");

        p.sendMessage("§c/panel §7- Painel de moderação");

        p.sendMessage("§c/inspect <player> §7- Inspeciona jogador");

        p.sendMessage("§c/freeze <player> §7- Congela jogador");

        p.sendMessage("§c/vanish §7- Invisibilidade staff");

        p.sendMessage("§c/staffmode §7- Ativa modo staff");

        p.sendMessage("§c/warn <player> <motivo> §7- Sistema de warns");

        p.sendMessage("§c/logs §7- Mostra logs");

        p.sendMessage("§c/fakejoin §7- Fake join");

        p.sendMessage("§c/fakeleave §7- Fake leave");

        p.sendMessage("§c/tpall §7- Puxa todos");

        p.sendMessage("§c/apc §7- Aparição cinematográfica");

        p.sendMessage("§c/blackout §7- Tempestade demoníaca");

        p.sendMessage("§c/signal §7- Cria sinal");

        p.sendMessage("§c/tracker <player> §7- Rastreador");

        p.sendMessage("§c/alerts §7- Alertas staff");

        p.sendMessage("§8§m----------------------");

        return true;
    }
}
