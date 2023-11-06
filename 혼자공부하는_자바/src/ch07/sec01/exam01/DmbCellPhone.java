package ch07.sec01.exam01;

public class DmbCellPhone extends CellPhone {
	// 필드 추가
	// tv기능을 의미하는 channel변수 선언
	int channel;
	
	// channel변수를 초기화 하기 위하여 생성자 추가
	DmbCellPhone(
		String model,
		String color,
		int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// DmbCellPhone 클래스에 필요한 메소드 추가
	// dmbTv를 키다 = turnOnDmb()
	void turnOnDmb() {
		System.out.println(
			"채널 " + channel + 
			"번 DMB 방송 수신을 시작합니다.");
	}
	
	// dmbTv를 끄다. turnOffDmb()
	void turnOffDmb() {
		System.out.println(
			"채널 " + channel + 
			"번 DMB 방송 수신을 멈춥니다.");
	}
	
	// dmb채널을 변경한다. = changeChannelDmb(int channel)
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(
			"채널 " + channel + "번 입니다");
	
	}
		
}
