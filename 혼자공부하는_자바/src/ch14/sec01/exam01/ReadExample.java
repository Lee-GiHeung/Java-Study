package ch14.sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException  {
		// 1. 입력스트림 생성
		InputStream is = new FileInputStream("C:/TEMP/test.db");
		
		// 2. 읽어올 데이터가 없을 때까지 (read() == -1)
		// 	  데이터를 읽을 수 있다(read()호출)
		//    데이터를 가져오기 위해 while 반복문 사용		
		while(true) {
			int data = is.read(); // 1바이트씩 읽기
			
			if(data == -1) {
				break;				
			}
			System.out.println(data);
		}
		
		// 3. 데이터 읽기처리가 끝났으면
		//    입출력 자원을 반드시 반납(=close) 해야 함
			is.close();
	}

}