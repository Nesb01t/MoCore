package nesb01t.mocore.cmds.dungeon;

import nesb01t.mocore.instance.DungeonUI;
import nesb01t.mocore.utils.DungeonPoint;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DungeonPointSave extends Command {
    public DungeonPointSave(String name) {
        super(name);
    }

    public static DungeonPoint generatePointAtPlayer(Player player, String name, int level) {
        if (level > 3 || level < 1) level = 1;
        return new DungeonPoint(player.getLocation(), name, level);
    }

    public static void savePointToYaml(DungeonPoint dungeonPoint) {
        DungeonUI.easyYaml.config.set("hello", dungeonPoint);
        DungeonUI.easyYaml.saveYaml();
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        DungeonPoint point = generatePointAtPlayer(player, "测试", 1);
        savePointToYaml(point);
        return false;
    }
}
