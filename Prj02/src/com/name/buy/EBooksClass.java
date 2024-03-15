package com.name.buy;

public class EBooksClass extends BookClass {
	public EBooksClass(String Title, String author, int price, String publisher,String Name) {
		super(Title, author,price,publisher);
		this.SuperDevices = Name;
	}
	public String SuperDevices; 
	public String DevicesInfo() {
		return SuperDevices;
	}
}
