package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1072 {
	// 1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 입력받을 정수 개수 받기
		int number = scan.nextInt();
		
		// for문으로 입력된 정수 출력하기
		for(int i = 0; i < number; i ++) {
			System.out.println(scan.nextInt());
		}
	}
}
