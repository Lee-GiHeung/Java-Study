package ch14.sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test9.txt");

		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 3, 3); // 3번째 인덱스부터
								   // 3개를 출력
		writer.flush();
		writer.close();
		
	}

}
