package ch14.sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteByteSubExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		
		byte[] bytes = {10, 20, 30, 40, 50};
		
		os.write(bytes, 1, 3); // 1번 인덱스붙 시작
							   // 3개를 출력해라
		
		// 출력 버퍼에 잔류하는 모둔 바이트 출력
		os.flush(); 
		// 출력 스트림을 닫음
		os.close(); 

	}

}
