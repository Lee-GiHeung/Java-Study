package ch11.sec01.exam10;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 입력 받을 최대 글자수
		final int MAX_CHAE_LENGTH = 100;
		// 키보드로부터 읽은 바이트를 저장하기 위한 배열
		byte[] bytes = new byte[100];

		// 키보드 입력 안내글
		System.out.println("입력: ");
		
		// 배열에 키보드로부터 입력한 바이트를 저장하고 읽은 바이트 수를 리턴
		// 입출력은 예외가 발생할 수 있으므로 예외처리 해야함
		// 자바에서 키보드로부터 입력을 받는 가장 저수준 코드
		// System.in.read(저장할 바이트 배열)
		// 키보드 입력의 끝은 입력내용중 "\r\n"로 구분
		int readByteNo = System.in.read(bytes);
		
		// 키보드로부터 입력받은 문자들을 변환한
		// 바이트 배열을 다시 되돌린다.
		// new String(바이트배열, 시작 인덱스, 변환할 개수)
		// 바이트 배열을 -> 문자열로 변환
		// readByteNo - 2 : 문자열 변환시 \r\n 필요없으므로
		String str = new String(bytes, 0 , readByteNo-2);
		System.out.println(str);
		
	}
}