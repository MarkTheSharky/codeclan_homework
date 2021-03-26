package Person;

public class CabinCrewMember extends Person {

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    public CrewRank getCrewRank() {
        return this.crewRank;
    }

    public void setRank(CrewRank rank) {
        this.crewRank = rank;
    }

    public String getRankFromEnum() {
        return this.crewRank.getRank();
    }
}
