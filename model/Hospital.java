package com.cibertec.pharmacy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Hospital_ID;
	private String Hospital_Name;
	private String Hospital_Address;
	private int Hospital_Phone_Number;
	private String State;
	private String Zip_Code;

}
