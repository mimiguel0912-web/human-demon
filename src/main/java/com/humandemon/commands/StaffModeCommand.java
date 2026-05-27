package com.humandemon.commands;

import org.bukkit.GameMode;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class StaffModeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.setAllowFlight(true);

        p.setGameMode(GameMode.CREATIVE);

        p.sendMessage("§cStaffMode ativado.");

        return true;
    }
}
