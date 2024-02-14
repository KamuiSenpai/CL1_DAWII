package com.cibertec.pharmacy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.pharmacy.model.Patient;
import com.cibertec.pharmacy.repo.PatientRepo;
import com.cibertec.pharmacy.service.PatientService;

@Service

public class PatientServiceimpl implements PatientService  {
	
	@Autowired
	PatientRepo patientRepo;

	@Override
	public List<Patient> list() {
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient pt) {
		return patientRepo.save(pt);
	}

	@Override
	public Patient update(Patient pt) {
		return patientRepo.save(pt);
	}

	@Override
	public void delete(int id) {
		patientRepo.deleteById(id);
		
	}

}
