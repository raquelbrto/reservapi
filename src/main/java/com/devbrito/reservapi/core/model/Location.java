package com.devbrito.reservapi.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sector;

    @Column(nullable = false)
    private String building;

    @Column(nullable = false)
    private int floor;

    @Column(nullable = false)
    private String roomNumber;
}
