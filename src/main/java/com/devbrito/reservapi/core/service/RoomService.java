package com.devbrito.reservapi.core.service;

import com.devbrito.reservapi.core.enums.StatusRoom;
import com.devbrito.reservapi.core.model.Room;
import com.devbrito.reservapi.core.repository.RoomRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public Room create(Room room) {
        return roomRepository.save(room);
    }

    public Room findById(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found"));
    }

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public void deleteById(Long id) {
        roomRepository.deleteById(id);
    }

    public Room update(Room room) {
        return roomRepository.save(room);
    }

    public boolean isDisponible(Long id) {
        Room room = findById(id);
        return room.getStatus() == StatusRoom.AVAILABLE;
    }
}
