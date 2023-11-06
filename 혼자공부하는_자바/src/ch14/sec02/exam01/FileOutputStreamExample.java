package ch14.sec02.exam01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException {
		// 1. 바이트 방식 파일 스트림을 만듦
		//    사용 예)
		// 	  FileOutputStream("파일경로", 추가가능여부)
		//    추가 가능 여부 : true = 이어서, false = 새로 
		FileOutputStream output = new FileOutputStream("c:/temp/StreamData.txt", false);
		
		// 2. 이 스트림에 OutputStreamWriter 보조 스트림을 연결하여 
		// 	  바이트 방식 스트림을 문자열 스트림처럼 다룸
		//    new OutputStreamWriter(출력 바이트 스트림, "인코딩문자형식");
		//    출력 스트림을 UTF-8 방식으로 변환하여 출력
		//    실제로 끝점의 출력방식이 파일 출력 스트림이므로 파일로 저장됨
		OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
		// 참조변수를 다른 인코딩 방식 객체를 가르키도록 바꿈
//		writer = new OutputStreamWriter(output, "EUC-KR");
		
		// 3. 이 스트림들에 다시 쓰기 속도를 올리기 위해 
		//    버퍼를 이용하여 한꺼번에 버퍼를  쓰기 작업
		BufferedWriter out = new BufferedWriter(writer);
		
		// 4. 프로그램 => 버퍼 쓰기 스트림 => 문자 쓰기 스트림 => 바이트 쓰기 스트림
		out.write("안녕하세요");
		out.write("\r\n 저는 자바 입니다.");
		out.append("저는 인터넷에 강한 언어 입니다.\r");
		out.append("\n강력한 보안 성능을 자랑합니다.");
		
		// 5. 모두 사용한 입출력 자원은 항상 닫아야 함 
		out.close();
	
	}
}
