package Aero.Commands;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class PersonalWeed implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		
		Player p = (Player)sender;
	if (cmd.getName().equalsIgnoreCase("weed") && sender.getName().equals("")) {
    	Bukkit.broadcastMessage(ChatColor.GREEN + "Smoke weed everyday!");
    	for(Player player : Bukkit.getOnlinePlayers())
        {
            PlayerInventory inv = player.getInventory();
            ItemStack weed = new ItemStack(Material.DEAD_BUSH, 1);
            ItemMeta meta = weed.getItemMeta();
            World world = player.getWorld();
            Location loc = player.getLocation();
            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "WEED");
            List<String> lore = Arrays.asList(ChatColor.LIGHT_PURPLE + "Don't do drugs kids. I never should have wrote this.");
            meta.setLore(lore);
            meta.addEnchant(Enchantment.FIRE_ASPECT, 10000, true);
            meta.addEnchant(Enchantment.KNOCKBACK, 10000, true);
            weed.setItemMeta(meta);
            inv.addItem(weed);
        }
      }else{
    	  sender.sendMessage(ChatColor.YELLOW + "You do not have permisson to use Weeds personal.");
    	  return true;
	}
	return false;
	}
}
