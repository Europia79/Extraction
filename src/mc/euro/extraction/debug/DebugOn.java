package mc.euro.extraction.debug;

import mc.euro.extraction.HostagePlugin;
import java.util.Set;
import mc.alk.arena.objects.ArenaPlayer;
import org.bukkit.entity.Player;

/**
 * debug = new DebugOn(); will toggle debugging mode ON.
 */
public class DebugOn implements DebugInterface {
    
    HostagePlugin plugin;
    
    public DebugOn(HostagePlugin reference) {
        this.plugin = reference;
    }

    @Override
    public void log(String msg) {
        plugin.getLogger().info(msg);
    }

    @Override
    public void sendMessage(Player p, String msg) {
        p.sendMessage(msg);
    }

    @Override
    public void msgArenaPlayers(Set<ArenaPlayer> players, String msg) {
        for (ArenaPlayer p : players) {
            p.sendMessage(msg);
        }
    }


}
