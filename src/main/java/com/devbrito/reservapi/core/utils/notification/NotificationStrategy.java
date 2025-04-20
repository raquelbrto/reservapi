package com.devbrito.reservapi.core.utils.notification;

import com.devbrito.reservapi.core.dtos.MessageDTO;
import com.devbrito.reservapi.core.dtos.ReservationDTO;
import com.devbrito.reservapi.core.model.User;

public interface NotificationStrategy {
    void notify(User user, ReservationDTO reservation, MessageDTO message);
}
