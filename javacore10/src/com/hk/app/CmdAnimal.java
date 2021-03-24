package com.hk.app;

public class CmdAnimal {

	static int time =0;
	static int width = 21; // 전체 너비
	static int height = 21; // 전체 너비
	
	static Rabbit bucks = new Rabbit();
	static Grass flower = new Grass();
	public static void main(String[] args) {
		
		bucks.initPos();   // -> 전체너비가 변경될 때  중앙에 배치 (오버로딩)
		flower.initPos();  // -> 전체너비가 변경될 때 랜덤하게 배치 (오버로딩) 
		
		while(time<100) {
			
			Screen.clearConsole();
			
			System.out.println("현재시간:"+time);
			
			
			System.out.println("bucks의 행좌표는:" + bucks.rx);
			System.out.println("bucks의 열좌표는:" + bucks.cy);
			
			System.out.println("flower의 행좌표는:" + flower.rx);
			System.out.println("flower의 열좌표는:" + flower.cy);
			time++;
			
			try {
				Thread.sleep(1000);   // 메인프로그램 1초동안 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}

	}

}
