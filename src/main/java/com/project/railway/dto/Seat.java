package com.project.railway.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@Component
public class Seat {
	@Id
	private Long seatId;
	private String seatNumber;
	private String coachType;
	private boolean isAvailable;
	@ManyToOne
	private Train train; // Many-to-One relationship with TrainDTO

}