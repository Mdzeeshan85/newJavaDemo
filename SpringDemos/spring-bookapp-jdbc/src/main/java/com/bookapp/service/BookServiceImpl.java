package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository bookRepository;
	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
	bookRepository.updateBook(bookId, price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		List<Book>books=bookRepository.findByAuthorStartsWith(author);
		return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book>books=bookRepository.findByCategory(category);
		return books;
	}

	@Override
	public List<Book> getPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=bookRepository.findPriceLessThan(price);
		if(books.isEmpty()) {
			throw new BookNotFoundException("book not found with lessm price");
		}
		return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book>books=bookRepository.findByAuthorContainsAndCategory(author, category);
		return books;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book=bookRepository.findById(bookId);
		if(book==null) {
			throw new IdNotFoundException("invalid id");
		}
		return book;
	}
	

}
