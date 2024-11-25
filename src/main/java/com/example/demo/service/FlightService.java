package com.example.demo.service;

import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlightService {

    FlightRepository flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public void createFlight(Flight flight){
        flightRepository.save(flight);
    }

    public List<Flight> findByNumber(int number){
        return flightRepository.findByFlightNumber(number);
    }
}
