import Person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Mark", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Mark", passenger.getName());
    }

    @Test
    public void canGetBags() {
        assertEquals(1, passenger.getBags());
    }

    @Test
    public void canSetBags() {
        passenger.setBags(2);
        assertEquals(2, passenger.getBags());
    }
}
