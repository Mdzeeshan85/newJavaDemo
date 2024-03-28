package com.doctorapp.repository;

import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDB;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class DoctorRepositoryImpl implements IDoctorRepository {
	private JdbcTemplat jdbcTemplate;
	
	
    public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
    public void addDoctor(Doctor doctor) {
		Object[] doctorArr= {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getFees(),doctor.getRatings(),doctor.getExperience() };
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArr);
		

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
    	jdbcTemplate.update(Queries.UPDATEQUERY,doctorId,fees);

    }

    @Override
    public void deleteDoctor(int doctorId) {
    	jdbcTemplate.update(Queries.DELETEQUERY,doctorId);

    }

    @Override
    public Doctor findById(int doctorId) throws IdNotFoundException {
        Doctor doctor=jdbcTemplate.queryForObject(Queries.FINDBYIDQUERY, new DoctorMapper(),doctorId);
        return doctor;
        
    }

    @Override
    public List<Doctor> findAll() {
       RowMapper<Doctor> mapper=new DoctorMapper();
       List<Doctor>doctors=jdbcTemplate.query(Queries.FINDALLQUERY,mapper);
       return doctors;
    
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
    	 RowMapper<Doctor> mapper=new DoctorMapper();
    	 List<Doctor>doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITYQUERY,mapper,speciality);
         return doctors;
    }

    @Override
    public List<Doctor> findBySpecAndExp(String speciality, int experience) {
    	 RowMapper<Doctor> mapper=new DoctorMapper();
         List<Doctor>doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITYANDEXPQUERY,mapper,speciality,experience);
         return doctors;
    }

    @Override
    public List<Doctor> findBySpecAndLessFees(String speciality, double fees) {
    	 RowMapper<Doctor> mapper=new DoctorMapper();
         List<Doctor>doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITYANDFEESQUERY,mapper,speciality,fees);
         return doctors;
        }
        
    

    @Override
    public List<Doctor> findBySpecAndRatings(String speciality, int ratings) {
    	 RowMapper<Doctor> mapper=new DoctorMapper();
         List<Doctor>doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITYANDRATINGQUERY,mapper,speciality,ratings);
         return doctors;
    }

    @Override
    public List<Doctor> findBySpecAndNameContains(String speciality, String doctorName) {
    	 RowMapper<Doctor> mapper=new DoctorMapper();
         List<Doctor>doctors=jdbcTemplate.query(Queries.FINDBYSPECIALITYANDNAMEQUERY,mapper,speciality,doctorName);
         return doctors;
    }
}
