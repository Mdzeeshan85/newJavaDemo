package service;

import exception.BookNotFoundException;
import exception.IdNotFoundException;
import model.Book;
import util.BookDetails;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements IBookService {
	
	private BookDetails details;
	
	
	@Autowired
	public void setDetails(BookDetails details) {
		this.details = details;
	}

	@Override
    public List<Book> getAll() {
         List<Book> books = details.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : details.showBooks()) {
            if ((book.getAuthor().toLowerCase()).startsWith(author.toLowerCase()))
                booksByAuthor.add(book);
        }
        if (booksByAuthor.isEmpty())
            throw new BookNotFoundException("Books doesn't exist starting with" + author);
        return booksByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : details.showBooks()) {
            if ((book.getCategory().toLowerCase()).equalsIgnoreCase(category.toLowerCase()))
                booksByCategory.add(book);
        }
        if (booksByCategory.isEmpty())
            throw new BookNotFoundException("Books doesn't exist with category " + category);
        return booksByCategory;
    }

    @Override
    public List<Book> getPriceLessThan(double price) throws BookNotFoundException {
        List<Book> booksLessThan = new ArrayList<>();
        for (Book book : details.showBooks()) {
            if (book.getPrice() <= price)
                booksLessThan.add(book);
        }
        if (booksLessThan == null)
            throw new BookNotFoundException("Books doesn't exists with price less than " + price);
        return booksLessThan;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> booksLessThan = new ArrayList<>();
        for (Book book : details.showBooks()) {
            if (book.getPrice() <= price)
                booksLessThan.add(book);
        }
        if (booksLessThan == null)
            throw new BookNotFoundException("Books doesn't exists with price less than " + price);
        return booksLessThan;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> booksWithAuthorAndCategory = new ArrayList<>();
        for (Book book : details.showBooks()) {
            if ((book.getCategory().toLowerCase()).equalsIgnoreCase(category.toLowerCase())
                    &&
                    (book.getAuthor().toLowerCase()).equalsIgnoreCase(author.toLowerCase()))
                booksWithAuthorAndCategory.add(book);
        }
        if (booksWithAuthorAndCategory.isEmpty())
            throw new BookNotFoundException("Books doesn't exist starting with" + author  + " and " + category);
        return booksWithAuthorAndCategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        for (Book book : details.showBooks()) {
            if(book.getBookId() == bookId) {
                return book;
            }
        }
        throw new IdNotFoundException("Book ID not found!!!!!");
    }
}