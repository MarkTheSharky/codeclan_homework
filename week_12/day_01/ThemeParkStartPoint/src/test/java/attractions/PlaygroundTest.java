package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorYoung = new Visitor(14, 1.2, 40.0);
        visitorOld = new Visitor(25, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsAllowedTo() {
        assertTrue("On you go son", playground.isAllowedTo(visitorYoung));
        assertFalse("Stop right there!", playground.isAllowedTo(visitorOld));
    }
}
