package com.voya.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[]  usernames={"hari","ravi","john","raju"};
		Scanner sc=new Scanner(System.in);
		boolean isPresent=false;
		System.out.println("enter username");
		String uname=sc.next();
		for(String username:usernames) {
		if(username.equalsIgnoreCase(uname)) {
			System.out.println("name already exist");
			isPresent=true;
			break;
		}
		}
		if(!isPresent)
			System.out.println("your registered");
	
		
	}

}
