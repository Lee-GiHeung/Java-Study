package ch14.sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b  = 'B';
		char c = 'C';
		
		// 출력 스트림에 출력 => 파일로 저장		
		writer.write(a); // a 변수의 내용을 writer 출력에 전송
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
	}

}