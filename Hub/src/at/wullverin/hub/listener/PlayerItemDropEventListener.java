package at.wullverin.hub.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

import at.wullverin.hub.main.main;

public class PlayerItemDropEventListener implements Listener {
	
	public main plugin;
	public PlayerItemDropEventListener(main plugin) {
		this.plugin = plugin;
		
		}
	
		@EventHandler
		public void onDrop(PlayerDropItemEvent e){
			e.setCancelled(true);
			


		
			
		}

		@EventHandler
		public void onPlace(BlockPlaceEvent e){
			e.setCancelled(true);
		
			
		}

}
