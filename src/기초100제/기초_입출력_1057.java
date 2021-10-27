package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1057 {
	// 1057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 2개 입력받기
		int boolInt1 = scan.nextInt();
		int boolInt2 = scan.nextInt();
		
		// 논리값 비교해서 출력하기
		if(boolInt1 == boolInt2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}