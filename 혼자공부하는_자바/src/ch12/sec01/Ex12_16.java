package ch12.sec01;

import java.util.HashMap;
import java.util.Scanner;
// HashMap을 생성하고 사용자 ID와 비밀번호를 키와 값의 쌍으로 저장한 다음
// 입력된 사용자ID를 키로 HashMap에서 검색해서 얻은 값을 입력된 비밀번호와 비교하는 예제
public class Ex12_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // 이미 존재하는 키 추가가능. 기존 값은 없어짐
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id: ");
			String id = sc.nextLine().trim();
			
			System.out.println("pw : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}
			
			if(!(map.get(id)).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				
			} else {
				System.out.println("id와 비밀번호가 일치합니다");
				break;
			}
		}
		
	}

}
