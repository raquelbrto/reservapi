package com.devbrito.reservapi.core.dtos;

import com.devbrito.reservapi.core.model.Room;
import com.devbrito.reservapi.core.model.User;

import java.time.LocalDateTime;

public record ReservationDTO(Room room, User user, LocalDateTime startTime, LocalDateTime endTime) {
}
