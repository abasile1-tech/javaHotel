package org.example;

import java.util.ArrayList;

public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType, ArrayList<Guest> guests) {
        super(roomType.getCapacity(), guests);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
