package org.netuno.addon.calc.event;

import org.netuno.proteu.Proteu;
import org.netuno.psamata.Values;
import org.netuno.tritao.event.EventBase;
import org.netuno.tritao.event.EventId;
import org.netuno.tritao.hili.Hili;

public class EventSetupEnd extends EventBase {

    public EventSetupEnd(Proteu proteu, Hili hili) {
        super(proteu, hili, EventId.SETUP_END, 100);
    }

    @Override
    public void run(Values data) {
        System.out.println("CUSTOM SETUP END EVENT "+ data.toJSON());
    }

}
