package com.pro.servlet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookSell {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;
	private String book_name;
	private String Auther_Name;
	private String Book_Price;
	public BookSell() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookSell(String book_name, String auther_Name, String book_Price) {
		super();
		this.book_name = book_name;
		this.Auther_Name = auther_Name;
		this.Book_Price = book_Price;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuther_Name() {
		return Auther_Name;
	}
	public void setAuther_Name(String auther_Name) {
		Auther_Name = auther_Name;
	}
	public String getBook_Price() {
		return Book_Price;
	}
	public void setBook_Price(String book_Price) {
		Book_Price = book_Price;
	}
	@Override
	public String toString() {
		return "BookSell [book_id=" + book_id + ", book_name=" + book_name + ", Auther_Name=" + Auther_Name
				+ ", Book_Price=" + Book_Price + "]";
	}
	
	
	

}
