import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void before(){
        passenger = new Passenger("Minal", 4);


    }


    @Test
    public void hasName(){
        assertEquals("Minal", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(4, passenger.getBags());
    }

    @Test
    public void canGetFlight() {
        assertEquals(null, passenger.getFlight());
    }

//    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime)
    @Test
    public void canSetFlight() {
        plane = new Plane (PlaneType.BOEING747);
        flight =  new Flight(plane, "BA2957", "MCO", "GLA", "11:00");

        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());

    }
}
