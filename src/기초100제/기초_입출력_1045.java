package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1045 {
	// 1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// long형 정수 2개 입력받기
		long longNum1 = scan.nextLong();
		long longNum2 = scan.nextLong();
		
		// 합 출력하기
		System.out.println(longNum1 + longNum2);
		// 차 출력하기
		System.out.println(longNum1 - longNum2);
		// 곱 출력하기
		System.out.println(longNum1 * longNum2);
		// 몫 출력하기
		System.out.println(longNum1 / longNum2);
		// 나머지 출력하기
		System.out.println(longNum1 % longNum2);
		// 나눈 값 출력하기
		float diValue = (float)longNum1/longNum2;
		System.out.printf("%.2f", diValue);
		
	}
}
