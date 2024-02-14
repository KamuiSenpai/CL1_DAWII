package com.cibertec.pharmacy.service;

import java.util.List;

import com.cibertec.pharmacy.model.Patient;


public interface PatientService {
	
	public List<Patient> list();
	public Patient add(Patient pt);
	public Patient update(Patient pt);
	public void delete(int id);

}
