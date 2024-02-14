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
@Table (name = "Prescription")
public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Prescription_Num;
	private String Medication_Name;
	private Date Prescription_Date;
	private String Prescription_Cost;
	
	@ManyToOne
	@JoinColumn(name = "Patient_ID")
    private Patient patient;

}
