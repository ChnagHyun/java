package pck.test.ck;

public class Student extends Person {
	int SId;
	String school;
	int grade;
	
	public Student(int SId, String school, int grade, String name, String gender) {
		super(name, gender);
		this.SId = SId;
		this.school = school;
		this.grade = grade;
	}
	
	public void myInfo() {		
		System.out.printf("나는 %d학번 %s학교 %d학년에 재학중인 %s이고 %s입니다.",SId, school, grade, gender, name);
	}



}



/*int SId;		//학번
String school;
int grade;
나는 xx학교 x학년에 재학중인 xx살 성별 홍길동입니다. */