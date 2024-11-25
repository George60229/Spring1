package com.example.demo.controller;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@AllArgsConstructor
public class FlightController {

    FlightService flightService;


    @GetMapping
    public List<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{number}")
    public List<Flight> getFlightsByNumber(@PathVariable int number) {
        return flightService.findByNumber(number);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight createFlight(@RequestBody Flight newFlight) {
        flightService.createFlight(newFlight);
        return newFlight;
    }

}
