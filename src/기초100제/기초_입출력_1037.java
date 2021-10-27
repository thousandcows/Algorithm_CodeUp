package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1037 {
	// 1037 : [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// int형 정수 입력받기
		int intNum = scan.nextInt();
		
		// int형 정수를 char형으로 casting하여 출력하기
		System.out.println((char)intNum);
	}
}
