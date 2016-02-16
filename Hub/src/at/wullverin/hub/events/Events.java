package at.wullverin.hub.events;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

import at.wullverin.hub.config.Config;
import at.wullverin.hub.main.main;

public class Events implements Listener {
	
	
	public static Plugin plugin;
	public Events(Plugin plugin){
		this.plugin = plugin;
		
	}
    @EventHandler
    public void onJoin(PlayerJoinEvent event) throws IOException{
        Player player = (Player)event.getPlayer();
        Config.setOnline(player, true);
    }
    
    @EventHandler
    public void onQuit(PlayerQuitEvent event) throws IOException{
            Player player = (Player)event.getPlayer();
            Config.setOnline(player, false);

    }
    
}
