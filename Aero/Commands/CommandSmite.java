package Aero.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSmite implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) 
	{
		Player player = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("smite") && sender.getName().equals("dsate1") || sender.getName().equals("Illx") || sender.getName().equals(""))  {
			
	            if (args.length != 1) {
	            	sender.sendMessage(ChatColor.RED + "/smite <player> <reason>");
	                return false;
	            }
			if (!(sender instanceof Player )) {
				sender.sendMessage(ChatColor.RED + "This command can only be used in game");
				return true;
			}
			
			Player target = Bukkit.getServer().getPlayer(args[0]);
			
			if (target == null) {
				sender.sendMessage(ChatColor.RED + args[0] + " is not online, Please make sure you entered it correctly");
				return true;
			}
					Bukkit.broadcastMessage(ChatColor.RED + target.getName() + " has been a naughty, naughty boy.");
					final Location targetPos = player.getLocation();
			        final World world = player.getWorld();
			        for (int x = -1; x <= 1; x++)
			        {
			            for (int z = -1; z <= 1; z++)
			            {
			                final Location strike_pos = new Location(world, targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
			                world.strikeLightning(strike_pos);
			            }
			        }
					target.setHealth(0);

	 }else{
		 sender.sendMessage(ChatColor.YELLOW + "You do not have permission to use this command.");
	 }
		return false;
	}
}
	