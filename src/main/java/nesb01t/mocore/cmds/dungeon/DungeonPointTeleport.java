package nesb01t.mocore.cmds.dungeon;

import nesb01t.mocore.instance.DungeonUI;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DungeonPointTeleport extends Command {
    public DungeonPointTeleport(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        Location location = (Location) DungeonUI.easyYaml.config.get("hello");
        player.teleport(location);
        return false;
    }
}
