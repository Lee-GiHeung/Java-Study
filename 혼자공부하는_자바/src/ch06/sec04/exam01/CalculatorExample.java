package ch06.sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result = myCalc.plus(100, 200);
		System.out.println("100 + 200 = " + result);
		
		int returnValue2 = myCalc.divide(100, 3);
		System.out.println("100 / 3 = " + returnValue2);
		
		double returnValue3 = myCalc.divide(100, 3);
		System.out.println("100 / 3 = " + returnValue3);
		
		myCalc.powerOff();
		
	}

}