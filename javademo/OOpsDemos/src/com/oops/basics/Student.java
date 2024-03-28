package com.oops.basics;

public class Student {
	String studentName;
	int studentId;
	String studentcity;

	public static void main(String[] args) {
		Student student=new Student();
		student.studentName="hari";
		student.studentId=100;
		student.studentcity="banglore";
		System.out.println("name" + student.studentName);
		System.out.println("Id" + student.studentId);
		System.out.println("city" + student.studentcity);
		

	}

}