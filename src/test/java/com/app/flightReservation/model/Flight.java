package com.app.flightReservation.model;

public class Flight extends AbstractModel {

    private String flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private String arrivalCity;
    private String dateAndTimeOfDeparture;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Flight{");
        sb.append("flightNumber='").append(flightNumber).append('\'');
        sb.append(", operatingAirlines='").append(operatingAirlines).append('\'');
        sb.append(", departureCity='").append(departureCity).append('\'');
        sb.append(", arrivalCity='").append(arrivalCity).append('\'');
        sb.append(", dateAndTimeOfDeparture='").append(dateAndTimeOfDeparture).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
