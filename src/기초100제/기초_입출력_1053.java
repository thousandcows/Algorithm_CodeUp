package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1053 {
	// 1052 : [기초-비교연산] 두 정수 입력받아 비교하기4
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int intBoolean = scan.nextInt();
		
		// 논리값 반대로 출력하기
		if(intBoolean == 1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}