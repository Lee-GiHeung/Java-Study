package ch07.sec01.exam01;

public class DmbSelfPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "녹색", 10);
		
		// 필드 초기화
		// DmbCellPhone 필드가 있었나?
		// DmbCellPhone 객체를 생성자로 초기화 하므로 주석처리
		// dmbCellPhone.color = "보라색";
		// dmbCellPhone.model = "자바폰";
		
		// 필드 내용 출력
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// dbmCellPhone을 작동 시킴
		String msg =  """				
				현재 DmbCellPhone 클래스는
				cellPhone클래스부터 상속(extends)받았으나
				아무것도 추가한 것이 없습니다.
				""";
		System.out.println(msg);
		
		// 전원켜기
		dmbCellPhone.powerOn();
		// 전화벨소리
		dmbCellPhone.bell();
		// "안녕하세요" 메세지 받기
		dmbCellPhone.receiveVocie("안녕하세요");
		// "반갑습니다" 메세지 받기
		dmbCellPhone.sendVoice("반갑습니다");
		// 통화 종료
		dmbCellPhone.hangUp();
		// 전원 끄기
		dmbCellPhone.powerOff();
		
		// DmbCellPhone 객체 전용 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
	}

}
