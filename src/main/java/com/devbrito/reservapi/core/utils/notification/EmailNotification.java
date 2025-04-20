package com.devbrito.reservapi.core.utils.notification;

import com.devbrito.reservapi.core.dtos.MessageDTO;
import com.devbrito.reservapi.core.dtos.ReservationDTO;
import com.devbrito.reservapi.core.model.Reservation;
import com.devbrito.reservapi.core.model.User;
import com.devbrito.reservapi.core.service.EmailService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class EmailNotification implements NotificationStrategy {

    private final EmailService emailService;

    public void notify(User to, ReservationDTO reservation, MessageDTO messageDTO) {
        //emailService.sendEmail(to, reservation, message);
    }
}
