import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Passenger  passenger;
    Passenger  passenger2;
    Passenger  passenger3;
    Passenger  passenger4;
    Passenger  passenger5;
    Flight flight;
    FlightManager flightManager;



    @Before
    public void setUp() throws Exception {
        plane = new Plane (PlaneType.BOEING747);
        flight =  new Flight(plane, "BA2957", "MCO", "GLA", "11:00");
        passenger = new Passenger("Alan", 2);
        passenger2 = new Passenger("Alan", 1);
        passenger3 = new Passenger("Lindsay", 2);
        passenger4 = new Passenger("Lady", 1);
        passenger5 = new Passenger("Belle", 1);
        flightManager = new FlightManager(flight);
    }



    @Test
    public void canCalculateWeightReservedForAllBaggage() {
        assertEquals(9200, flightManager.calculateWeightReservedForAllBaggage());
    }

    //    The weight of a bag per person is the weight reserved for passenger bags divided by the capacity
    //    calculate how much baggage weight should be reserved for each passenger for a flight

    @Test
    public void canCalculateWeightOfBaggagePerPerson() {
        assertEquals(23, flightManager.calculateWeightOfBaggagePerPassenger());
    }



    @Test
    public void canCalculateTotalNumberOfBagsBookedOnFlight() {
        flight.bookPassengerOnFlight(passenger);
        flight.bookPassengerOnFlight(passenger2);
        flight.bookPassengerOnFlight(passenger3);
        flight.bookPassengerOnFlight(passenger4);
        assertEquals(6, flightManager.calculateTotalNumberOfBagsBookedOnPlane());
    }

    //    calculate how much baggage weight is booked by passengers of a flight
    @Test
    public void canCalculateTotalBaggageWeightBookedOnFlight() {
        flight.bookPassengerOnFlight(passenger);
        flight.bookPassengerOnFlight(passenger2);
        flight.bookPassengerOnFlight(passenger3);
        flight.bookPassengerOnFlight(passenger4);
        assertEquals(138, flightManager.calculateTotalWeightBagsBookedOnPlane());

    }


    //    calculate how much overall weight reserved for baggage remains for a flight
    @Test
    public void canCalculateRemainingBaggageWeight(){
        assertEquals(9200, flightManager.calculateRemainingBaggageWeight());
        flight.bookPassengerOnFlight(passenger);
        flight.bookPassengerOnFlight(passenger2);
        flight.bookPassengerOnFlight(passenger3);
        flight.bookPassengerOnFlight(passenger4);
        assertEquals(9062, flightManager.calculateRemainingBaggageWeight());
    }

}
