package com.humandemon.commands;

import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class APCCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.setGameMode(GameMode.CREATIVE);

        Location loc = p.getLocation();

        loc.getWorld().strikeLightningEffect(loc);
        loc.getWorld().strikeLightningEffect(loc);
        loc.getWorld().strikeLightningEffect(loc);

        loc.getWorld().spawnParticle(Particle.ENCHANT, loc, 200);

        loc.getWorld().playSound(
                loc,
                Sound.BLOCK_ENCHANTMENT_TABLE_USE,
                5,
                1
        );

        return true;
    }
}
