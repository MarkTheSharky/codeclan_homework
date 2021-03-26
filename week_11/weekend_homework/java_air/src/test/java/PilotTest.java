import Person.CrewRank;
import Person.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Mark", CrewRank.CAPTAIN, "UK/PP/123456D/A");
    }

    @Test
    public void getName() {
        assertEquals("Mark", pilot.getName());
    }

    @Test
    public void setName() {
        assertEquals("Mark", pilot.getName());
    }

    @Test
    public void getRank() {
        assertEquals(CrewRank.CAPTAIN, pilot.getCrewRank());
    }

    @Test
    public void setRank() {
        pilot.setRank(CrewRank.PURSER);
        assertEquals(CrewRank.PURSER, pilot.getCrewRank());
    }

    @Test
    public void getPilotLicenceNumber() {
        assertEquals("UK/PP/123456D/A", pilot.getPilotLicenceNumber());
    }

    @Test
    public void setPilotLicenceNumber() {
        pilot.setPilotLicenceNumber("UK/PP/123456D/D");
        assertEquals("UK/PP/123456D/D", pilot.getPilotLicenceNumber());
    }
}
