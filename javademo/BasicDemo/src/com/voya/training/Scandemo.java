package com.voya.training;

import java.util.Scanner;

public class Scandemo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the name");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("enter  id");
		int x=sc.nextInt();
		System.out.println(x);
		sc.nextLine();
		System.out.println("enter  city");
		String a=sc.nextLine();
		System.out.println(a);
		System.out.println("enter salary");
		double d=sc.nextDouble();
		System.out.println(d);
		sc.close();

	}

}
