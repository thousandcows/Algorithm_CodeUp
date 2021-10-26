package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1033 {
	// 1033 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기2
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 10진 정수 입력받기
		int intNum = scan.nextInt();
		
		// 16진수로 출력하기
		String hexNum = Integer.toHexString(intNum).toUpperCase();
		System.out.printf(hexNum);
	}
}
