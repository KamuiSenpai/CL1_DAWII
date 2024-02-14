package com.cibertec.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.pharmacy.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {

}
