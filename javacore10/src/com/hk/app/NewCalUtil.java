package com.hk.app;

public class NewCalUtil extends CalUtil {
	
	// 오버라이딩 - avg() 반올림 
	public double avg() {
		double result = 0;
		if(third==0) {
			result = sum() / 2.0;
		}else {
			result = sum() / 3.0;
		}
		//반올림처리
		result = Math.round(result);
		return result;
	}
	
	// substract() 구현 - 추가메소드
	public int substract() {
		int result = 0;
		result = left - right;
		return result;
	}
	

}
