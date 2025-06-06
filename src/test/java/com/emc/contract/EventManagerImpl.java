package com.emc.contract;

import com.emc.entities.Event;

public class EventManagerImpl implements EventManager {
    @Override
    public Event create(long id) {
        return new Event(id, null, null, null, null, null);
    }
}
