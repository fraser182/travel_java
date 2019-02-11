
import java.util.ArrayList;
import java.util.Random;


public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }


    public int countPassengers() {
        return this.passengers.size();
    }

    public int getAvailableSeats() {
        int freeSeats = this.plane.getCapacityFromEnum();
        freeSeats -= countPassengers();
        return freeSeats;
    }

    public void bookPassengerOnFlight(Passenger passenger) {
        if(getAvailableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }

    public void AssignRandomSeatNumber(Passenger passenger){
        Random randomSeatNumber = new Random();
    }

//    Random rand = new Random();
//
//    // Obtain a number between [0 - 49].
//    int n = rand.nextInt(50);
//
//// Add 1 to the result to get a number from the required range
//// (i.e., [1 - 50]).
//    n += 1;



}
