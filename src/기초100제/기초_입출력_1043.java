package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1043 {
	// 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 2개 입력받기
		int firstInt = scan.nextInt();
		int secondInt = scan.nextInt();
		
		// 첫 번째 정수를 두 번째 정수로 나눈 나머지
		int divInt = firstInt%secondInt;
		
		// 나머지 출력하기
		System.out.println(divInt);
	}
}
