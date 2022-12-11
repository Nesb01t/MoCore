package nesb01t.mocore;

import nesb01t.mocore.instance.Worldguard;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mocore extends JavaPlugin {

    public final static String debuggerName = "Nesb01t";
    public static JavaPlugin pluginInstance;
    public static Worldguard worldguard; // 世界保护

    @Override
    public void onEnable() {
        pluginInstance = this;
        worldguard = new Worldguard();
        getServer().getPlayer(debuggerName).sendMessage("server loaded!");
    }
}
