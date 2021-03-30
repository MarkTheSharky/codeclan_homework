package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitorYoung = new Visitor(10, 150, 40.0);
        visitorOld = new Visitor(25, 300, 40.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void canChargeHalf() {
        assertEquals(4.50, dodgems.priceFor(visitorOld), 0.0);
        assertEquals(2.25, dodgems.priceFor(visitorYoung), 0.0);
    }
}
