package com.collectionFrameworkQues;

	import java.util.ArrayList;

	class Book {
	    private int bookId;
	    private String bookName;
	    private String authorName;

	    public Book(int bookId, String bookName, String authorName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	    }

	    public int getBookId() {
	        return bookId;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    public void displayDetails() {
	        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName);
	    }
	}

	public class BookInfo {
	    public static void main(String[] args) {
	        ArrayList<Book> bookList = new ArrayList<>();

	        bookList.add(new Book(1, "Operating System", "xyz"));
	        bookList.add(new Book(2, "Computer Network", "abc"));
	        bookList.add(new Book(3, "Theory of Computation", "def"));
	        bookList.add(new Book(4, "Big Data", "lmn"));


	        for (Book book : bookList) {
	            book.displayDetails();
	        }
	    }
	}
