package ch14.sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {

	public static void main(String[] args) throws IOException   {
		String filePath = 
			"src/ch14/sec02/verify/exam02/AddLineNumberExample.java";
		
		// filePath 경로의 파일을 읽기 위한 스트림을 만듦
		FileReader fr = new FileReader(filePath);
		// 메인 스트림의 기능을 향상하려는 것이므로
		// 메인 스트림의 참조변수가 매개변수로 전달 필요
		BufferedReader br = new BufferedReader(fr);
		
		// 소스코드를 읽어서 각 코드에 라인넘버를 추가함
		// 소스코드의 줄 수 만큼 반복 해야함 -반복문 필요
		// 반복되는 횟수가 정해지지 않음 - while문
		// Reader 문자 스트림 클래스는 한 줄을 읽기 위한
		// 메소드가 준비되어 있음. readLine
		// Reader.readLine() : \r 또는 \n을 만날때 까지 내용을 읽어 옴
		
		// readLine() 함수로 한 줄 읽은 결과 문자열을 저장할 문자열 변수
		// 저장할 문자열변수
		// Reader.readLine() 결과가 없으면 힙에 문자열 객체가 없으므로 null 반환 
		String lineString;
		int rowNumber = 0; // 처음에는 소스코드를 안읽었으므로 0
		
		while(true) {
			// 더 이상 파일의 내용이 없으므로 while 루프를 빠져나감
			if((lineString = br.readLine()) == null) {
				break;
			}
			
			// 파일에서 한 줄 읽어왔으므로 rowNumber = rowNumber + 1 
			// rowNumber : 현재 줄수
			// ": " : 구분기호
			// lineString : 파일에서 읽은 한줄
			System.out.println((++rowNumber) + ": " +lineString);
			
			// 입출력 스트림 정리
//			br.close();
//			fr.close();
			
		}
		
	}

}
