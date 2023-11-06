package ch06.sec04.exam04;

public class Calculator {
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		
		double avg(int x , int y) {
			double sum = plus(x, y);
			double result = sum / 2;
			return result;
		}
		
		void execute() {
			// 자기 자신을 의미하는 객체 this
			// 만일 실행 순서를 확실하게 알고 싶으면
			// this.avg(7, 10) 으로 this 객체를 붙이면 됨
			double result = avg(7, 10);
			println("실행결과  " + result);
			
			return; // 명령 함수에서 끝나는 위치를 정확하게 알고 싶을 때 사용 
					
		}
		
		void println(String string) {
			System.out.println(string);
		}
		
	}


