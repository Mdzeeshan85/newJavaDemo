package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.autowiring.ShapeFactory;
import com.example.javabase.Waiter;

@SpringBootApplication(scanBasePackages = {"com"})
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	
	@Autowired
	ShapeFactory shapefactory;
	
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		shapefactory.printArea("r", 20, 30);
		shapefactory.printArea("t", 20, 30);
		shapefactory.printArea("s", 20, 30);
		List<String> menus=waiter.viewMenucard("indian");
		for(String  menu:menus) {
			System.out.println(menu);
		}
		
	}

}
