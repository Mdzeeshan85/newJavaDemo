package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl  implements IInsuranceService {

	@Autowired
	IInsuranceRepository insuranceRepository;
	
	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.addInsurance(insurance);
		
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		insuranceRepository.updateInsurance(insuranceId, premium);
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);
		
	}

	@Override
	public List<Insurance> getAll() {
		List<Insurance>insurance=insuranceRepository.findAll();
		return insurance;
	}

	@Override
	public List<Insurance> getBybrand(String brand) throws InsuranceNotFoundException {
		List<Insurance> insurance=insuranceRepository.findBybrand(brand);
		return insurance;
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
		List<Insurance>  insurance=insuranceRepository.findByBrandAndType(brand, type);
		return insurance;
	}

	@Override
	public List<Insurance> getBytypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException {
		List<Insurance> insurance=insuranceRepository.findBytypeAndLesserPremium(type, premium);
		return insurance;
	}

	@Override
	public Insurance getById(int insuranceId) throws InsuranceNotFoundException {
		Insurance  insurance=insuranceRepository.findById(insuranceId);
		if(insurance==null)
			throw new InsuranceNotFoundException("invalid id");
		return insurance;
	}

//	@Override
//	public List<Insurance> getAll() {
//		
//		return getAllInsurances();
//	}
//
//	@Override
//	public Insurance getById(int insuranceId) {
//		List<Insurance>insurances=getAllInsurances();
//		for(Insurance insurance:insurances) {
//			if(insurance.getInsuranceId()==insuranceId)
//				return insurance;
//		}
//		return null;
//	}
//	
//	private List<Insurance> getAllInsurances(){
//		return Arrays.asList(
//		new Insurance(101, "vh-h001", "voya", "health", 10, 10000),
//		new Insurance(102, "bj-m01", "bajaj", "motor", 10, 5000),
//		new Insurance(103, "fi-life", "fidelity", "life", 15, 8000),
//		new Insurance(104, "vh-mx01", "voya", "motor", 12, 3000),
//		new Insurance(105, "fi-motor", "fidelity", "motor", 20, 4500));
//	}

}
