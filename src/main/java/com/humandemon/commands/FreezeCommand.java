package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.potion.*;

public class FreezeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (args.length == 0) {

            p.sendMessage("§cUse /freeze <player>");
            return true;
        }

        Player alvo = Bukkit.getPlayer(args[0]);

        if (alvo == null) {

            p.sendMessage("§cJogador offline.");
            return true;
        }

        alvo.addPotionEffect(new PotionEffect(
                PotionEffectType.SLOWNESS,
                999999,
                255
        ));

        alvo.sendMessage("§cVocê foi congelado.");
        p.sendMessage("§aJogador congelado.");

        return true;
    }
}
