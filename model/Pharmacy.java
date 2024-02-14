package com.cibertec.pharmacy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Pharmacy")

public class Pharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Pharmacy_ID;
	private String Pharmacy_Name;
	private String Pharmacy_Address;
	private String Pharmacy_Phone_Number;

}
