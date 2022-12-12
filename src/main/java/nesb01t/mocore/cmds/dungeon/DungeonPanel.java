package nesb01t.mocore.cmds.dungeon;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DungeonPanel extends Command {
    public DungeonPanel(String name) {
        super(name);
    }

    // 打开面板
    public static void openPanel(Player player) {
        Inventory inventory = createPanel(player);
        player.openInventory(inventory);
    }

    // 初始化面板
    public static Inventory createPanel(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, "[Mocore] DungeonPanel");
        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, new ItemStack(Material.IRON_INGOT));
        }
        return inventory;
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        openPanel(player);
        return false;
    }

}
