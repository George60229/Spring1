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
public class Ticket {
    @Id
    private Integer ticketId;
    private String pnr;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "flightId")
    private Flight flight;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserProfile userProfile;


}
