import org.example.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest1;
    private Guest guest2;

    private Guest guest3;
    private Guest guest4;
    private ArrayList<Guest> guests1;
    private ArrayList<Guest> guests2;



    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private ArrayList<Bedroom> bedrooms;

    private Guest guest5;
    private Guest guest6;

    private Guest guest7;
    private Guest guest8;
    private ArrayList<Guest> guests3;
    private ArrayList<Guest> guests4;

    @Before
    public void before() {
        guest1 = new Guest("Stan");
        guest2 = new Guest("Helen");
        guest3 = new Guest("Enrique");
        guest4 = new Guest("Stella");
        guest5 = new Guest("Ravi");
        guest6 = new Guest("Angela");
        guest7 = new Guest("Miles");
        guest8 = new Guest("Belinda");
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        guests2 = new ArrayList<>();
        guests3 = new ArrayList<>();
        guests3.add(guest2);
        guests4 = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom("Conference Room 1", 10, guests1);
        conferenceRoom2 = new ConferenceRoom("Conference Room 2", 5, guests2);
        bedroom1 = new Bedroom(111, RoomType.DOUBLE, guests3);
        bedroom2 = new Bedroom(234, RoomType.SINGLE, guests4);
        conferenceRooms = new ArrayList<>();
        bedrooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckGuestIn() {
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
        hotel.checkGuestIn(bedroom1, guest3);
        assertEquals(2, hotel.getBedrooms().get(0).getGuests().size());
        assertEquals("Enrique", hotel.getBedrooms().get(0).getGuests().get(1).getName());
    }

    @Test
    public void canCheckGuestOut() {
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
        hotel.checkGuestIn(bedroom1, guest3);
        assertEquals(2, hotel.getBedrooms().get(0).getGuests().size());
        assertEquals("Enrique", hotel.getBedrooms().get(0).getGuests().get(1).getName());
        hotel.checkGuestOut(bedroom1, guest3);
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
        assertEquals("Helen", hotel.getBedrooms().get(0).getGuests().get(0).getName());
    }
}
