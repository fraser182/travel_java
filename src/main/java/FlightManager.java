public class FlightManager {

    private Flight flight;


    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    // plane reserves half their weight for baggage
    public int calculateWeightReservedForAllBaggage() {
        return (this.flight.getPlaneType().getTotalMassAvailable())/2;
    }

    //    calculate how much baggage weight should be reserved for each passenger for a flight
    //    The weight of a bag per passenger is the weight reserved for passenger bags divided by the capacity
    public int calculateWeightOfBaggagePerPassenger() {
        return (calculateWeightReservedForAllBaggage()/this.flight.getPlaneType().getCapacity());
    }


    public int calculateTotalNumberOfBagsBookedOnPlane() {
        int allBagsBookedOnPlane = 0;
        for (Passenger passenger : this.flight.getPassengers()){
            allBagsBookedOnPlane += passenger.getBags();
        }
        return allBagsBookedOnPlane;
    }

    //    calculate how much baggage weight is booked by passengers of a flight
    public int calculateTotalWeightBagsBookedOnPlane() {
        return calculateTotalNumberOfBagsBookedOnPlane() * 23;
    }

    //    calculate how much overall weight reserved for baggage remains for a flight

    public int calculateRemainingBaggageWeight() {
        return calculateWeightReservedForAllBaggage() - calculateTotalWeightBagsBookedOnPlane();

    }



}
