package extra.sec01.exam02;

public class RandomBooleanExample {

	public static void main(String[] args) {
		//0과1을 가지고 0 false 1 true	(나)	
		int num = (int) (Math.random() * 2);
		
		System.out.println("num = " + num);
		
		if(num == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		
		//0과1을 가지고 0 false 1 true	(선생님)
		//Math.random() : 0.0 <= rand < 0.99999999999 난수
		//Math.random() * 2 : 0.0 * 2 <= rand * 2 < 0.99999999 * 2
		// (int) (Math.random() * 2) : 난수 값보다 작은 정수
		int choice = (int) (Math.random() * 2);
		
	}

}
