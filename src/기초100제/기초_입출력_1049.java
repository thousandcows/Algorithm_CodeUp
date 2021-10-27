package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1049 {
	// 1049 : [기초-비교연산] 두 정수 입력받아 비교하기1
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 2개 입력받기
		int intVal1 = scan.nextInt();
		int intVal2 = scan.nextInt();
		
		// if문으로 두 정수 비교하기
		int result = 0;
		if(intVal1 > intVal2) result = 1;
		
		// a*2^b 값 구해서 출력하기
		System.out.println(result);
		
	}
}