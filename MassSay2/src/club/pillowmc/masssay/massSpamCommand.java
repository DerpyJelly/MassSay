package club.pillowmc.masssay;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class massSpamCommand implements CommandExecutor {

	// arg0      arg1     arg2
	// /MassSpam <phrase> <#>
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (player instanceof Player) {
			if (args.length > 0) {
				if (args.length == 1) {
					
				} else {
					player.sendMessage(ChatColor.RED + "Invalid usage! /MassSpam <phrase> <number of times>.");
				}
			} else {
				player.sendMessage(ChatColor.RED + "Invalid usage! /MassSpam <phrase> <number of times>.");
			}		
		}
		return false;
	}
	
}
