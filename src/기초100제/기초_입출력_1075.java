package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1075 {
	// 1075 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기2
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 1개 입력받기
		int countdown = scan.nextInt();
			
		// while문으로 0을 제외한 입력된 정수 출력하기
		while(countdown > 0) {
			System.out.println(--countdown);
		}
	}
}
