package ch10.sec01.verify.exam05;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		// checkBox 객체에 이벤트 핸들러 등록
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		// checkBox 위젯에 강제로 OnSelect 이벤트 발생
		checkBox.select();
	
	}
}
