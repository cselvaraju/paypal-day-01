package com.paypal;

public class Book implements Cloneable {
	
	private int id;
	private String title;
	private String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public Book(Book other) {
		this.id = (int)(Math.random()*1000 + 1);
		this.title = other.title;
		this.author = other.author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.title.hashCode() + this.author.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		Book other = (Book)obj;
//		return this.title.equals(other.title) && 
//				this.author.equals(other.author);
		return this.hashCode() == obj.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Book(this);
		//		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book[ID: " + this.id +", Title: " + this.title + 
				", Author: " + this.author + "]";
	}
	
	
	
}
