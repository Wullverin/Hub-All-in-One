package at.wullverin.hub.inventory;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import at.wullverin.hub.main.main;

public class LobbyItemInInventory implements Listener {
	
	
	public main plugin;
	public LobbyItemInInventory(main plugin) {
		this.plugin = plugin;
		
	}

		@EventHandler
        public void on(PlayerJoinEvent e) {
                Player p = e.getPlayer();
                
                
                ItemStack item = new ItemStack(Material.WATCH);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName("§aSpiele Lobbys");
                item.setItemMeta(meta);
                p.getInventory().setItem(0, item);
                
		}
		
		
        @EventHandler
        public void on(PlayerInteractEvent e) {
                Player p = e.getPlayer();
               
                if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                        try {
                                if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aSpiele Lobbys")) {
                                        Inventory inv = Bukkit.createInventory(null, 27, "§aSpiele Lobbys");
                                       
                                        ItemStack spawn = new ItemStack(Material.SLIME_BALL);
                                        ItemMeta spawnmeta = spawn.getItemMeta();
                                        spawnmeta.setDisplayName("§bSpawn");
                                        spawn.setItemMeta(spawnmeta);
                                       
                                        ItemStack bedwars = new ItemStack(Material.BED);
                                        ItemMeta bedwarsmeta = bedwars.getItemMeta();
                                        bedwarsmeta.setDisplayName("§bBedwars");
                                        bedwars.setItemMeta(bedwarsmeta);
                                       
                                        ItemStack sg = new ItemStack(Material.CHEST);
                                        ItemMeta sgmeta = sg.getItemMeta();
                                        sgmeta.setDisplayName("§bSurvival Games");
                                        sg.setItemMeta(sgmeta);
                                        
                                        
                                        ItemStack mb = new ItemStack(Material.PAINTING);
                                        ItemMeta mbmeta = sg.getItemMeta();
                                        mbmeta.setDisplayName("§bMasterBuilder");
                                        mb.setItemMeta(mbmeta);
                                       
                                        inv.setItem(3, bedwars);
                                        inv.setItem(0, spawn);
                                        inv.setItem(12, sg);
                                       
                                        p.openInventory(inv);
                                }
                        } catch (Exception ex) {
                        }
                }
                }
                        @EventHandler
                        public void on(InventoryClickEvent e) {
                                Player p = (Player) e.getWhoClicked();
                               
                                if (e.getInventory().getName().equalsIgnoreCase("§aSpiele Lobbys")) {
                                        try {
                                                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bSpawn")) {
                                                        p.teleport(new Location(p.getWorld(), -104, 24, 501));
                                                        e.getView().close();
                                                }
                                                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bBedwars")) {
                                                        p.teleport(new Location(p.getWorld(), -104, 23, 425));
                                                        e.getView().close();
                                                }
                                                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bSurvival Games")) {
                                                        p.teleport(new Location(p.getWorld(), -104, 23, 578));
                                                        e.getView().close();
                                                }
                                                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bMasterBuilder")) {
                                                		p.teleport(new Location(p.getWorld(), -28, 23, 501));
                                                		e.getView().close();
                                            }
                                        } catch (Exception ex) {
                                        }
                                }
                        }
                }