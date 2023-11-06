package ch07.sec02.exam03;

public class HankookTire extends Tire {
	
	// 필드
	
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	// 메소드 오버라이딩(메소드 재정의 = 파생 메소드)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankkokTire 수명 : " + 
			(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("##### " + location + " HankookTire 펑크 #####");
			return false;
		}
	}
	
}
