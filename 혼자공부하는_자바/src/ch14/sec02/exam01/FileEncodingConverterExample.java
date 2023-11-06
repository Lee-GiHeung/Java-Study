package ch14.sec02.exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileEncodingConverterExample {

	public static void main(String[] args) throws IOException {
		// 1. 변환할 인코딩 파일을 읽어옴
		//    바이트 스트림으로 읽어와서
		//    내용물이 텍스트이므로 문자스트림리더로 설정하여
		//    버퍼 리더로 최종 읽기 속도를 높인다
		FileInputStream input = new FileInputStream("c:/temp/StreamData.txt");
		InputStreamReader reader = new InputStreamReader(input, "EUC-KR");		
		BufferedReader bufferReader = new BufferedReader(reader); 
				
		// 2. 읽어온 파일을 인코딩 변환하여 저장할 파일출력을 만듦 
		FileOutputStream output = new FileOutputStream("c:/temp/StreamData-UTF-8.txt");
		OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");		
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		// 3. 입력 파일의 내용을 한글자씩 읽어어면서 출력 스트림에 작업
		//    파일을 읽어오는 반복문 필요
		//    속도를 조금 더 올리기 위해
		//    BufferedReader와 별개로
		//    작은 메모리공간(버퍼)를 추가로 만듦
		final int BUFFER_SIZE = 1024;
		char[] chars = new char[BUFFER_SIZE];
		
		while(true) {
			int readCharNum = bufferReader.read(chars);
			if(readCharNum != -1) {
				bufferWriter.write(chars);	
			} else {
				break;
			}
		}
		
		// 4. 변환이 끝나면 사용한 자원(입력/출력스트림)을 닫음
		bufferWriter.flush();
	
		bufferReader.close();
		bufferWriter.close();
		
		reader.close();
		writer.close();
		
		input.close();
		output.close();
		
	}

}