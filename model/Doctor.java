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
@Table (name = "Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int Doctor_ID;
	private String Doctor_FName;
	private String Doctor_LName;
	private String Doctor_Phone_Number;
	
	@ManyToOne
    @JoinColumn(name = "Departament_ID") // Nombre de la columna en Doctor que referencia a Departament
    private Departament departament;
}
