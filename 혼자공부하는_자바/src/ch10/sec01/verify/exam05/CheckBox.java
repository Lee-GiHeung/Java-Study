package ch10.sec01.verify.exam05;

public class CheckBox {
	OnSelectListener listener; // 이벤트 핸들러 필드
	
	// 속성함수
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	// 이벤트 발생을 시뮬레이션 하는 메소드
	void select() {
		listener.onSelect();
	}
	
	// 이벤트 자바에서는 이벤트를 인터페이스를 이용해서 선언
	static interface OnSelectListener {
		void onSelect();
	}
}
