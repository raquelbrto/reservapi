package com.devbrito.reservapi.core.utils.notification;

import com.devbrito.reservapi.core.dtos.MessageDTO;
import com.devbrito.reservapi.core.dtos.ReservationDTO;
import com.devbrito.reservapi.core.model.Reservation;
import com.devbrito.reservapi.core.model.User;

public class MessageNotification implements NotificationStrategy {

    public void notify(User to, ReservationDTO body, MessageDTO messageDTO) {
        //TODO
    }
}
