package Person;

public class Pilot extends CabinCrewMember {

    private String pilotLicenceNumber;

    public Pilot(String name, CrewRank crewRank, String pilotLicenceNumber) {
        super(name, crewRank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public void setPilotLicenceNumber(String pilotLicenceNumber) {
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
}
