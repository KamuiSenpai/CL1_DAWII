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
@Table (name = "Departament")
public class Departament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Departament_ID;
	private String Departament_Name;

	@ManyToOne
	@JoinColumn(name = "Hospital_ID")
    private Hospital hospital;
}
