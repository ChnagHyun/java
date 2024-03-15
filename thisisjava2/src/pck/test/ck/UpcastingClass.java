package pck.test.ck;
class Super {			//부모클래스
	String superField;

	public void getSuperField() {
		System.out.println("super " + superField);
	}

	public void setSuperField(String superField) {
		this.superField = superField;
	}
	public void overrideMethod() {
		System.out.println("나는 슈퍼 메서드");
	}
}	
class Sub extends Super{				//자식클래스
	String subField;
	public void getSubField() {
		System.out.println("subField" + superField);
	}
	
	public void setSubField(String superField) {
		this.superField = superField;
	}
	@Override
	public void overrideMethod() {
		System.out.println("나는 서버 메서드");
	}
}
	
public class UpcastingClass {
	public static void main (String[] args) {
		Super s = new Sub();			//부모타입 참조변수가 자식객체를 가리킨다.
		s.setSuperField("Parent");
		s.getSuperField();
		//s.setSubField("child");
		s.overrideMethod();
		
		Sub sub = (Sub)s;
		sub.setSubField("Child");
		sub.getSubField();
		sub.getSuperField();
	}
}
