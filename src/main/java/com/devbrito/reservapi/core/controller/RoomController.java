package com.devbrito.reservapi.core.controller;

import com.devbrito.reservapi.core.model.Room;
import com.devbrito.reservapi.core.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public ResponseEntity<Room> create(@RequestBody Room room) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roomService.create(room));
    }
}
