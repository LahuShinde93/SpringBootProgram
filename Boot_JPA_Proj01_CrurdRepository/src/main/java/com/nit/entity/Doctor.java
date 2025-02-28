//Doctor.java(entity)
package com.nit.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "JPA_DOCTOR")
@RequiredArgsConstructor
public class Doctor {

	@Id
	@Column(name = "DOCTOR_ID")
	// @SequenceGenerator(name = "gen1", sequenceName = "DOC_SEQ", initialValue =
	// 100, allocationSize = 1)
	// @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer did;

	@Column(name = "DOCTOR_NAME", length = 30)
	@NonNull
	private String dname;

	@Column(name = "DOCTOR_QLFY", length = 30)
	@NonNull
	private String qlfy;

	@Column(name = "DOCTOR_INCOME")
	@NonNull
	private Long income;

	@Column(name = "DOCTOR_MOBILENO")
	@NonNull
	private Long mobileNo;

	@Column(name = "DOCTOR_SPECIALIZATION", length = 30)
	@NonNull
	private String specialization;

}
