package Aero.Commands;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class PersonalHanson implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
	
	if (cmd.getName().equalsIgnoreCase("hanson") && sender.getName().equals("ItzHanson_") || sender.getName().equals("dsate1")) {
    	Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "You are not alone. This will help u light the way. Here, Take this my child. It'll help u light the way as dim as possible.");
    	for (Player player : Bukkit.getOnlinePlayers())
    	{
    		PlayerInventory inv = player.getInventory();
    		ItemStack torch = new ItemStack(Material.TORCH, 1);
    		ItemMeta meta = torch.getItemMeta();
    		Location loc = player.getLocation();
    		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Torch");
    		List<String> lore = Arrays.asList(ChatColor.GREEN + "<3 ~Hannson");
    		meta.setLore(lore);
    		torch.setItemMeta(meta);
    		inv.addItem(torch);
    	}
    	}else{
    		sender.sendMessage(ChatColor.YELLOW + "You do not have permission to use Hansons personal command.");
    		return true;
    	}
	return false;
	}

}
