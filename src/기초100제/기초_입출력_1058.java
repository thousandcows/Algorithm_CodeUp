package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1058 {
	// 1058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 2개 입력받기
		int boolInt1 = scan.nextInt();
		int boolInt2 = scan.nextInt();
		
		// 논리값 비교해서 출력하기
		if(boolInt1 == 0 && boolInt2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}