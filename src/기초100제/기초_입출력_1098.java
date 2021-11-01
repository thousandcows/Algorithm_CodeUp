package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1098 {
	// 1098 : [기초-2차원배열] 설탕과자 뽑기
	public static int [][] placeStick(int[][] plateArray,int length, int direction, int row, int col) {
		
		// 가로 방향
		if(direction==0) {
			for(int i = 0; i < length; i ++) {
				plateArray[row-1][col-1+i] = 1;
			}
		}// 세로 방향
		else if(direction==1) {
			for(int i = 0; i < length; i ++) {
				plateArray[row-1+i][col-1] = 1;
			}
		}
		return plateArray;
	}
	
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// h*w 2차원 격자판 생성하기
		int height = scan.nextInt();
		int width = scan.nextInt();
		int [][] plateArray = new int[height][width];
		
		// 막대의 개수 받기
		int stickNum = scan.nextInt();
		
		// 막대 길이, 방향, (x,y) 좌표 입력받기
		for(int i = 0; i < stickNum; i ++) {
			int length = scan.nextInt();
			int direction = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			// 설탕 뒤집기 
			placeStick(plateArray, length, direction, x, y);
		}
		
		scan.close();
		
		// 격자판 출력
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(plateArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}