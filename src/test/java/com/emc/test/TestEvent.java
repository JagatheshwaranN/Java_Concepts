package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.entities.Participant;
import com.emc.entities.Venue;

public class TestEvent {

    public static void main() {

        Organizer organizer = new Organizer(123L, "Jaga");
        Event event = new Event(1001L, "Smart Work Launch", "Grand Launch Event", "20300101", "20300105", false);
        Venue venue = new Venue(987L, "JN Park",  "Tech Park", "Street", "City", "TamilNadu", "India", "600001");
        Participant participant = new Participant(101L, "Raja", "raja@gmail.com", false);
        System.out.println(organizer);
        System.out.println(event);
        System.out.println(venue);
        System.out.println(participant);
    }

}
