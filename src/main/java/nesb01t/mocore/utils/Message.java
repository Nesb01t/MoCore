package nesb01t.mocore.utils;

import java.util.Objects;

import static nesb01t.mocore.Mocore.debuggerName;
import static nesb01t.mocore.Mocore.pluginInstance;

public class Message {
    public static void broadcast(String msg) {
        pluginInstance.getLogger().info(msg);
        Objects.requireNonNull(pluginInstance.getServer().getPlayer(debuggerName)).sendMessage(msg);
    }
}
