package ch06.sec00.exam02;

// public이 붙으면 클래스 이름과 파일이름이 같아야 함
public class Television {
	// 필드 정의
	int channel; // 채널 번호
	int volume; // 볼룸
	boolean onOff; // 전원 상태

	public static void main(String[] args) {
		// Television 객체를 만들어보자
		// 기본 자료형을 사용하듯이
		// 클래스(사용자 데이터 자료형) 객체 변수명
		// = new 클래스명();
		// new : 메모리(램 : 주기억장치)에 방을 새로 만들어라
		// 클래스명() : 생성자라는 메소드로 하는 역할은 
		// 방의 크기와 방의 종류를 알려준다
		
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		
		// tv객체의 상태를 출력
		System.out.println(
				"tv의 현재 상태 : " + tv.onOff + "\n" +
				" 음량 : " + tv.volume + "\n" +
				"tv 채널 : " + tv.channel + "\n"
				);
	}

}
