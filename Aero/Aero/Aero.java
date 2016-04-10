package Aero.Aero;

import java.util.logging.Logger;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import Aero.Commands.*;


public class Aero extends JavaPlugin 
{
	
	@Override
	public void onEnable() {
		// System in print
		Logger.getLogger("[PC v.1] has been Enabled!");
		
		// Loads commands
		getCommand("").setExecutor(new CommandSmite());
		getCommand("esay").setExecutor(new CommandCsay());
	//Backup	getCommand("personal").setExecutor(new CommandPersonal());
		getCommand("aero").setExecutor(new AeroCommandProtecter());
	//Backup    getCommand("dsate1").setExecutor(new PersonalDsate1());
	//Backup	getCommand("weed").setExecutor(new PersonalWeed());
	//Backup	getCommand("stylish").setExecutor(new PersonalStyle());
	//Backup	getCommand("hanson").setExecutor(new PersonalHanson());
	}
	
	@Override
	public void onDisable() {
		Logger.getLogger("[PQ v.1] has been Disabled!");
		
	}

}
