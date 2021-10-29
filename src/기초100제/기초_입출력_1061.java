package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1061 {
	// 1062 : [기초-비트단위논리연산] 비트단위로 XOR 하여 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 2개 입력받기
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		
		// 비트 단위로 OR 연산하기
		int orNum = intNum1|intNum2;
		
		// 출력하기
		System.out.println(orNum);
	}
}