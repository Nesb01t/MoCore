package nesb01t.mocore.cmds.dungeon;

import nesb01t.mocore.instance.DungeonUI;
import nesb01t.mocore.utils.DungeonPoint;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DungeonPointTeleport extends Command {
    public DungeonPointTeleport(String name) {
        super(name);
    }

    public Location getLocationByName(String name) {
        DungeonPoint point = (DungeonPoint) DungeonUI.easyYaml.config.get(name);
        return point.location;
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        Location location = getLocationByName("hello");
        player.teleport(location);
        return false;
    }
}
