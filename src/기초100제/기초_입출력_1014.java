package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1014 {
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// String 배열을 선언하고 값을 나누어 담기 
		// replace.All method로 공백을 제거
		String input = scan.nextLine().replaceAll(" ", "");
		
		// char형 배열 선언하여 input에 저장된 문자열을 chars 배열에 할당
		char [] chars = input.toCharArray();
		char a = chars[0];
		char b = chars[1];
		
		// 입력한 a, b값 출력하기
		System.out.println(b + " " + a);
		
	}
}
