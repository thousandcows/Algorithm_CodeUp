package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1042 {
	// 1042 : [기초-산술연산] 정수 2개 입력받아 나눈 몫 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 2개 입력받기
		int firstInt = scan.nextInt();
		int secondInt = scan.nextInt();
		
		// 첫 번째 정수를 두 번째 정수로 나누기
		int divInt = firstInt/secondInt;
		
		// 정수 1개 부호 바꿔서 출력하기
		System.out.println(divInt);
	}
}
