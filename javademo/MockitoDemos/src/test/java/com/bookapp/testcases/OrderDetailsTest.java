package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderDetailsTest {
	
	@Mock
	IBookService bookservice;//creating a proxy
	//creates an object of orderDetails();
	//inject bookService into orderDetails using tSetter
	
	@InjectMocks
	OrderDetails orderDetails;

	
	List<Book>bookList;
	Book book1,book2,book3,book4,book5,book6;
	@BeforeEach
	void setUp() throws Exception {
		
		book1=new Book("java","kathy",1900,1);
		book2=new Book("spring","kathy",800,2);
		book3=new Book("java","joe",800,3);
		book4=new Book("leadership","kathy",1800,4);
		book5=new Book("JSP ","kathy",800,5);
		book6=new Book("miracle","kathy",800,6);
		bookList=Arrays.asList(book1,book2,book3,book4,book5,book6);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testShowBooks() {
		String author="kathy";
		List<Book> booksByAuthor=Arrays.asList(book1,book2,book4,book5,book6);
		Mockito.when(bookservice.getByAuthor(author)).thenReturn(booksByAuthor);
		List<Book>expected=Arrays.asList(book5,book1,book4,book6,book2);
		//the methodto be tested.this line will be called first
		List<Book>actual=orderDetails.showBooks(author);
		assertEquals(expected,actual);
	}
	@Test
	void TestShowNoBooks() {
		String author="priya";
		Mockito.when(bookservice.getByAuthor(author)).thenReturn(new ArrayList<>());
		
		assertThrows(BookNotFoundException.class, ()->orderDetails.showNoBooks(author));
	}
	@Test
	void TestExShowBooks() {
		String author="priya";
		Mockito.when(bookservice.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		
		assertThrows(BookNotFoundException.class, ()->orderDetails.showExBooks(author));
	}

}
