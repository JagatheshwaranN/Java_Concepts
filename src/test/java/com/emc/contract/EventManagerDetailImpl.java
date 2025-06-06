package com.emc.contract;

import com.emc.entities.Event;

public class EventManagerDetailImpl implements EventManager {
    @Override
    public Event create(long id) {
        return new Event(id, "Birthday", "Baby Birthday party", null, null, null);
    }
}
