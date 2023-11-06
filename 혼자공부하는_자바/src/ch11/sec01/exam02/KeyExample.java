package ch11.sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		// 식별키 만들기
		Key newKey = new Key(1);
		// 해시맵에서 데이터 추가
		// HashMap.put(키값,데이터값);
		// 해시맵에서 데이터 읽기
		// HashMap.get(키값)
		hashMap.put(newKey, "황진이");
		
		// 식별키 변수(=newKey)로 데이터 읽어오기
		String value = hashMap.get(newKey);
		System.out.println("key = " + newKey + ", value = " + value);
		
		// 임시 객체를 사용해서 임시로 메모리에 방을 만들고 힙에 접근
		hashMap.put(new Key(2), "가을"); // 저장
		// 저장된 데이터 읽어오기
		String value2 = hashMap.get(new Key(2));
		System.out.println("key2 = " + newKey + ", value2 = " + value2);
		
	}

}
