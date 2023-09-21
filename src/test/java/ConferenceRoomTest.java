import org.example.Bedroom;
import org.example.ConferenceRoom;
import org.example.Guest;
import org.example.RoomType;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Barack Obama");
        guest2 = new Guest("Michael B. Jordan");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom("Presidential Suite", 10, guests);
    }

    @Test
    public void hasName() {
        assertEquals("Presidential Suite", conferenceRoom.getName());
    }

    @Test
    public void hasCorrectCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasCorrectGuests() {
        assertEquals("Barack Obama", conferenceRoom.getGuests().get(0).getName());
        assertEquals("Michael B. Jordan", conferenceRoom.getGuests().get(1).getName());
    }
}
