import Aircraft.Flight;
import Aircraft.Plane;
import Aircraft.PlaneType;
import Person.CabinCrewMember;
import Person.CrewRank;
import Person.Passenger;
import Person.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    Plane plane;
    Flight flight;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        pilot = new Pilot("Mark", CrewRank.CAPTAIN, "UK/PP/123456D/A");
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "FR756", "GLA", "LDN", "18.00");
        cabinCrewMember1 = new CabinCrewMember("David", CrewRank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Andrew", CrewRank.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Heather", CrewRank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Kerr", 1);
        passenger2 = new Passenger("Donald", 2);
        passenger3 = new Passenger("Dave", 4);
    }

    @Test
    public void canCountCabinCrewMembers() {
        assertEquals(0, flight.countCabinCrewMembers());
    }

    @Test
    public void canAddCabinCrewMember() {
        flight.addCabinCrewMember(cabinCrewMember1);
        assertEquals(1, flight.countCabinCrewMembers());
    }

    @Test //This should really be able to find and remove a specific cabin crew member.
    public void canRemoveCabinCrewMember() {
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.removeCabinCrewMember();
        assertEquals(0, flight.countCabinCrewMembers());
    }

    @Test
    public void canRemoveALLCabinCrewMembers() {
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        assertEquals(2, flight.countCabinCrewMembers());
        flight.removeALLCabinCrewMembers();
        assertEquals(0, flight.countCabinCrewMembers());
    }

    @Test
    public void countPassengers() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test //This should really be able to find and remove a specific cabin crew member.
    public void canRemovePassenger() {
        flight.addPassenger(passenger1);
        flight.removePassenger();
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canRemoveALLPassengers() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.countPassengers());
        flight.removeALLPassengers();
        assertEquals(0, flight.countCabinCrewMembers());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber() {
        flight.setFlightNumber("FR666");
        assertEquals("FR666", flight.getFlightNumber());
    }

    @Test
    public void canGetFlightDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canSetFlightDestination() {
        flight.setDestination("EDI");
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("LDN", flight.getDepartureAirport());
    }

    @Test
    public void canSetDepartureAirport() {
        flight.setDepartureAirport("LAX");
        assertEquals("LAX", flight.getDepartureAirport());
    }

    @Test
    public void canGetFlightTime() {
        assertEquals("18.00", flight.getDepartureTime());
    }

    @Test
    public void canSetFlightTime() {
        flight.setDepartureTime("00.00");
        assertEquals("00.00", flight.getDepartureTime());
    }

    @Test
    public void canCountAvailableSeats() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.countPassengers());
        assertEquals(3, flight.availableSeats());
    }

    @Test
    public void canBookPassengerToFlight() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.bookPassengerToFlight(passenger3);
        assertEquals(3, flight.countPassengers());
        assertEquals(2, flight.availableSeats());
    }

    @Test
    public void cannotBookPassengerToFlight() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(5, flight.countPassengers());
        assertEquals(0, flight.availableSeats());
        assertEquals("Sorry, no room for you!", flight.bookPassengerToFlight(passenger3));
    }
}
