package nesb01t.mocore.cmds.dungeon;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class DungeonPanel extends Command {
    public DungeonPanel(String name) {
        super(name);
    }

    // 打开面板
    public static void openPanel(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54);
        player.openInventory(inventory);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        openPanel(player);
        return false;
    }

}
