package com.devbrito.reservapi.core.repository;

import com.devbrito.reservapi.core.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
