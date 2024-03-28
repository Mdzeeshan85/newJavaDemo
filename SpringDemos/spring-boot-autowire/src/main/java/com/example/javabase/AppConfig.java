package com.example.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean
	@Primary
	public Chinese getChinese() {
	return new Chinese();
	}
	@Bean
	public Indian getIndian() {
		return new Indian();
	}
@Bean

public Japanese getJapanese() {
	return new Japanese();
}
@Bean
public Waiter getWaiter() {
	Waiter  waiter=new Waiter();
	waiter.setIndian(getChinese());
	return  new Waiter();
}
}
