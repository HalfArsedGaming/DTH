package tk.halfarsedgaming.plugins.dth;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public int Start = 0;
	protected int countdown_id = -1;
public void onEnable() {
		Start = 0;
		Bukkit.broadcastMessage(ChatColor.GREEN + "DefendTheHub Enabled");
		 Bukkit.getServer().getPluginManager()
		    .registerEvents(new DTHListeners(), this);
		 countdown_id = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
                     if(Bukkit.getOnlinePlayers().length > 3){
         				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
         				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.GOLD + "Players Online "+Bukkit.getOnlinePlayers().length+"/8");
         				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.GOLD + "Get Ready The Game Is About To Start!");
         				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
         				Start = 1;
         				 if (Start == 1){
         					 for (int i = 0; i < Bukkit.getOnlinePlayers().length; i++) {
         						 Player[] onlinePlayers = Bukkit.getServer().getOnlinePlayers();
         					 
         							Player player = onlinePlayers[i];
         							player.sendMessage("Let The Game Begin!");
         							Bukkit.getServer().getScheduler().cancelTask(countdown_id);
         						}
         				 }
         				 }
         				
                     
                     if(Bukkit.getOnlinePlayers().length < 4 &&(!(Bukkit.getOnlinePlayers().length == 0))){
          				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
          				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.GOLD + "Players Online "+Bukkit.getOnlinePlayers().length+"/5");
          				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.GOLD + "Minimum Amount of Players are 4");
          				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.GOLD + "Restarting Countdown...");
          				Bukkit.broadcastMessage("[" + ChatColor.AQUA + "DROP" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
                      }
             }
     }, 1, 1200);
		 }
	
	public void onDisable(){
	
		Bukkit.broadcastMessage(ChatColor.RED + "DefendTheHub Disabled");
	}
	Plugin plugin = this;
	int id = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
	    public void run() {
	        if(Bukkit.getOnlinePlayers().length > 0 ){
	        	Bukkit.broadcastMessage("test");
	        }
	        }
	    }, 0, 2);

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
	
		if(commandLabel.equalsIgnoreCase("DTHtest")) {
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + " Game Starting!");
			Start = 1;
		}
		if(commandLabel.equalsIgnoreCase("DTHReset")) {
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + " Game Reset");
			Start = 0;
		}
		if(commandLabel.equalsIgnoreCase("DTH")) {
			if (args[0].equalsIgnoreCase("help")) {
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "Defend The Hub is a custom GameType By");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "mineman277!");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "The Objective of the game is to stay ");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "alive and defend the Hub from hordes");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "of zombies!");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "The zombie hordes come in waves,");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "The shop opens after the 3rd wave");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "so keep stocked up!");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.GOLD + "Most Importantly, Have Fun!");
			player.sendMessage("[" + ChatColor.AQUA + "DefendTheHub" + ChatColor.RESET + "]" + ChatColor.BLUE + "----------------------------------------");
			}
		}
	
		return false;

}
}

