package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flight {

    @Id
    private Integer flightId;
    @ManyToOne
    @JoinColumn(name = "cityId")
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City arrivalCity;

    private LocalDateTime createdAt;

    private String departure;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;
    private int flightNumber;
    private String arrival;


}
