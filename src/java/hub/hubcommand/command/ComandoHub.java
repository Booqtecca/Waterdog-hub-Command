package hub.hubcommand.main.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ComandoHub extends Command {

    public ComandoHub() {
        super("hub"); 
    }

    
    public void execute(CommandSender sender, String[] args) {
        
        if (!(sender instanceof ProxiedPlayer)) {
            return; 
        }

        ProxiedPlayer jugador = (ProxiedPlayer) sender;
        jugador.connect(jugador.getServer().getInfo()); 
    }

}
