package org.example;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(String name, int capacity, ArrayList<Guest> guests) {
        super(capacity, guests);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
