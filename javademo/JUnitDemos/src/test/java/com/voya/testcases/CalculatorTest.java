package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator=null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("called after all the testcases");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	
	
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("called after all the testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("called after all the testcases");
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual=calculator.sum(10,20);
		assertEquals(30, actual,"output 30");
	}
	@Test
	@DisplayName("Testing product method")
	void testProudct() {
		int actual=calculator.product(5,5);
		assertEquals(25,actual,"output");
	}
	@Test
	@Disabled
	@DisplayName("Testing message method")
	void testGreet() {
		String username="pri";
		String actual=calculator.greetMessage(username);
		assertEquals("welcome PRI",actual,"not a match");
	}
	@Tag("first")
	@Test
	@DisplayName("Testing courses method")
	@Disabled
	void testShowCourses() {
		List<String> coursesInput=Arrays.asList("css","java","spring","angular","html");
		List<String> expected=Arrays.asList("angular","css","html","java","spring");
		List<String> actual=calculator.showCourses(coursesInput);
		assertEquals(expected,actual);
	}

}
