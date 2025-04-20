package com.devbrito.reservapi.core.controller;

import com.devbrito.reservapi.core.dtos.ReservationRequestDTO;
import com.devbrito.reservapi.core.dtos.RoomStatusMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class RoomWebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/reserve-room")  // O cliente envia a mensagem para /app/reserveSeat
    @SendTo("/topic/seats")  // A resposta será enviada para todos os clientes conectados em /topic/seats
    public RoomStatusMessage reserveSeat(ReservationRequestDTO request) {
        // Lógica de reserva de assento (por exemplo, atualizar DB)
        // Retorna uma mensagem de status
        return new RoomStatusMessage(request.roomId(), "UNAVAILABLE");
    }
}
