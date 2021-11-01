package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1079 {
	// 1079 : [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// while문으로 반복 출력하기
		while(true) {
			String word = scan.next();	
			
			System.out.println(word);
			if (word.equals("q")) break;
		}
	}
}
