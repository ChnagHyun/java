package pck.test.ck;

class CarOne {	
	String kind = "쎼단";
	String modelName;
	String carColor;
	int carYear;
}

public class CreateCarOne {
	
	public static void main(String[] args) {
		CarOne c = new CarOne();
		CarOne c1 = new CarOne();
		
		System.out.println(c.kind);
		System.out.println(c1.kind);
		
	}
}
