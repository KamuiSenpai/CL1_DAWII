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
@Table (name = "Staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Staff_ID;
	private String Staff_FName;
	private String Staff_LName;
	private String Staff_Address;
	private String Staff_Phone_Number;
	
	@ManyToOne
    @JoinColumn(name = "Departament_ID") // Nombre de la columna en Staff que referencia a Departament
    private Departament departament; // Nombre de la variable que representa la relación en Staff
}


