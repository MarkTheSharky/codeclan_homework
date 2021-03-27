import Person.CabinCrewMember;
import Person.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Heather", CrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void getName() {
        assertEquals("Heather", cabinCrewMember.getName());
    }

    @Test
    public void setName() {
        cabinCrewMember.setName("John");
        assertEquals("John", cabinCrewMember.getName());
    }

    @Test
    public void getCrewRank() {
        cabinCrewMember = new CabinCrewMember("Mark", CrewRank.CAPTAIN);
        assertEquals(CrewRank.CAPTAIN, cabinCrewMember.getCrewRank());
    }

    @Test
    public void setCrewRank() {
        cabinCrewMember.setRank(CrewRank.FIRST_OFFICER);
        assertEquals(CrewRank.FIRST_OFFICER, cabinCrewMember.getCrewRank());
    }

    @Test
    public void getRankFromEnum() {
        assertEquals("Flight Attendant", cabinCrewMember.getRankFromEnum());
    }

    @Test
    public void canTalkToThePassengers() {
        assertEquals("Welcome aboard JavaAir!", cabinCrewMember.talkToThePassengers());
    }
}
