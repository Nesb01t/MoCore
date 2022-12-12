package nesb01t.mocore.instance;

import nesb01t.mocore.cmds.dungeon.DungeonPanel;
import nesb01t.mocore.cmds.dungeon.DungeonPointSave;
import nesb01t.mocore.cmds.dungeon.DungeonPointTeleport;
import nesb01t.mocore.utils.EasyYaml;
import nesb01t.mocore.utils.RegisterCommand;

public class DungeonUI {
    public static EasyYaml easyYaml;
    public DungeonUI() {
        easyYaml = new EasyYaml("dungeon_location.yml");
        RegisterCommand.easyRegisterCommand(new DungeonPanel("dp"));
        RegisterCommand.easyRegisterCommand(new DungeonPointSave("dps"));
        RegisterCommand.easyRegisterCommand(new DungeonPointTeleport("dpt"));
    }
}
