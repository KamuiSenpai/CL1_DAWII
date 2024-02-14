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
@Table (name = "Invoice")

public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int Invoice_Num;
	private String Service_Descripcion;
	private Date Cost;
	private String Total;
	
	@ManyToOne
	@JoinColumn(name = "Patient_ID")
    private Patient patient;
	
}
