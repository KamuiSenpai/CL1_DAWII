package com.cibertec.pharmacy.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Room")

public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Room_Num;
	private Date  Admission_Date;
	
	@ManyToOne
    @JoinColumn(name = "Staff_ID") // Nombre de la columna en Room que referencia a Staff
    private Staff staff; // Nombre de la variable que representa la relación en Room
	
	@OneToOne
	@JoinColumn(name = "Patient_ID") // Nombre de la variable que representa la relación en Patient
    private Patient patient; // Nombre de la variable que representa la relación en Room
}


