package nesb01t.mocore.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nesb01t.mocore.Mocore.pluginInstance;

public class EasyReload extends Command {
    public EasyReload(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("try to reload server...");
        player.performCommand("reload");
        return false;
    }
}
