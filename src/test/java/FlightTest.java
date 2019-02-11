import org.junit.Before;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Plane plane2;
    Passenger  passenger;
    Passenger  passenger2;
    Passenger  passenger3;
    Passenger  passenger4;
    Passenger  passenger5;
    Flight flight;
    Flight flight2;
//    Date date;



    @Before
    public void setUp() throws Exception {
        plane = new Plane (PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BOEING787);
//        date = new Date();
        flight =  new Flight(plane, "BA2957", "MCO", "GLA", "11:00");
        passenger = new Passenger("Alan", 3);
        flight2 = new Flight(plane2, "EZ2312", "VCO", "PIK", "16:00");
        passenger2 = new Passenger("Alan", 3);
        passenger3 = new Passenger("Lindsay", 3);
        passenger4 = new Passenger("Lady", 1);
        passenger5 = new Passenger("Belle", 1);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
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

    @Test
    public void canCheckPlaneHasNoPassengers() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canReturnBookedPassengerList() {
        flight.bookPassengerOnFlight(passenger);
        assertEquals(passenger, flight.getPassengers().get(0));
    }

    @Test
    public void canAddAPassenger() {
        flight.bookPassengerOnFlight(passenger);
        assertEquals(1,flight.countPassengers());
//        assertEquals(1,flight.getPassengers() );
    }


    @Test
    public void cantOverfillThePlane() {
        assertEquals(0,flight2.countPassengers());
        assertEquals(300, flight2.getAvailableSeats());
        Passenger passenger = passenger2;
        for (int i = 0; i < 300; i++) {
            flight2.bookPassengerOnFlight(passenger);
        }
        assertEquals(300,flight2.countPassengers());
        assertEquals(0, flight2.getAvailableSeats());
        flight2.bookPassengerOnFlight(passenger);
        flight2.bookPassengerOnFlight(passenger);
        assertEquals(300,flight2.countPassengers());
        assertEquals(0, flight2.getAvailableSeats());

    }




    @Test
    public void canShowAllSeatsAreAvailable() {
        assertEquals(400, flight.getAvailableSeats());
    }

    @Test
    public void canBookAPassengerIfSeatIsAvailable() {
        flight.bookPassengerOnFlight(passenger);
        assertEquals(1, flight.countPassengers());
        assertEquals( 399, flight.getAvailableSeats());
    }


}
