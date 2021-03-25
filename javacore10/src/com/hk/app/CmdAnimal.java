package com.hk.app;

// 메인 클래스
public class CmdAnimal {

	// static 전역변수=클래스변수=한개만 존재도 가능
	static int time =0;
	static int width = 11; // 전체 너비
	static int height = 11; // 전체 너비
	static int[][] map = new int[width][height];  // 일단 작은맵 11x11
	// final 변동이 되지 않음
	final static String SPACE = "·";
	final static String RABBIT = "♡";
	final static String GRASS = "♧";
	
	static Rabbit bucks = new Rabbit();
	static Grass flower = new Grass();
	
	static {  // 초기화 블록
		for(int r=0; r<width; r++) {
			for(int c=0; c<height; c++) {
				map[r][c] = 0;    // 빈공간이라고 정의
			}
		}
	}
	
	// map 배열정보로 화면을 그리는 함수
	public static void DrawMap() {
		for(int r=0; r<width; r++) {
			for(int c=0; c<height; c++) {
				if(map[r][c]==0) {
					System.out.print(SPACE);
				}else if(map[r][c]==1) {
					System.out.print(RABBIT);
				}else if(map[r][c]==2) {
					System.out.print(GRASS);
				}
			}	
			System.out.println();	// 컬럼이 끝나면 다음라인으로
		}
	}
	
	// 토끼 Character들의 위치 정보로 map정보를 변경
	public static void changeMapByRabbit(Rabbit rab) {
		
		//rab.rx rab.cy => 토끼의 좌표정보
		map[rab.rx][rab.cy] = 1;  // 1 은 토끼가 있다는 표시
	}
	
	// 풀 Character들의 위치 정보로 map정보를 변경
	public static void changeMapByGrass(Grass gr) {
		map[gr.rx][gr.cy] = 2;	  // 2 는 풀이 있다는 표시
	}
	
	public static void main(String[] args) {  // 프로그램마다 1개만 존재 - 시작점
		// 수학클래스 수학함수 - 1개만 있어도 충분하기 때문에
		
		bucks.initPos();   // -> 전체너비가 변경될 때  중앙에 배치 (오버로딩)
		flower.initPos();  // -> 전체너비가 변경될 때 랜덤하게 배치 (오버로딩) 
		
		while(time<100) {
			
			Screen.clearConsole();
			
			changeMapByRabbit(bucks);
			changeMapByGrass(flower);
			
			DrawMap();  // 맵정보로 화면출력
			
			System.out.println("현재시간:"+time++); 	// 시간정보 출력
			
			System.out.println("토끼-01 의 행,열좌표는:" + bucks.rx + "," + bucks.cy);
			
			System.out.println("풀-01 의 행,열좌표는:" + flower.rx + "," + flower.cy);
			
			//time++;
			
			try {
				Thread.sleep(1000);   // 메인프로그램 1초동안 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}

	}

}
