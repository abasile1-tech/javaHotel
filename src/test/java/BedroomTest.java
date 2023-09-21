import org.example.Bedroom;
import org.example.Guest;
import org.example.RoomType;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("J.K. Rowling");
        guest2 = new Guest("Robert Galbraith");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        bedroom = new Bedroom(47, RoomType.DOUBLE, guests);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(47, bedroom.getRoomNumber());
    }

    @Test
    public void hasCorrectCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasCorrectGuests() {
        assertEquals("J.K. Rowling", bedroom.getGuests().get(0).getName());
        assertEquals("Robert Galbraith", bedroom.getGuests().get(1).getName());
    }
}
