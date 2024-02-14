package com.cibertec.pharmacy.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.pharmacy.model.Pharmacy;
import com.cibertec.pharmacy.repo.PharmacyRepo;
import com.cibertec.pharmacy.service.PharmacyService;

@Service

public class PharmacyServiceimpl implements PharmacyService {
	
	@Autowired
	PharmacyRepo pharmacyRepo;
 

	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy p) {
		return pharmacyRepo.save(p);
	}

	@Override
	public Pharmacy update(Pharmacy p) {
		return pharmacyRepo.save(p);
	}

	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}

}
