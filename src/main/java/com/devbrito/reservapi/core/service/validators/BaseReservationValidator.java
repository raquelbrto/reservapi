package com.devbrito.reservapi.core.service.validators;

import com.devbrito.reservapi.core.dtos.ReservationDTO;

public abstract class BaseReservationValidator implements ReservationValidator {
    protected ReservationValidator next;

    public BaseReservationValidator(ReservationValidator next) {
        this.next = next;
    }

    @Override
    public void validate(ReservationDTO reservation) {
        check(reservation);
        if (next != null) {
            next.validate(reservation);
        }
    }

    protected abstract void check(ReservationDTO reservation);
}
