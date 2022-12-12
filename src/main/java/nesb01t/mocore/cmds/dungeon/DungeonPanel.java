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

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;

        Inventory inventory = Bukkit.createInventory(player, 54);
        return false;
    }
}
