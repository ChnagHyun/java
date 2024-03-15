package pck.test.ck;

public class Person {
	String name;
	String gender;
	
	public Person(String name, String gender) {
	this.name = name;
	this.gender = gender;
	
	}
	void myInfo() {
		System.out.println("나의 이름은" + name + "이고" + gender + "입니다.");   //오버라이딩 시켜서 자식에서 "나는 XX학교 X학년에 재학중인 XX살 성별 홍길동입니다." 로 출력
    }
  }

