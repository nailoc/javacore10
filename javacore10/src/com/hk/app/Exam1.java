package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		// 메인클래스
		// 2차원 원 참조변수 만들고 출력
		Shape2DVo circle = new Shape2DVo();
		circle.setX(10); circle.setY(5);
		System.out.println("circle의좌표는("+circle.getX()+","+circle.getY()+")");
		
		BallUtil ball = new BallUtil();
		//좌표를 변경하고
		ball.setX(4); ball.setY(3); ball.setZ(5);  // 상속을 받은 메소드
		ball.setRadius(10);
		//공의 부피를 출력하시오
		System.out.println("좌표출력=("+ball.getX()+","+
									  ball.getY()+","+
									  ball.getZ()+")");
		System.out.println("공의부피="+ball.calVolume());
		

	}

}
