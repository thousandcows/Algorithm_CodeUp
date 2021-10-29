package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1067 {
	// 1067 : [기초-조건/선택실행구조] 정수 1개 입력받아 분석하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int intNum = scan.nextInt();

		// if-else문을 활용하여 음/양, 짝수/홀수 여부 출력하기

		// 음수인 경우
		if(intNum < 0) {
			System.out.println("minus");
			if(intNum % 2 == 0) {
				System.out.println("even");
			} else System.out.println("odd");
		}

		// 양수인 경우
		else {
			System.out.println("plus");
			if(intNum % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}
