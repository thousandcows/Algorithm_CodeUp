package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1077 {
	// 1077 : [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 1개 입력받기
		int endNum = scan.nextInt();	
		int startNum = 0;
		// do-while문으로 시작 0부터 endNum까지 정수 출력하기
		do {
			System.out.println(startNum++);
		} while(startNum <= endNum);
	}
}
