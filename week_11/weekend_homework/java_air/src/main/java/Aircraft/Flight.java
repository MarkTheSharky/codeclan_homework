package Aircraft;

import Person.CabinCrewMember;
import Person.Passenger;
import Person.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int countCabinCrewMembers() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void removeCabinCrewMember() {
        this.cabinCrewMembers.remove(0);
    }

    public void removeALLCabinCrewMembers() {
        this.cabinCrewMembers.clear();
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void removeALLPassengers() {
        this.passengers.clear();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int availableSeats() {
        int capacity = plane.planeCapacity();
        int passengers = countPassengers();
        return capacity - passengers;
    }

    public String bookPassengerToFlight(Passenger passenger) {
        int availability = availableSeats();
        if (availability > 0) {
            addPassenger(passenger);
        }
        return "Sorry, no room for you!";
    }
}
