package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1076 {
	// 1075 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기2
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 문자 1개 입력받기
		char endChar = scan.next().charAt(0);
		char startChar = 'a';	

		// do-while문으로 시작 a부터 countdown까지 문자 출력하기
		do {
			System.out.print(startChar++ + " ");
		} while(startChar <= endChar);
	}
}
