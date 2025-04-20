package com.devbrito.reservapi.core.service.validators;

import com.devbrito.reservapi.core.dtos.ReservationDTO;
import com.devbrito.reservapi.core.service.RoomService;

public class RoomAvailabilityValidator extends BaseReservationValidator {
    private RoomService roomService;

    public RoomAvailabilityValidator(ReservationValidator next, RoomService roomService) {
        super(next);
        this.roomService = roomService;
    }

    @Override
    protected void check(ReservationDTO reservation) {
//        if (!roomService.isAvailable(reservation.getRoomId(), reservation.getStartTime(), reservation.getEndTime())) {
//            throw new IllegalArgumentException("Sala indisponível para o horário solicitado.");
//        }
    }
}