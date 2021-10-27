package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1036 {
	// 1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// char 변수 입력받기
		char ch = scan.next().charAt(0);
		
		// int형으로 casting하여 10진수로 출력하기
		System.out.println((int)ch);
	}
}
