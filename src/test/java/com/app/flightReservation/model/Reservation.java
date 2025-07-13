package com.app.flightReservation.model;

public class Reservation extends  AbstractModel {

    private Flight flight;
    private Passenger passenger;
    private long flightId;
    private int noOfBags;
    private boolean checkedIn;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reservation{");
        sb.append("flight=").append(flight);
        sb.append(", passenger=").append(passenger);
        sb.append(", flightId=").append(flightId);
        sb.append(", noOfBags=").append(noOfBags);
        sb.append(", checkedIn=").append(checkedIn);
        sb.append('}');
        return sb.toString();
    }

}
