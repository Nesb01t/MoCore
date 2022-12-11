package nesb01t.mocore.instance;

import nesb01t.mocore.cmds.EasyReload;
import nesb01t.mocore.events.worldguard.Blockguard;
import nesb01t.mocore.utils.RegisterCommand;
import nesb01t.mocore.utils.RegisterEvent;

public class Worldguard {
    public Worldguard() {
        RegisterEvent.easyRegisterEvent(new Blockguard());
        RegisterCommand.easyRegisterCommand(new EasyReload("re"));
    }
}
