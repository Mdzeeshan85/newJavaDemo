package com.struts.actions;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//create a student object to populate the  values
	private Student student;
	
	//create a list to pre populate the values of the hobbies array
	private List<String> hobbies;
	
	
	//create a constructor to set the values for hobbies
	public StudentAction() {
		hobbies=Arrays.asList("sports","music","dance");
	}
	
	//create getter  setter for both properties
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
		this.hobbies = hobbies;
	}
	
//	@Action(value="/register",results= {
//			@Result(name="success",location="/WEB-INF/content/studsuccess.jsp"),
//			@Result(name="input",location="studform.jsp"),
//			@Result(name="error",location="/WEB-INF/content/studform.jsp")
//	})
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(student.getName().equals("zee"))
		return "success";
		else
			return "error";
	}
//	@Action(value="studform",results= {
//			@Result(name = "none",location = "/WEB-INF/content/studform.jsp")
//	})
	
	//this will be called from index.jsp
	public String showStudForm() {
		return "none";
	}
	
	
}
