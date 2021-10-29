package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1064 {
	// 1064 : [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 2개 입력받기
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		int intNum3 = scan.nextInt();
		
		// 3항 연산자를 활용해 가장 작은 수 출력하기
		int min = intNum1;
		if (intNum1 >= intNum2) {
			min = intNum2;
		}
		
		System.out.printf("%d", min>intNum3? intNum3:min);
		
	}
}