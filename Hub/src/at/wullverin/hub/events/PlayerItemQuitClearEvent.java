package at.wullverin.hub.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import at.wullverin.hub.main.main;

public class PlayerItemQuitClearEvent implements Listener {
	
	public main plugin;
	public PlayerItemQuitClearEvent(main plugin) {
		this.plugin = plugin;
	
	}
	
    @EventHandler
    public void onPlayerKick(PlayerKickEvent event){
        Player p = event.getPlayer();
        p.getInventory().clear();
    }
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        Player p = event.getPlayer();
        p.getInventory().clear();

    }
    
}
