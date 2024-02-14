package com.cibertec.pharmacy.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Appointment")

public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int Appointment_Id;
	private Date Date;
	private Date Time;
	
	@ManyToOne
	@JoinColumn(name = "Patient_ID")
    private Patient patient;
	
	@ManyToOne
	@JoinColumn(name = "Doctor_ID")
    private Doctor doctor;

}
