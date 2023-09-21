package org.example;

import java.util.ArrayList;

public class Bedroom extends Room{
    private int roomNumber;

    public Bedroom(int capacity, ArrayList<Guest> guests, int roomNumber) {
        super(capacity, guests);
        this.roomNumber = roomNumber;
    }
}
