package ch08.sec01.exam02;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 1;
	
	// 추상메소드
	// 이 메소드는 반드시 구현 클래스에서 구현 해야 함
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
