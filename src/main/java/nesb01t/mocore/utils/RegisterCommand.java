package nesb01t.mocore.utils;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;

import static nesb01t.mocore.Mocore.pluginInstance;

public class RegisterCommand {

    public static void easyRegisterCommand(CommandExecutor commandExecutor, String name) {
        PluginCommand pluginCommand = pluginInstance.getCommand(name);
        pluginCommand.setExecutor(commandExecutor);
    }
}
