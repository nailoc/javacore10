package com.hk.app;

// 부모클래스 정의
public class Character {
	
	int rx;  // 행
	int cy;  // 열
	
	Character() { 
		this(0, 0);  // 자신의 생성자를 호출
	}   // 기본생성자 - 매개변수가 없음 
	Character(int r, int c) { // 매개변수 생성자 
		rx = r;
		cy = c;
	}
	
	// 초기좌표를 설정 - (0,0)초기화함
	public void initPos() {
		rx=0;
		cy=0;
	}

	// 게터와 세터 자동코드 생성
	// 자신의 멤버변수를 지정할 때  this.멤버변수 사용
	// 연습으로 생성하고 잠시 지워둠 (this 설명하기 위해)
	
	
	

}
