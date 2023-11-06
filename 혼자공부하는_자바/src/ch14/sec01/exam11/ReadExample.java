package ch14.sec01.exam11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/test7.txt");
	
		while(true) {
			int data = reader.read();
			
			if(data == -1 ) {
				break;
			}
			// 읽은 데이터 처리
			System.out.println((char)data);
		}
		reader.close();
	}
}
