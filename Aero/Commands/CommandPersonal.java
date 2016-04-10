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

public class CommandPersonal implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("personal")) {  // Introuction to the personal command world <3
			if (args.length != 1) {
				sender.sendMessage(ChatColor.AQUA + "/personal <YourName / Name u gave me>");
            	sender.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=");
            	sender.sendMessage(ChatColor.AQUA + "Admins who already have personal commands");
            	sender.sendMessage(ChatColor.AQUA + "dsate1");
            	sender.sendMessage(ChatColor.AQUA + "weed");
            	sender.sendMessage(ChatColor.AQUA + "_ItzHanson");
            	sender.sendMessage(ChatColor.AQUA + "_Stylish");
            	sender.sendMessage(ChatColor.AQUA + "UT_Napstablook");
            	sender.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=");
                return false;                               //////////////////////////////////////////////
			}
                if (args[0].equalsIgnoreCase("dsate1")) || sender.getName().equals("dsate1") {{ // Gracie's Personal (My Own) :P
                	Bukkit.broadcastMessage(ChatColor.RED + "dsate1 - Hugging all players <3");
                	Bukkit.broadcastMessage(ChatColor.RED + "dsate1 - I love you all <3");
                }                                       // Smoke weed everyday... Just like all the tfm personal servers.
                if (args[0].equalsIgnoreCase("weed") || sender.getName().equals("dsate1")) {
                	Bukkit.broadcastMessage(ChatColor.GREEN + "Smoke weed everyday!");
                	for(Player player : Bukkit.getOnlinePlayers())
                    {
                        PlayerInventory inv = player.getInventory();
                        ItemStack weed = new ItemStack(Material.DEAD_BUSH, 1); // Adds the (weed)
                        ItemMeta meta = weed.getItemMeta();
                        World world = player.getWorld();
                        Location loc = player.getLocation();
                        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "WEED");
                        List<String> lore = Arrays.asList(ChatColor.LIGHT_PURPLE + "Don't do drugs kids. I never should have wrote this.");
                        meta.setLore(lore);
                        meta.addEnchant(Enchantment.FIRE_ASPECT, 10000, true); // Adds Enchantments
                        meta.addEnchant(Enchantment.KNOCKBACK, 10000, true);   // Adds Enchantments
                        weed.setItemMeta(meta); // Sets all ItemMeta
                        inv.addItem(weed);      // Succesfully adds the (weed) to all players inventorys on the server.
                    }
                }
                  if (args[0].equalsIgnoreCase("hanson") || sender.getName().equals("ItzHanson_") || sender.getName().equals("dsate1")) {
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
                		break;
                	}
                	 if (args[0].equalsIgnoreCase("stylish") || sender.getName().equals("_Stylish") || sender.getName().equals("dsate1")) {
                		 Bukkit.broadcastMessage(ChatColor.RED + "_Stylish - I love Gracie. She is my one and only. //This is all connected xP
                		 I will forever love you Gracie. I also love Gracie                                         // This was all requested
                		 for actually taking the time to code this entire thing. <333");                            // if you wanted to know.
                	 }
                	 if (args[0].equalsIgnoreCase("bash") || sender.getName().equals("UT_Napstablook") || sender.getName().equals("dsate1")) {
                		 Bukkit.broadcastMessage(ChatColor.RED + sender.getName() +" - I am Happy!"); // Bashers personal command :p
                		 for (Player player : Bukkit.getOnlinePlayers())
                     	{
                     		PlayerInventory inv = player.getInventory();
                     		ItemStack cookie = new ItemStack(Material.COOKIE, 1);
                     		ItemMeta meta = cookie.getItemMeta();
                     		Location loc = player.getLocation();
                     		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Happy");
                     		List<String> lore = Arrays.asList(ChatColor.GREEN + "~ Basher");
                     		meta.setLore(lore);
                     		cookie.setItemMeta(meta);
                     		inv.addItem(cookie);
                }
		return false;  // Didn't feel like remove all of these
}
		return false;
}
}
		return false; // Didn't want to remove this one either.
	}
}
