package Aero.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PersonalDsate1 implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		
		Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("dsate1") && sender.getName().equals("dsate1")) {
        	Bukkit.broadcastMessage(ChatColor.RED + "dsate1 - Hugging all players <3");
        	Bukkit.broadcastMessage(ChatColor.RED + "dsate1 - I love you all <3");
        }else{
        	sender.sendMessage(ChatColor.YELLOW + "You do not have permisson to use Gracie's personal.");
		return true;
        }
		return false;
	}
}
