import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightnumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightnumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightnumber = flightnumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }

    public String getFlightNumber() {
        return this.flightnumber;
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
}
