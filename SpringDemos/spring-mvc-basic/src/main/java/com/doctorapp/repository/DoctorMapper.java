package com.doctorapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.springframework.jdbc.core.RowMapper;

import com.doctorapp.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		doctor.setDoctorName(rs.getString("doctor_name"));
		doctor.setDoctorId(rs.getInt("doctor_id"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setFees(rs.getDouble("fees"));
		doctor.setRatings(rs.getInt("ratings"));
		doctor.setExperience(rs.getInt("experience"));
		return null;
	}

}
