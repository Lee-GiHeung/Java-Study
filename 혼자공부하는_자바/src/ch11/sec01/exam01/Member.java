package ch11.sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 보통 매개변수로 데이터를 넘길때
	// 일반적인 부모클래스(주로 Object) 타입으로 작업함
	// 그래서 매개변수의 형식을 검사
	
	@Override // object 클래스의 equals 메소드를 꼭 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			// obj Member 타입이므로 실제 세부검사 시행
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
