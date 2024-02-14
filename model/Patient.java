package com.cibertec.pharmacy.model;

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
@Table (name = "Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Patient_ID;
	private String Patient_FName;
	private String Patient_LName;
	private String Patient_Address;
	private String Patient_Phone_Number;
	
	@ManyToOne
	@JoinColumn(name = "Pharmacy_ID")
    private Pharmacy pharmacy;
	
	
}
