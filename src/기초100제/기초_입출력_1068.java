package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1068 {
	// 1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int intScore = scan.nextInt();

		// if-else문을 활용하여 평가하기
		String grade = "A";
		
		if(70 <= intScore&&intScore <= 89 ) {grade = "B";}
		else if(40 <= intScore&&intScore <= 69 ) {grade = "C";}
		else if(0 <= intScore&&intScore <= 39 ) {grade = "D";}
		
		// 평가 결과 출력하기
		System.out.println(grade);
	}
}
