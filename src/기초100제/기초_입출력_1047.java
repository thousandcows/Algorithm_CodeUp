package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1047 {
	// 1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 1개 입력받기
		int intVal = scan.nextInt();
		
		// 2배 곱하기
		int multiVal = intVal * 2;
		
		// 값 출력하기
		System.out.println(multiVal);
		
	}
}