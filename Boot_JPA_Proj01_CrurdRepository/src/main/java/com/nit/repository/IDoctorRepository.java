package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {
 
}
   