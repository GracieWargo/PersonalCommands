package Aero.Commands;

import net.md_5.bungee.api.ChatColor;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandCsay implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("esay") || sender.getName().equals("dsate1")){
			        if (args.length > 0)
			        {
			     Bukkit.broadcastMessage(String.format("§7[CONSOLE]§f<§c%s§f> %s ", sender.getName(), StringUtils.join(args, " ")));
			        }
			        return true;              // Add Console say for myself.
			    }else{
			    	sender.sendMessage(ChatColor.YELLOW + "You do not have permission to use this command.");
			    }
			
		return false;
	}
	

}
