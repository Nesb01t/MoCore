package nesb01t.mocore.utils;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import static nesb01t.mocore.Mocore.pluginInstance;

public class RegisterEvent {
    public static void easyRegisterEvent(Listener listener) {
        PluginManager pluginManager = pluginInstance.getServer().getPluginManager();
        pluginManager.registerEvents(listener, pluginInstance);
    }
}
