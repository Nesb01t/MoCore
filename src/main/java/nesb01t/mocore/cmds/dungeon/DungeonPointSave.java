package nesb01t.mocore.cmds.dungeon;

import nesb01t.mocore.instance.DungeonUI;
import nesb01t.mocore.utils.DungeonPoint;
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
        DungeonPoint dungeonPoint = new DungeonPoint(player.getLocation(), "测试", 1);
        DungeonUI.easyYaml.config.set("hello", dungeonPoint);
        DungeonUI.easyYaml.saveYaml();
        return false;
    }
}
