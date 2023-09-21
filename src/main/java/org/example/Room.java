package org.example;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public boolean removeGuest(Guest guest) {
        for (int i =0; i < guests.size(); i++) {
            if (guests.get(i) == guest) {
                guests.remove(i);
                return true;
            }
        }
        return false;
    }
}
