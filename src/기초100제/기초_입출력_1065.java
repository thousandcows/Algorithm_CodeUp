package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1065 {
	// 1065 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝수만 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 3개 입력받기
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		int intNum3 = scan.nextInt();

		// if문을 활용하여 짝수인 수만 출력하기

		if(intNum1 % 2 == 0) {
			System.out.println(intNum1);
		} 
		if(intNum2 % 2 == 0) {
			System.out.println(intNum2);
		} 
		if(intNum3 % 2 == 0) {
			System.out.println(intNum3);
		} 


	}
}