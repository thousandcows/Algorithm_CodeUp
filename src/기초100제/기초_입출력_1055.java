package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1055 {
	// 1055 : [기초-논리연산] 하나라도 참이면 참 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int boolInt1 = scan.nextInt();
		int boolInt2 = scan.nextInt();
		
		// 논리값 반대로 출력하기
		if(boolInt1 == 1 || boolInt2 == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}