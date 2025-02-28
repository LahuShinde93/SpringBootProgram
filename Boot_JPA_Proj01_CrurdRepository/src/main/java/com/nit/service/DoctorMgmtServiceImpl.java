package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Doctor;
import com.nit.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {

	@Autowired
	private IDoctorRepository doctorRepo; // Injects the dynamically in Memory Proxy class obj
	
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("Doc id(before save::" + doctor.getDid());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor obj is saved with id value : " + doc.getDid();
	}
	
	@Override
	public String registerDoctorsAsGroup(Iterable<Doctor> list) {

		// Save object
		Iterable<Doctor> savedList = doctorRepo.saveAll(list);
 
		// get saved object count
		List<Doctor> savedList1 = (List<Doctor>) savedList;

		int count = savedList1.size();

		// get only id values form the savedList
		List<Integer> ids = new ArrayList<>();

		savedList1.forEach(doc -> {
			ids.add(doc.getDid());
		});
		return count + " no.of doctors are saved with id values:: " + ids;
	}

}
