package club.pillowmc.masssay;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class massSayCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (args.length > 0) {
			StringBuilder phrase = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				phrase.append(args[i]).append(" ");
				
				for (Player online : Bukkit.getOnlinePlayers()) {
					online.chat(phrase.toString());
				}
			}
		} else {
			player.sendMessage(ChatColor.RED + "Invalid usage! /MassSay <phrase>.");
		}
		
		return false;
	}

}
