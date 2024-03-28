package com.doctorapp.client;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.repository.IDoctorRepository;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService=new DoctorServiceImpl();
        Specialization specialization=Specialization.DERMA;
        String speciality=specialization.getSpeciality();
        Doctor doctor=new Doctor("KRISHNA",speciality,2000,3,5);
        doctorService.addDoctor(doctor);

    }
}
