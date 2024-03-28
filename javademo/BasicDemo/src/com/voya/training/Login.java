package com.voya.training;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames= {"hari","ravi","raju","john"};
		Scanner sc=new Scanner(System.in);
		boolean isPresent=false;
		System.out.println("enter the name");
		String uname=sc.next();
		for(String username:usernames) {
			if(username.equalsIgnoreCase(uname)) {
				System.out.println("logged  in");
				isPresent=true;
				break;
			}
		}
		if(!isPresent)
			System.out.println("login registered");

	}

}
