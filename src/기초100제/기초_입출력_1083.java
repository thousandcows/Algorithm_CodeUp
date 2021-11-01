package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1083 {
	// 1083 : [기초-종합] 3 6 9 게임의 왕이 되자!
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 정수 1개 입력받기
		int endNum = scan.nextInt();
		
		// for문으로 3,6,9 게임 마스터하기
		for(int i = 1; i <= endNum; i++) {
			if(i % 3 == 0) System.out.print("X" + " ");
			else System.out.print(i + " ");
		}
	}
}
