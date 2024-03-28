package com.bookapp.util;

public class Queries {
	 public static final String INSERTQUERY = "Insert into book (title, author, category, price) values (?,?,?,?);";
	    public static final String UPDATEQUERY = "Update book set price=? where book_id=?";
	    public static final String DELETEQUERY = "Delete from book where book_id=?";

	    public static final String SELECTQUERY = "Select * from book";
	    public static final String SELECTBYAUTHORQUERY = "Select * from book where author=?";
	    public static final String SELECTBYCATEGORYQUERY = "Select * from book where category=?";

	    public static final String SELECTBYPRICEQUERY = "Select * from book where bookPrice<?";
	    public static final String SELECTBYAUTHORCATQUERY = "Select * from book where author=? and category=?";
	    public static final String SELECTBYIDQUERY = "Select * from book where book_id=?";
}
