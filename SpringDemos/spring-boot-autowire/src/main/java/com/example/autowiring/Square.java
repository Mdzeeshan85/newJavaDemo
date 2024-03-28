package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Square implements  Shape {

	@Override
	public void area(int x, int y) {
		System.out.println("square:"+x*x);
		
	}

}
