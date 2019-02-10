import java.util.ArrayList;

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


    public int countNumberOfPassengersCheckedIn() {
        return this.passengers.size();
    }

    public int getAvailableSeats() {
        int freeSeats = this.plane.getCapacityFromEnum();
        freeSeats -= countNumberOfPassengersCheckedIn();
        return freeSeats;
    }


    public void addIfEnoughSpace(Passenger passenger) {
        if(getAvailableSeats() > 0) {
            this.passengers.add(passenger);
        }

    }



}
