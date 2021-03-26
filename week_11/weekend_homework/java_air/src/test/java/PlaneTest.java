import Aircraft.Plane;
import Aircraft.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void getPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void setPlaneType() {
        plane.setPlaneType(PlaneType.BOEING787);
        assertEquals(PlaneType.BOEING787, plane.getPlaneType());
    }

    @Test
    public void getPlaneCapacity() {
        assertEquals(3, plane.planeCapacity());
    }

    @Test
    public void getPlaneWeight() {
        assertEquals(6, plane.planeWeight());
    }
}
