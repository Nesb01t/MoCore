package nesb01t.mocore.utils;

import static nesb01t.mocore.Mocore.pluginInstance;

public class Message {
    public static void broadcast(String msg) {
        pluginInstance.getLogger().info(msg);
    }
}
