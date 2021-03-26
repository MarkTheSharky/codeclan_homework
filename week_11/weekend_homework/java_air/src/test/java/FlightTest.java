import Aircraft.Flight;
import Aircraft.Plane;
import Person.CabinCrewMember;
import Person.CrewRank;
import Person.Passenger;
import Person.Pilot;
import org.junit.Before;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        flight = new Flight(pilot, plane, "FR756", "GLA", "LDN", "16.00");
        pilot = new Pilot("Mark", CrewRank.CAPTAIN, "UK/PP/123456D/A");
        cabinCrewMember1 = new CabinCrewMember("David", CrewRank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Andrew", CrewRank.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Heather", CrewRank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Kerr", 1);
        passenger2 = new Passenger("Donald", 2);
        passenger3 = new Passenger("Dave", 4);
    }
}
