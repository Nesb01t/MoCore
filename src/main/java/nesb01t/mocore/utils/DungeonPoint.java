package nesb01t.mocore.utils;

import org.bukkit.Location;

public class DungeonPoint {
    public Location location;
    public String dungeonName;
    public int level;

    public DungeonPoint(Location loc, String name, int lev) {
        this.location = loc;
        this.dungeonName = name;
        this.level = lev;
    }
}
