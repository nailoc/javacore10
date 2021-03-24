package com.hk.app;

import java.io.IOException;

public class CmdMain {

	public static void main(String[] args) {
		
		int time = 100;
		
		for(time=100; time<=200; time++) {	// 반복 100번
		
			clearConsole();						// 화면지우지
			
			System.out.println("현재시간:"+time);    // cmd창에서 실행하기
			
			try {
				Thread.sleep(1000);   // 메인프로그램 1초동안 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			
		}
		
		// 1 class파일위치를 알아야 함

	}
	
	public final static void clearConsole() {
		
		try {
			
			if(System.getProperty("os.name").contains("Windows"))
			{ 	// 윈도우계열 플레폼
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();			
			}else { // 유닉스(맥), 리눅스(유닉스-free)
				Runtime.getRuntime().exec("clear");
			}
		}catch(IOException | InterruptedException ex ) {}
		
		
	}

}
