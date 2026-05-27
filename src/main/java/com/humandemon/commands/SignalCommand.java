package com.humandemon.commands;

import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class SignalCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        Location loc = p.getLocation();

        loc.getWorld().strikeLightningEffect(loc);

        loc.getWorld().spawnParticle(
                Particle.FLAME,
                loc,
                300,
                1,
                2,
                1
        );

        p.sendMessage("§cSinal criado.");

        return true;
    }
}
