package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1097 {
	// 1097 : [기초-2차원배열] 바둑알 십자 뒤집기
	public static int [][] flipBoard(int[][] plateArray, int row, int col) {
		
		int i = row -1;
		int j = col -1;
		
		// i행에 있는 숫자 모두 반대로 뒤집기
		for(int k = 0; k < plateArray.length; k++) {
			if(plateArray[i][k] == 0) plateArray[i][k] = 1;
			else plateArray[i][k] = 0;
		}
		// j열에 있는 숫자 모두 반대로 뒤집기
		for(int k = 0; k < plateArray.length; k++) {
			if(plateArray[k][j] == 0) plateArray[k][j] = 1;
			else plateArray[k][j] = 0;
		}
		return plateArray;
	}
	
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 19*19 2차원 배열 생성하기
		int [][] plateArray = new int[19][19];
		
		// 바둑판 내용 입력
		for(int i = 0; i < plateArray.length; i++) {
			for(int j = 0; j < plateArray.length; j++) {
				plateArray[i][j] = scan.nextInt();
			}
		}
		
		// 십자 뒤집기 횟수, 좌표 받기
		int flipNum = scan.nextInt();
		for(int k = 0; k < flipNum; k ++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			flipBoard(plateArray, i, j);
		}
		scan.close();
		
		// 바둑판 출력
		for(int i = 0; i < plateArray.length; i++) {
			for(int j = 0; j < plateArray.length; j++) {
				System.out.print(plateArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}