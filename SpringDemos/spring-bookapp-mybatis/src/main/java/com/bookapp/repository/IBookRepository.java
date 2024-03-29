package com.bookapp.repository;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookRepository {
	 void addBook(Book book);
	    void updateBook(int bookId, double price);
	    void deleteBook(int bookId);
	    List<Book> findAll();
	    List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException;
	    List<Book> findByCategory(String category) throws BookNotFoundException;
	    List<Book> findPriceLessThan(double price) throws BookNotFoundException;
	    List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	    Book findById(int bookId) throws IdNotFoundException;
}
