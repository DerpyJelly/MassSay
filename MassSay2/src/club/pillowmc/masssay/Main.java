package club.pillowmc.masssay;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("MassSay successfully loaded!");
		
		getCommand("masssay").setExecutor(new massSayCommand());
	}

}
