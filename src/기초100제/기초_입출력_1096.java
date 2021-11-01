package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1096 {
	// 1096 : [기초-2차원배열] 바둑판에 흰 돌 놓기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 흰돌의 개수 입력받기
		int whiteStoneNum = scan.nextInt();
		
		// 2차원 배열 생성하기
		int [][] plateArray = new int[19][19];
		
		// 입력된 조건에 맞게 바둑한 생성
		for(int i = 0; i < plateArray.length; i++) {
			for(int j = 0; j < plateArray.length; j++) {
				plateArray[i][j] = 0;
			}
		}
		
		// 조건에 맞는 위치에 흰 바둑돌 놓기
		for(int k = 0; k < whiteStoneNum; k ++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			plateArray[i-1][j-1] = 1;
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