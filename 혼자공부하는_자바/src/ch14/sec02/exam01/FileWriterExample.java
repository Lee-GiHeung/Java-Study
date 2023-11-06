package ch14.sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("c:/temp/filedata2.txt");
		
		// 이스케이프문자 \r : 줄의 제일 처음으로 
		// 이스케이프문지 \n : 다음줄로
		// 윈도우즈는 \n만 해도 다음줄로 가서 줄의 처음 글자를 출력
		fileWriter.write("안녕하세요\r\n자바.\r\n");
		fileWriter.append("JAVAJAVAJVA");
		fileWriter.append("HI");
		fileWriter.append("BYE");
	
		// 다 사용 했으면 자원을 반납
		fileWriter.close();
		
	}

}
