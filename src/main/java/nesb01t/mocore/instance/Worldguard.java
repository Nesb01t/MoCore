package nesb01t.mocore.instance;

import nesb01t.mocore.events.worldguard.BlockguardListener;
import nesb01t.mocore.utils.RegisterEvent;

public class Worldguard {
    public Worldguard() {
        RegisterEvent.easyRegisterEvent(new BlockguardListener());
    }
}
