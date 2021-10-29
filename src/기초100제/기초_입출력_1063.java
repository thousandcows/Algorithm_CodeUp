package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1063 {
	// 1063 : [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 2개 입력받기
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		
		// 3항 연산자를 활용해 가장 큰 수 출력하기
		System.out.printf("%d", intNum1>intNum2? intNum1:intNum2);
		
	}
}