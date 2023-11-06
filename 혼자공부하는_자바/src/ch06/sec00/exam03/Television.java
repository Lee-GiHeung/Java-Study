package ch06.sec00.exam03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Television {
	
	private int channel; // 채널번호
	private int volume; // 음량
	private boolean onOff; // 전원 상태
	
	private String owner; // TV 소유자
	private String brand; // TV 제조원
	private int size; // TV 크기
	
	////////////////////////////
	//	속성메소드
	////////////////////////////
	
//	public int getChannel() {
//		return channel;
//	}
//
//	public int getVolume() {
//		return volume;
//	}
//
//	public boolean isOnOff() {
//		return onOff;
//	}
//
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//	public void setOnOff(boolean onOff) {
//		this.onOff = onOff;
//	}
//	
//	public String getOwner() {
//		return owner;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public void setSize(int size) {
//		this.size = size;
//	}
	
	// tv 정보출력
	public void printTvInfo() {
		System.out.println("tv info : " + this);
		System.out.println("tv channel : " + channel);
		System.out.println("tv volume : " + volume);
		System.out.println("tv onOff : " + onOff);
		
		System.out.println("tv owner : " + this.owner);
		System.out.println("tv brand : " + this.brand);
		System.out.println("tv size : " + size);
	}
	
//	// channel을 읽어라 (read)
//	public int getChannel() {
//		return channel;
//	}
//	
//	// channel을 바꿔라 (set)
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
	
	//////////////////////////////////
	// 기능 메소드
	//////////////////////////////////
	
}