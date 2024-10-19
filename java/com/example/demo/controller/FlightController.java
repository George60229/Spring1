package com.example.demo.controller;

import com.example.demo.model.Flight;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    static List<Flight> flights = new ArrayList<>(Arrays.asList(
            new Flight(1, "newDeparture1", LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(10), 150, 1, LocalDateTime.now(), "Odesa"),
            new Flight(2, "newDeparture2", LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(5), 250, 2, LocalDateTime.now(), "Kyiv"),
            new Flight(3, "newDeparture3", LocalDateTime.now().plusHours(6), LocalDateTime.now().plusHours(9), 350, 3, LocalDateTime.now(), "Kharkiv")
    ));

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Flight> flights() {
        return flights;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Flight getFlights(@PathVariable int id) {
        return flights.stream()
                .filter(flight -> flight.getId() == id)
                .findFirst()
                .orElse(null);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight createFlight(@RequestBody Flight newFlight) {
        if (flights.stream().anyMatch(flight -> Objects.equals(flight.getId(), newFlight.getId()))) {
            throw new IllegalArgumentException("The flight with id: " + newFlight.getId() + " already exist");
        }
        flights.add(newFlight);
        return newFlight;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable int id) {
        if(flights.stream().noneMatch(flight -> flight.getId()==id)){
            throw new IllegalArgumentException("The flight with id: " + id + " is not exist");
        }
        Flight myFlight = flights.stream().filter(flight -> flight.getId() == id).findFirst().get();
        flights.remove(myFlight);
    }
}
