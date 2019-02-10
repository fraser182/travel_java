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
    public void getPlaneCapacity() {
        assertEquals(400, plane.getCapacityFromEnum());
    }

    @Test
    public void getPlaneTotalMassAvailable() {
        assertEquals(18400, plane.getTotalMassAvailableFromEnum());
    }


}



