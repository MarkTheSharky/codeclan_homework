package Aircraft;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int planeCapacity() {
        return planeType.getCapacity();
    }

    public int planeWeight() {
        return planeType.getWeight();
    }
}
