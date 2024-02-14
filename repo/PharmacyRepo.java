package com.cibertec.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.pharmacy.model.Pharmacy;

public interface PharmacyRepo extends JpaRepository<Pharmacy,Integer>{

}
