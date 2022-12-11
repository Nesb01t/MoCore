package nesb01t.mocore.events.worldguard;

import nesb01t.mocore.utils.Message;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Blockguard implements Listener {
    public static boolean cancelledPlayerInteract = true;
    public static boolean cancelledAdminInteract = true;
    public static List<String> allowedBlockList = Collections.singletonList("ENDER_CHEST");

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        boolean isOpPlayer = event.getPlayer().isOp();
        String eventBlockName = Objects.requireNonNull(event.getClickedBlock()).getBlockData().getMaterial().name();
        boolean isAllowedBlock = allowedBlockList.contains(eventBlockName);

        if (isAllowedBlock) {
            return;
        }
        if (isOpPlayer) {
            event.setCancelled(cancelledAdminInteract);
            Message.broadcast(eventBlockName);
            return;
        }
        event.setCancelled(cancelledPlayerInteract);
    }
}
