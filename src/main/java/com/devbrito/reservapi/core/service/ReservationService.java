package com.devbrito.reservapi.core.service;

import com.devbrito.reservapi.core.model.Reservation;
import com.devbrito.reservapi.core.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation findById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found"));
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }
}
