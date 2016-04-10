//package Aero.Commands;

//import org.bukkit.ChatColor;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;

//public class AeroCommandProtecter implements CommandExecutor {
	
//	@Override
//	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) 
//	{
//		Player player = (Player)sender;
//		if(cmd.getName().equalsIgnoreCase("aero")) {
//				sender.sendMessage(ChatColor.YELLOW + "---- " + ChatColor.GOLD + "Help: Aero " + ChatColor.YELLOW + "-- " + ChatColor.GOLD + "Page " + ChatColor.RED + "1 " + ChatColor.GOLD + "/ " + ChatColor.RED + "1 " + ChatColor.YELLOW + "----");
//				sender.sendMessage(ChatColor.GOLD + "Command from Aero:");
//				
//			}
//		return false;
//	}
//}
