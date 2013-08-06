package tk.halfarsedgaming.plugins.dth;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DTHListeners implements Listener{
	
	
	@EventHandler
	public Event onPlayerJoin(PlayerJoinEvent evt) {
	    Player player = evt.getPlayer(); // The player who joined
	    evt.setJoinMessage(ChatColor.AQUA+player.getName()+ChatColor.GOLD+" Joined Defend The Hub!");
	    Inventory inventory = player.getInventory();
	    inventory.clear();
	    ItemStack compass = new ItemStack(Material.COMPASS, 1);
    	ItemMeta im = compass.getItemMeta();
    	im.setDisplayName(ChatColor.RED+"Help");
    	compass.setItemMeta(im);
	    if (!(inventory.contains(compass))) {
	        inventory.addItem(compass); // Adds a stack of diamonds to the player's inventory
	    }
		return null;
	    
	}
	@EventHandler
	public Event onPlayerLeave(PlayerQuitEvent evt) {
	    Player player = evt.getPlayer(); // The player who joined
	    evt.setQuitMessage(ChatColor.AQUA+player.getName()+ChatColor.RED+" Chickened Out!");
return null;
	    }

	
	
    
    
	@EventHandler
	 public void All(PlayerInteractEvent event) {

		  Player player = event.getPlayer();
		  if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
		  if(player.getItemInHand().getType() == Material.COMPASS) {
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
	}
}
