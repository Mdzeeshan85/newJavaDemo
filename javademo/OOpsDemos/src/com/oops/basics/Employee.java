package com.oops.basics;

public class Employee {
String employeeName;
int employeeId;
double salary;
public static void main(String[] args) {
	Employee employee =new Employee();
	employee.employeeName="raju";
	employee.employeeId=12;
	employee.salary=2000;
	System.out.println("name"+employee.employeeName);
	System.out.println("id"+employee.employeeId);
	System.out.println("id"+employee.salary);
	
	Employee employee2 =new Employee();
	employee2.employeeName="hari";
	employee2.employeeId=18;
	employee2.salary=20000;
	System.out.println("name"+employee2.employeeName);
	System.out.println("id"+employee2.employeeId);
	System.out.println("id"+employee2.salary);
}	

}
