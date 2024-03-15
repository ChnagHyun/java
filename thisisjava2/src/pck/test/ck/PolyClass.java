package pck.test.ck;

class Car1 {
	Model model;
	void drive() {
		model.run();
	}
}

class Model {
	void run() {
		System.out.println("차가 달린다.");
	}
}

class Avante extends Model {
	
	@Override
	void run() {
		System.out.println("Avante가 달린다.");
	}
}

class Ramborghini extends Model {
	@Override
	void run() {
		System.out.println("Ramborghini가 달린다.");
	}
}

class Bentley extends Model {
	@Override
	void run() {
		
	
		System.out.println("Bentley가 달린다.");
	}
}
	

public class PolyClass {

	public static void main(String[] args) {
	/*	Bentley b = new Bentley();
		b.run();
		Ramborghini r = new Ramborghini();
		r.run();
		Avante a = new Avante();
		a.run();*/
		
		Car1 myCar = new Car1();
		
		myCar.model = new Model();
		myCar.drive();
		
		myCar.model = new Avante();
		myCar.drive();
		
		myCar.model = new Ramborghini();
		myCar.drive();
		
		myCar.model = new Bentley();
		myCar.drive();
	}
}
