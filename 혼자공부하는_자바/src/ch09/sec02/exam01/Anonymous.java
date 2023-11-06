package ch09.sec02.exam01;

public class Anonymous {
		// 필드 초기값으로 대입
		Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다,");
			work();
			}
		};
		void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
				}
			};
			// 로컬 변수 사용 (wake() 호출)
			localVar.wake();
			
			}
		
			// 익명 객체를 메소드의 매개변수로 전달
			void method2(Person person) {
				// 다형성을 이용한 메소드 재정의 실행
				person.wake();
			}
			
			// 실제 클래스를 이용구현
			Person student = new Student();
		}



