ReservAPI

- Seguindo os padrões da arquitetura limpa
- Reservas de Auditório e Sala de reunião
- Controle de transações com Lock JPA
- Banco de dados PostgreSQL
- Uso de cache com redis para diminuir chamadas ao banco
- CircuitBracker
- Criação, alteração e exclusão de usuario via eventos usando Kafka
- Websocket para comunicação em tempo real de disponibilidade
- Processamento assíncrono para o envio de emails, @Async
- Envio de emails com SendGrid ou outro
- Validar no front os horários por segundo 00s, exemplo 15h30m00s, nao permitir horários com horário do início maior que horário do fim
- Status possíveis da reserva:

        APPROVED
        PENDING_APPROVAL
        REJECTED
        CANCELLED
        FINISHED

- Quando uma reserva for cancelada ou rejeitada a sala deve ficar disponível
- Quando a reserva estiver com o status pendente a sala deve ficar indisponível
- Somente professores e admins podem alocar salas diretamente, então o status logo vira aprovado
- Status possíveis para a sala:

      RESERVED
      AVAILABLE
      UNAVAILABLE
      OCCUPIED
      MAINTENANCE

# Endpoints REST

## Reservations

**GET** ` /reserv-api/reservations`

**GET** ` /reserv-api/reservations/1`

**GET** ` /reserv-api/reservations?startTime=2025-04-20T16:00:00&endTime=2025-04-20T18:00:00
`

**DELETE** ` /reserv-api/reservations/1
`

**POST** `/reserv-api/reservations`

```json
{
  "userId": 1,
  "roomId": 1,
  "startTime": "2025-04-20T14:30:00",
  "endTime": "2025-04-20T16:00:00"
}
```

**PATCH** `reserv-api/reservations/change-status`

```json
{  
  "id": 1,
  "STATUS": "APPROVED"
}
```

## Rooms

**GET** `/reserv-api/rooms
`

**GET** `/reserv-api/rooms/1`

**GET** `/reserv-api/rooms?status=AVAILABLE`

**DELETE**  `/reserv-api/rooms/1`

**POST** `/reserv-api`
```json
{
}
```

**PATCH** `/reserv-api`
```json
{
}
```

## Users
**GET**

## Atributos

Room: name, capacity, location, status, type (Auditorium, Classroom, Laboratory), description, reason, createdAt, updatedAt
User: name, telephone, email, address, type, createdAt, updatedAt, description
Reservation: startTime, endTime, status, reason, userId, roomId, createdAt, updatedAt, approvedBy, approvalDate, rejectionReason