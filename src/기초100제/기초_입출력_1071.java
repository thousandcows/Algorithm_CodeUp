package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1071 {
	// 1071 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기1
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 반복 실행구조 만들기
		int number;
		while(true) {
			number = scan.nextInt();
			if(number==0) {break;}
			System.out.println(number);
		}
	}
}
