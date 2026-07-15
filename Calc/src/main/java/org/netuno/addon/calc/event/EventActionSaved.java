package org.netuno.addon.calc.event;

import org.netuno.proteu.Proteu;
import org.netuno.psamata.Values;
import org.netuno.tritao.db.DataItem;
import org.netuno.tritao.event.EventBase;
import org.netuno.tritao.event.EventId;
import org.netuno.tritao.hili.Hili;

public class EventActionSaved extends EventBase {

    public EventActionSaved(Proteu proteu, Hili hili) {
        super(proteu, hili, EventId.ACTION_SAVED, 100);
    }

    @Override
    public void run(Values data) {
        System.out.println(data.get("dataItem", DataItem.class).getFormName() + " SAVED");
    }

}
