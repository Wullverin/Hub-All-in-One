package at.wullverin.hub.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

import at.wullverin.hub.main.main;

public class PlayerOpenInventoryEventListener implements Listener {
	
	public main plugin;
	public PlayerOpenInventoryEventListener(main plugin) {
		this.plugin = plugin;
		
		}

	@EventHandler
	public void onOpen(InventoryOpenEvent e){
		e.setCancelled(true);
	
	}
	
}
