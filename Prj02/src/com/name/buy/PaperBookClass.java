package com.name.buy;

public class PaperBookClass extends BookClass {
	public PaperBookClass(String Title, String author, int price, String publisher, int size) {
		super ( Title,author, price,publisher);
		this.Size = size;
	}
	public int Size;
	public int getSizeInfo() {
		return Size;
	}
	
}
