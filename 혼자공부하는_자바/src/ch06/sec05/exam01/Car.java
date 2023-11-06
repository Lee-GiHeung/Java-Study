package ch06.sec05.exam01;

public class Car {
	
	// 필드
	String model;
	int speed;
	
	// 생성자 
	public Car(String model) {
		// 왼쪽은 멤버필드의 model
		// 오른쪽은 매개변수로 넘어온 model 
		this.model = model;
	}
	
	// 메소드
	// 왼쪽은 멤버필드의 speed 
	// 오른쪽은 매개변수로 넘어온 speed
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 멤버필드 speed의 값을 return
	int getSpeed() {
		return speed;
	}

	// 10에서 50까지 속도를 점진적으로 증가시킴
	// this를 붙이면 코드량이 많이 증가하지만
	// 개념적 이해가 확실히 되어서 오류가 덜 발생
	// 유지보수가 더 쉬워짐
	public void run() {
		for(int i = 10 ; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(
					this.model + "가 달립니다. (시속: " +
					this.speed + "km/h)"
				);
			
		}
		
	}
	
}