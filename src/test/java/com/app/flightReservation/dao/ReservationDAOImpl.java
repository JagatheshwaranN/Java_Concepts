package com.app.flightReservation.dao;

import com.app.flightReservation.model.Flight;
import com.app.flightReservation.model.Reservation;

import java.util.HashMap;

public class ReservationDAOImpl implements ReservationDAO {

    HashMap<Long, Flight> flightHashMap;
    HashMap<Long, Reservation> reservationHashMap;
    long reservationId;

    public ReservationDAOImpl() {
        reservationHashMap = new HashMap<>();
        flightHashMap = new HashMap<>();
        Flight flight1 = new Flight();
        flight1.setId(1001L);
        flight1.setFlightNumber("123");
        flight1.setOperatingAirlines("Indigo");
        flight1.setDepartureCity("MAS");
        flight1.setArrivalCity("BLR");
        flight1.setDateAndTimeOfDeparture("13/07/2025 9PM");
        flightHashMap.put(flight1.getId(), flight1);

        Flight flight2 = new Flight();
        flight2.setId(1002L);
        flight2.setFlightNumber("456");
        flight2.setOperatingAirlines("SpiceJet");
        flight2.setDepartureCity("DEL");
        flight2.setArrivalCity("BLR");
        flight2.setDateAndTimeOfDeparture("15/07/2025 6PM");
        flightHashMap.put(flight2.getId(), flight2);
    }

    @Override
    public Reservation bookFlight(Reservation reservation) {
        Flight flight = flightHashMap.get(reservation.getFlightId());
        reservation.setFlight(flight);
        reservationId = reservationId + 1;
        reservation.setId(reservationId);
        reservationHashMap.put(reservation.getId(), reservation);
        return reservation;
    }

    @Override
    public Reservation checkIn(long reservationId, int noOfBags) {
        Reservation reservation = reservationHashMap.get(reservationId);
        reservation.setNoOfBags(noOfBags);
        reservation.setCheckedIn(true);
        return reservation;
    }

}
