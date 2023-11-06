package ch14.sec02.exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	
	public static void main(String[] args) throws IOException {
		// FileReader 사용예제
		// 파일에 있는 내용을 문자 방식으로 읽어옴
		FileReader file = new FileReader("C:/temp/filedata.txt");
		
		int ch; // 한글자를 읽어옴
				// read()가 한글자를 리턴할 때 정수값으로 리턴
		
		// 파일의 끝에 도달할 때 까지 계속 반복함
		// 파일의 끝에 도착하면 -1 리턴함
		while(true) {
			// 한글자씩 입력스트림으로부터 받아옴
			ch = file.read();
			// 파일의 끝(-1)이면 루프종료
			if( ch == -1) {
				break;
			}
			System.out.println((char)ch);
		}
		file.close();
	} 
}
