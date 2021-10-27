package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1041 {
	// 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// char형 문자 1개 입력받기
		char ch = scan.next().charAt(0);
		
		// +1 연산 후 아스키문자로 변환하기
		char nextChar = (char)(ch+1);
		
		// 정수 1개 부호 바꿔서 출력하기
		System.out.println(nextChar);
	}
}
