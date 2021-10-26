package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1033 {
	// 1034 : [기초-출력변환] 8진 정수 입력받아 10진수로 출력하기2
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 8진 정수 string형으로 입력받기
		String octal = scan.next();
		
		// 10진수로 출력하기
		int decimal = Integer.parseInt(octal,8);
		System.out.println(decimal);
	}
}
