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
    public void getPlaneModel() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneModel());
    }

    @Test
    public void getPlaneCapacity() {
        assertEquals(416, plane.getCapacityFromEnum());
    }

    @Test
    public void getPlaneTotalMass() {
        assertEquals(50000, plane.getTotalMassAvailableFromEnum());
    }
}



