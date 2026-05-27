package com.humandemon.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PanelCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        Inventory menu = Bukkit.createInventory(null, 54, "§4Painel");

        for (Player online : Bukkit.getOnlinePlayers()) {

            ItemStack head = new ItemStack(Material.PLAYER_HEAD);

            SkullMeta meta = (SkullMeta) head.getItemMeta();

            meta.setOwningPlayer(online);

            meta.setDisplayName("§c" + online.getName());

            head.setItemMeta(meta);

            menu.addItem(head);
        }

        p.openInventory(menu);

        return true;
    }
}
