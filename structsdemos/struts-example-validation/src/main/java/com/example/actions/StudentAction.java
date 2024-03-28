package com.example.actions;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value="/WEB-INF/content/studsuccess.jsp")
//@Action(value="/studregister",results= {
//		@Result(name="success",location="studsuccess.jsp")
//})
public class StudentAction extends ActionSupport{

	private static final long serialVersionUID=1L;
	private Student  student;
	private List<String> hobbies;
	
	public StudentAction() {
		hobbies=Arrays.asList("sports","music");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports","music");
		
	}
	@Action(value="/studregister",results= {
			@Result(name="success",location="/WEB-INF/content/studsuccess.jsp"),
			@Result(name="input",location="studform.jsp"),
			@Result(name="error",location="/WEB-INF/content/studform.jsp")
	})

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(student.getName().equals("zee"))
		return SUCCESS;
		else
			return INPUT;
	}
	@Action(value="studform",results= {
			@Result(name = "none",location = "/WEB-INF/content/studform.jsp")
	})
	public String studForm() {
		return NONE;
	}
	
	@Override
	public void validate() {
		if(student!=null) {
		if(student.getName().length()<=0)
			addFieldError("student.name", "name is required");
		if(student.getAge()<20 || student.getAge()>70)
			addFieldError("student.age", "age should be btw 20 n 70");
		if(student.getCity().length()<=0)
			addFieldError("employee.city", "city is req");
//		if(student.getCourse().length()<=0)
//			addFieldError("student.course", "salary  shld gret than 20000");
		if(student.getEmail().length()<=0)
			addFieldError("student.email", "email is req");
		if(!student.getEmail().contains("@"))
			addFieldError("student.email", "email is not valid");
		if(student.getAllowance()<=0)
			addFieldError("student.allowance","allowance");
//		if(student.getGender().length()<=0)
//			addFieldError("student.gender", "not selected");
//		if(student.getHobby().length()<=0)
//			addFieldError("student.hobby", "invalid hobby");
	}}
	}
