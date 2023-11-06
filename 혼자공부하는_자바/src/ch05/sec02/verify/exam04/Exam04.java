package ch05.sec02.verify.exam04;

public class Exam04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		// 최대값
		for(int i = 0 ; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
