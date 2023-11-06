package ch14.sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesExample {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test2.db");

		// 일정 크기만큼 한 번에 읽어 속도를 높이는 버퍼 설정
		byte[] bytes = new byte[100]; // 길이 100인 배열 선언
		
		// 파일처리
		while(true) {
			// 파일에서 데이터를 읽어서 bytes 배열변수에 넣어라
			// 
			int readByteNum = is.read(bytes);
			
			if(readByteNum == -1) {
				break;
			}
			for(int i = 0; i < readByteNum; i++) {
				System.out.println(bytes[i]); 
			}
		}
		is.close();
		
	}
}