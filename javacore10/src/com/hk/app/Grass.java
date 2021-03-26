package com.hk.app;

// 풀 클래스 정의

//Character 상속을 받고
public class Grass extends Character {
	
	// rx, cy 받아서 멤버변수 사용가능
	// initPos() 그대로 멤버메소드 사용가능
	
	// String color 멤버변수 추가 하시오
	String color;
	
	// 좌표 0,0 인데 다시 좌표를 랜덤하게 잡겠다
	public void initPos() { // 다시 정의한다 =? 오버라이딩
		// 랜덤한 좌표로 (전체 크기는  가로 11 세로 11 고정일 경우)
		rx = (int)(Math.random()*11)+1;
		cy = (int)(Math.random()*11)+1;
		
	}
	// 전체너비가 가변적이라면 랜덤한 좌표를 설정하기

}
