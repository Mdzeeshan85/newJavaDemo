package com.voya.studtestcases;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exceptions.InvalidNumException;
import com.voya.training.StudentDetails;

public class StudentTest {
	StudentDetails student=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called after all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new StudentDetails();
		System.out.println("called after all testcases"); 
	}

	@AfterEach
	void tearDown() throws Exception {
		student=null;
		System.out.println("called after all testcases");
	}

	@Test
	void testTotalMarks() {
		int actual=student.totalMarks(10,20,30);
		assertEquals(actual,60,"result");
	}
//	@Tag("negative")
//	@Test
//	void testNegMarks() {
//	assertThrows(InvalidNumException.class,
//			()->student.totalMarks(90, -20, 60));
//		
//	}

}