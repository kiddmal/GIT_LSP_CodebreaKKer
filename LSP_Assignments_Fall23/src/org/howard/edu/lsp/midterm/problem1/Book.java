package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		
	}
	
	@Override
	public boolean equals(Object b) {
		if (b == this) {
			return true;
		}
		if (!(b instanceof Book)) {
			return false;
		}

		Book book2 = (Book) b;
		if (this.author == book2.author && this.title == book2.title) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "\"" + title + "\", " + author + ":" + year;
	
}
	}