package com.devbrito.reservapi.core.service.validators;

import com.devbrito.reservapi.core.dtos.ReservationDTO;

public interface ReservationValidator  {
    void validate(ReservationDTO reservation);
}
