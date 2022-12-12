package nesb01t.mocore.cmds.dungeon;

import nesb01t.mocore.instance.DungeonUI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DungeonPointSave extends Command {
    public DungeonPointSave(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        Location location = player.getLocation();
        DungeonUI.easyYaml.config.set("hello", location);
        DungeonUI.easyYaml.saveYaml();
        return false;
    }
}
