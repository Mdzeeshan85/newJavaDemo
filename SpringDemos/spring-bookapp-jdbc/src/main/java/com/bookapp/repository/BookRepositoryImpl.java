package com.bookapp.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;
@Repository
public class BookRepositoryImpl implements IBookRepository {
	private JdbcTemplate jdbcTemplate;

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		Object[] bookArr= {book.getBookTitle(),book.getBookAuthor(),book.getBookCategory(),book.getBookPrice() };
		jdbcTemplate.update(Queries.INSERTQUERY, bookArr);
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY, bookId,price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);
		
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper=new BookMapper();
		List<Book> books=jdbcTemplate.query(Queries.SELECTQUERY,mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY,(rs,rowNum)->{
			Book book=new Book();
			book.setBookAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setBookTitle(rs.getString("title"));
			book.setBookCategory(rs.getString("category"));
			book.setBookPrice(rs.getDouble("price"));
			return book;
		},author);
		
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYCATEGORYQUERY, new BookMapper(),category);
		return books;
	}

	@Override
	public List<Book> findPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, new BookMapper(),author,category);
		return books;
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book=jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper() ,bookId);
		return book;
	}

}
