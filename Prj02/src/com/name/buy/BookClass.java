package com.name.buy;

public class BookClass {
	
	private String Title;		//책제목
	private String author;		//작가
	private int price;			//가격
	private String publisher;	//출판사
	private final float tax = 1.1f; 	//세금
	
	
	BookClass (String Title, String author, int price, String publisher) {
		
	this.Title = Title;
	this.author = author;
	this.price = price;
	this. publisher = publisher;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle() {
		this.Title= Title;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor() {
		this.author = author;
	}
	public int getprice() {
		return price;
	}
	public void setprice() {
		this.price = price;
	}
	public String getpublisher() {
		return publisher;
		}
	public void setpublisher() {
		this.publisher = publisher;
	}
	public float gettax() {
		return tax;
	}
	@Override
	public String toString() {
		return null;
	}
	
	
}

