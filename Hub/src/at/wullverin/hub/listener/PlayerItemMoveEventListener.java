package at.wullverin.hub.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import at.wullverin.hub.main.main;

public class PlayerItemMoveEventListener implements Listener{
	
	public main plugin;
	public PlayerItemMoveEventListener(main plugin) {
		this.plugin = plugin;
		
		}
	
	@EventHandler
	public void onIMove(InventoryClickEvent e){
		e.setCancelled(true);
		
	}
	
}
