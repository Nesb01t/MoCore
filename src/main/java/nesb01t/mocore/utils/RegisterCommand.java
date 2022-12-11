package nesb01t.mocore.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

import static nesb01t.mocore.Mocore.pluginInstance;

public class RegisterCommand extends JavaPlugin {
    public static void easyRegisterCommand(Command command) {
        CommandMap commandMap = null;
        Field field;
        try {
            field = pluginInstance.getServer().getClass().getDeclaredField("commandMap");
            field.setAccessible(true);
            commandMap = (CommandMap) field.get(Bukkit.getServer());
            commandMap.register("Mocore", command);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
