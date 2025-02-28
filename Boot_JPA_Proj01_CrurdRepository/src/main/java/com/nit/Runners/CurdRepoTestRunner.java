package com.nit.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.service.IDoctorMgmtService;

@Component
public class CurdRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMgmtService doctorService;

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Doctor doctor = new Doctor(null, "Rahul", "MD", 95000l, 9701527l, "Cardio");
	 * 
	 * String msg = doctorService.registerDoctor(doctor); System.out.println(msg);
	 * 
	 * }
	 */

	
	@Override
	public void run(String... args) throws Exception {

		try
		{
			Doctor doc1 = new Doctor(null, "Suresh", "MD", 95000l, 9901526l, "Cardio");
			Doctor doc2 = new Doctor(null, "Mahesh", "MD", 85009l, 801529l, "Physio");
			Doctor doc3 = new Doctor(null, "Karan", "MD", 93000l, 9301524l, "nuero");

			List<Doctor> list = List.of(doc1, doc2, doc3); // Java 9 feature giving immutable collection

			String resultMsg = doctorService.registerDoctorsAsGroup(list);

			System.out.println(resultMsg);

		}catch(
		Exception e)
		{
			e.printStackTrace();
		}
	}
}

