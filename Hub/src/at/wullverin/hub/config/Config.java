package at.wullverin.hub.config;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import at.wullverin.hub.events.Events;

public class Config {
 
       
        static int countdown = 5;
        static int count;
       
        public static void CountDown(){
                count = Bukkit.getScheduler().scheduleSyncRepeatingTask(Events.plugin, new Runnable() {
                       
                        @Override
                        public void run() {
                                if(countdown > 0){
                Bukkit.broadcastMessage("Countdown : " +countdown);
                        countdown--;
                                }else{
                                        Finish();
                                        Bukkit.getScheduler().cancelTask(count);
                                        countdown = 5;
                                }
                               
                        }
                }, 0L, 20L);
        }
       
        public static void Finish(){
                Bukkit.broadcastMessage("Der Countdown ist fertig!");
        }

		public static void setOnline(Player player, boolean b) {
			// TODO Auto-generated method stub
			

			
		}
       
}