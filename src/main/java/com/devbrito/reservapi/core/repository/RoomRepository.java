package com.devbrito.reservapi.core.repository;

import com.devbrito.reservapi.core.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
