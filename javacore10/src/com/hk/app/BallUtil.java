package com.hk.app;

public class BallUtil extends Shape3DVo {
	
	// x y z 에 대한 변수 사용 가능
	int radius;

	// 게터와 세터
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//부피를 구하는 메소드
	public double calVolume() {
		double result = 0;
		result = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
		return result;
	}
	
}
