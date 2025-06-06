package com.emc.test;

import com.emc.contract.EventManager;
import com.emc.contract.EventManagerDetailImpl;
import com.emc.contract.EventManagerImpl;
import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.entities.Participant;
import com.emc.entities.Venue;

public class TestEvent {

    public static void main() {

        Organizer organizer = new Organizer();
        organizer.setId(123L);
        organizer.setName("Jaga");
        Event event = new Event(1001L, "Smart Work Launch", "Grand Launch Event", "20300101", "20300105", false);
        Venue venue = new Venue(987L, "JN Park",  "Tech Park", "Street", "City", "TamilNadu", "India", "600001");
        Participant participant = new Participant(101L, "Raja", "raja@gmail.com", false);
        System.out.println(organizer);
        System.out.println(event);
        System.out.println(venue);
        System.out.println(participant);

        EventManager eventManager = new EventManagerImpl();
        System.out.println(eventManager.create(455L).getId());

        EventManager eventManager2 = new EventManagerDetailImpl();
        System.out.println(eventManager2.create(204).getId());
        System.out.println(eventManager2.create(455L).getName());
    }
}
