package ch09.sec02.exam02;
					
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
						
		anony.field.turnOn();
		anony.field.turnOff();
		anony.getChannel();
		System.out.println(anony.getChannel());
						
		anony.method1();
					
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTv를 켭니다");
					System.out.println("기본 채널은 " + this.channel);
				}
													
				@Override
				public void turnOff() {
					System.out.println("SmartTv를 끕니다");
				}									
				// 익명 클래스의 필드
				public int channel = 3;
			}		
		);			
	}			
}						
							