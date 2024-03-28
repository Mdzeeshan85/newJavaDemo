package com.struts.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class GreetAction extends  ActionSupport implements SessionAware {

	private static final long serialVersionUID=1L;
	private String name;
	private Map<String,Object> userSesion;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String execute() throws Exception{
		//create a value stack
		ValueStack stack=ActionContext.getContext().getValueStack();
		//create  key value pairs
		Map<String,Object> mapData=new HashMap<String,Object>();
		mapData.put("message", "great day");
		mapData.put("fruits",Arrays.asList("apple","orange"));
		
		//add them to the value stack
		stack.push(mapData);
		System.out.println(stack.size());
		userSesion.put("message","great day");
		userSesion.put("courses",Arrays.asList("java","spring"));
		
		return SUCCESS;
	}
	public void setSession(Map<String, Object> session) {
		userSesion=session;
		
	}
	
	
	
}
