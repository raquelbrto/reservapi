package com.devbrito.reservapi.core.repository;

import com.devbrito.reservapi.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
