package Aero.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PersonalStyle implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
	
	if (cmd.getName().equalsIgnoreCase("stylish") || sender.getName().equals("dsate1")) {
		 Bukkit.broadcastMessage(ChatColor.RED + "_Stylish - I love Gracie. She is my one and only. I will forever love you Gracie. I also love Gracie for actually taking the time to code this entire thing. <333");
	}else{
		sender.sendMessage(ChatColor.YELLOW + "You do not have permission to use styles command.");
		return true;
	}
	return false;

	}
}
