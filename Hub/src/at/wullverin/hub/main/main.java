package at.wullverin.hub.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import at.wullverin.hub.config.Config;
import at.wullverin.hub.events.Events;
import at.wullverin.hub.events.PlayerItemQuitClearEvent;
import at.wullverin.hub.inventory.LobbyItemInInventory;
import at.wullverin.hub.listener.PlayerItemDropEventListener;
import at.wullverin.hub.listener.PlayerItemMoveEventListener;
//import at.wullverin.hub.listener.PlayerOpenInventoryEventListener;

public class main extends JavaPlugin implements Listener {
	
	
		public static boolean updateAvailable = false;
		public static String updateMessage ="";
		public boolean updateconfigAvailable = false;
		private FileConfiguration config = null;
		private FileConfiguration warps = null;
		private FileConfiguration hubs = null;
		private FileConfiguration locations = null;
		private FileConfiguration database = null;
		private File configFile;
		private File warpsFile;
		private File hubsFile;
		private File locationsFile;
		private File databaseFile;
		
		private final ConsoleCommandSender c = getServer().getConsoleSender();
	
	
		@Override
		public void onEnable() {
			// Konsolenausgabe beim Start bevor geladen ist!
		String pluginname = this.getDescription().getName();
		String pluginversion = this.getDescription().getVersion();
			
		System.out.println(" " + pluginname +" " + pluginversion + " wird geladen");

		PluginManager pm = Bukkit.getPluginManager();
			
		//Inventory Listener
		pm.registerEvents(new PlayerItemDropEventListener(this), this);	
		pm.registerEvents(new PlayerItemMoveEventListener(this), this);
		//pm.registerEvents(new PlayerOpenInventoryEventListener(this), this);
		pm.registerEvents(new LobbyItemInInventory(this), this);
		pm.registerEvents(new PlayerItemQuitClearEvent(this), this);
        pm.registerEvents(new Events(this), this);
        
        
		// Konsolenausgabe beim Start Laden Beendet!
		System.out.println(" " + pluginname +" " + pluginversion + " ist geladen");
		
		}
	
		@Override
		public void onDisable() {
	
		String pluginname = this.getDescription().getName();
		String pluginversion = this.getDescription().getVersion();
		System.out.println(" " + pluginname +" " + pluginversion + " wird deaktiviert");

		}
	
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {	
		
		//Umwandlung Sender -> Player
		Player p = null;
		if(sender instanceof Player){
			p = (Player)sender;
			
		}			
		
		
		
		
		//Reload Befehl
		
		if(cmd.getName().equalsIgnoreCase("hubs reload")) {
			
		}
		
		
		//Freundschafts Befehl
		if(cmd.getName().equalsIgnoreCase("friend add")){
			
		
		
		
		
	}

		return false;
	}
}
	