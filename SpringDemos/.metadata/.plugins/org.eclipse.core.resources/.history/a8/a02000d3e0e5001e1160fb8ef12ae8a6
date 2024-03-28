package com.bookapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bookapp.model.Book;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setBookAuthor(rs.getString("author"));
		book.setBookId(rs.getInt("book_id"));
		book.setBookTitle(rs.getString("title"));
		book.setBookCategory(rs.getString("category"));
		book.setBookPrice(rs.getDouble("price"));
		return book;
	}

}
