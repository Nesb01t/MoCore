package nesb01t.mocore.events.dungeon;

import nesb01t.mocore.utils.Message;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class PanelHandler implements Listener {
    public static String getEventItem(InventoryClickEvent event) {
        int slot = event.getSlot();
        ItemStack item = event.getClickedInventory().getItem(slot);
        String name = item.getItemMeta().getDisplayName();
        return name;
    }
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String name = getEventItem(event);
        Message.broadcast(name);
    }
}
