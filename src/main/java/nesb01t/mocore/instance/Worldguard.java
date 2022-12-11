package nesb01t.mocore.instance;

import nesb01t.mocore.utils.RegisterEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Worldguard {
    public boolean cancelledPlayerInteract = true;
    public boolean cancelledAdminInteract = false;

    public Worldguard() {
        RegisterEvent.easyRegisterEvent(new PlayerInteractListener());
    }

    // 取消玩家交互
    private class PlayerInteractListener implements Listener {
        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            if (event.getPlayer().isOp()) {
                event.setCancelled(cancelledAdminInteract);
            } else {
                event.setCancelled(cancelledPlayerInteract);
            }
        }
    }
}
