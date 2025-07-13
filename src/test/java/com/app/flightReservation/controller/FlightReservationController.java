package com.app.flightReservation.controller;

import com.app.flightReservation.dao.ReservationDAO;
import com.app.flightReservation.dao.ReservationDAOImpl;
import com.app.flightReservation.model.Passenger;
import com.app.flightReservation.model.Reservation;

public class FlightReservationController {

    public static void main(String[] args) {

        ReservationDAO reservationDAO = new ReservationDAOImpl();
        Reservation reservation = new Reservation();
        Passenger passenger = new Passenger();
        passenger.setId(121L);
        passenger.setFirstName("John");
        passenger.setLastName("Wick");
        passenger.setPassportNumber("P12345");
        passenger.setEmailId("john@test.com");
        passenger.setPhone("1234567890");
        reservation.setPassenger(passenger);
        reservation.setFlightId(1001L);
        Reservation savedReservation = reservationDAO.bookFlight(reservation);
        System.out.println(savedReservation);
        Reservation checkedInReservation = reservationDAO.checkIn(savedReservation.getId(), 2);
        System.out.println(checkedInReservation);

    }
}
