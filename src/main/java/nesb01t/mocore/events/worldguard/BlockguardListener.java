package nesb01t.mocore.events.worldguard;

import nesb01t.mocore.utils.Message;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class BlockguardListener implements Listener {
    public static boolean cancelledPlayerInteract = true;
    public static boolean cancelledAdminInteract = true;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Message.broadcast(Objects.requireNonNull(event.getClickedBlock()).toString());
        if (event.getPlayer().isOp()) {
            event.setCancelled(cancelledAdminInteract);
        } else {
            event.setCancelled(cancelledPlayerInteract);
        }
    }
}
