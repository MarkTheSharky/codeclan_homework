
package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitorYoung = new Visitor(14, 150, 40.0);
        visitorOld = new Visitor(25, 300, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canTestAge() {
        assertTrue("You can ride", rollerCoaster.isAllowedTo(visitorYoung));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void canChargeDouble() {
        assertEquals(8.40, rollerCoaster.priceFor(visitorYoung), 0.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitorOld), 0.0);
    }
}
