package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class Flight {
    private Integer id;
    private String departure;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private double price;
    private int flightNumber;
    private LocalDateTime creationTime;
    private String arrival;

    public Flight(Integer id, String departure, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, double price, int flightNumber, LocalDateTime creationTime, String arrival) {
        this.id = id;
        this.departure = departure;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
        this.flightNumber = flightNumber;
        this.creationTime = creationTime;
        this.arrival = arrival;
    }

}
