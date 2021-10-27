package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1040 {
	// 1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 1개 입력받기
		int intNum = scan.nextInt();
		
		// 정수 1개 부호 바꿔서 출력하기
		System.out.println((-1)*intNum);
	}
}
