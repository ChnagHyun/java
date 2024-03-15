package Interface.ch08.sec04;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();							//메소드 선언부만 작성
	void turnOff();							//메소드 선언부만 작성
	void setVolume(int volume);				//메소드 선언부만 작성
}
