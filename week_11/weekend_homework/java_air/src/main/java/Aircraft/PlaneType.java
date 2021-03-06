package Aircraft;

public enum PlaneType {

    BOEING747(5, 50),
    BOEING787(2, 10)
    ;

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

}
