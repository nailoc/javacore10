package com.hk.app;

//  3개의 정수값 이용해서 합계, 평균
public class CalUtil {
	
	int left;
	int right;
	int third;
	
	// 3개의 숫자를 변경해주는 메소드
	public void setOperand(int x, int y, int z) {
		left=x; 
		right=y;
		third=z;
	}
	
	// 오버로딩 - 숫자 2개이면
	public void setOperand(int x, int y) {
		left=x;
		right=y;
		third= 0;
	}
	
	// 합계 메소드
	public int sum() {
		int result = left+right+third;
		return result;
	}
	
	// 평균 메소드
	public double avg() {
		double result = 0;
		if(third==0) {
			result = sum() / 2.0;
		}else {
			result = sum() / 3.0;
		}
		return result;
	}

}
