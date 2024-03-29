package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	private Integer employeeId;
	private Address adress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, Integer employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	public Employee(Address adress) {
		super();
		this.adress = adress;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	@Value("Ram")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	@Value("10")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Address getAdress() {
		return adress;
	}
	@Autowired
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", adress=" + adress + "]";
	}
	

}
