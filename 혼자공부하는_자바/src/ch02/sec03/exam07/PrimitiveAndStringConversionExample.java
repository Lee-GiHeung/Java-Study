package ch02.sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.printf("value1 : %s \n", value1);
		System.out.printf("value2 : %s \n", value2);
		System.out.printf("value3 : %s \n", value3);

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		//p88 9번문제
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = 
					(int)(
					var1 +
				    (int)var2 + 
				    var3 +
				    Double.parseDouble(var4)); 
				
		System.out.printf("result : %d",result);

	}

}