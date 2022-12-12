package nesb01t.mocore.utils;

import nesb01t.mocore.Mocore;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EasyYaml {
    public YamlConfiguration config;
    public File file;

    public EasyYaml(String name) {
        try {
            config = new YamlConfiguration();
            file = new File(Mocore.pluginInstance.getDataFolder(), name);

            if (file.exists()) {
                config.load(file);
            } else {
                config.save(file);
            }
        } catch (IOException | InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
