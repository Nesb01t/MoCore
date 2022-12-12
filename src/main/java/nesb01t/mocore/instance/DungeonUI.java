package nesb01t.mocore.instance;

import nesb01t.mocore.cmds.dungeon.DungeonPanel;
import nesb01t.mocore.utils.RegisterCommand;

public class DungeonUI {
    public DungeonUI() {
        RegisterCommand.easyRegisterCommand(new DungeonPanel("dp"));
    }
}
