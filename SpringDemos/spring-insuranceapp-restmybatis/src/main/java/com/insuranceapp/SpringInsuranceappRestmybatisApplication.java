package com.insuranceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@SpringBootApplication
public class SpringInsuranceappRestmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatisApplication.class, args);
	}

//	@Autowired
//	IInsuranceService insuranceService;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Insurance insurance=new Insurance(102,"mm-02","bajaj", "health", 11, 60000);
//		insuranceService.addInsurance(insurance);
//		
//	}

}
