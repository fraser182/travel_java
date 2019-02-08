import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Passenger  passenger;
    Flight flight;


    @Before
    public void setUp() throws Exception {
        plane = new Plane (PlaneType.BOEING787);
        flight =  new Flight(plane, "BA2957", "MCO", "GLA", "11:00");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING787, flight.getPlaneType());
    }


    @Test
    public void hasFlightNumber() {
    assertEquals("BA2957", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("MCO", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("11:00", flight.getDepartureTime());
    }
    
}
