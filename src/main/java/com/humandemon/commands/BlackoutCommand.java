package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class BlackoutCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        for (World world : Bukkit.getWorlds()) {

            world.setStorm(true);

            world.setThundering(true);

            world.setTime(18000);
        }

        Player p = (Player) sender;

        p.sendMessage("§4Blackout ativado.");

        return true;
    }
}
