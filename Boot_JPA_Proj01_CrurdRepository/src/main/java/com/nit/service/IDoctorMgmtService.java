//Service Interface
package com.nit.service;

import com.nit.entity.Doctor;

public interface IDoctorMgmtService {

	public String registerDoctor(Doctor doctor);
	
	public String registerDoctorsAsGroup(Iterable<Doctor> list);
}
