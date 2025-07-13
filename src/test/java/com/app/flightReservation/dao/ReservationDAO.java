package com.app.flightReservation.dao;

import com.app.flightReservation.model.Reservation;

public interface ReservationDAO {

    Reservation bookFlight(Reservation reservation);

    Reservation checkIn(long reservationId, int noOfBags);

}
