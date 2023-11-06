package ch14.sec02.exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
	public static void main(String[] args) throws IOException {
		// FileReader 사용예제
		// 파일에 있는 내용을 문자 방식으로 읽어옴
		FileReader file = new FileReader("C:/temp/filedata.txt");
		
		int ch; // 한글자를 읽어옴
				// read()가 한글자를 리턴할 때 정수값으로 리턴
		
		// 1. FileReader로부터 한 글자를 읽어온다
		// ch = fileReader.read();
		// 2. ch 변수가 -1과 같다면 파일의 끝
		// 아니면 계속 파일로부터 한글자 읽어온다
		// 3. 루프를 계속 돌려면 ch != -1이면 됨
		// 4. 두 식을 합치면
		// 	  (ch = fileReader.read()) != -1)
		while ((ch = file.read()) != -1){	
			System.out.print((char)ch);
		}
		
		file.close();
	}
	
}
