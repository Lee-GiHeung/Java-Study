package ch09.sec02.exam02;

public class Anonymous {
		// Anonymous 클래스의 필드
		private int channel = 3;
	
		// Anonymous 클래스의 속성 메소드
						
		public void setChannel(int channel) {
			this.channel = channel;
		}				
						
		public int getChannel() {
			return this.channel;
		}
		
		RemoteControl field = new RemoteControl() {
			// 현재 익명 구현 클래스의 내부필드
			public int channel = 3;
			
			// 현재 익명 구현 클래스의 내부 필드용
			// 속성 메소드
			public void setChannel(int channel) {
				System.out.println("익명구현객체 || setChannel");
				this.channel = channel;
			}
			
			public int getChannel() {
				System.out.println("익명구현객체 || getChannel");
				return this.channel;
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				System.out.println("현재 채널은 : " + this.channel);
				
			}
			
			@Override
			public void turnOff() {
				this.setChannel(7);
				System.out.println(
					"현재채널 : " + this.getChannel() + "로 변경하였습니다");
				System.out.println("TV를 끕니다.");
				
			}
		};
		
			void method1() {
				RemoteControl localVar = new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("AUDIO를 켭니다.");
						
					}
					
					@Override
					public void turnOff() {
						System.out.println("AUDIO를 끕니다.");
						
					}
				};
				// 로컬 변수 사용
				localVar.turnOn();
				}	
			
				void method2(RemoteControl rc) {
					rc.turnOn();
				}
		
			}
