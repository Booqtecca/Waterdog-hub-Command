package hub.hubcommand.main;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import hub.hubcommand.command.ComandoHub;

public class main extends Plugin {

    @Override
    public void onEnable() {
        
        // Register  
        getProxy().getPluginManager().registerCommand(this, new ComandoHub()); 
    
    }

}
