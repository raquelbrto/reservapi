package com.devbrito.reservapi.core.dtos;

public record UserDTO(Long id, String email, String firstName, String lastName, String password) {
}
