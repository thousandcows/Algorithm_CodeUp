package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1073 {
	// 1073 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기2
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);


		// while문으로 0을 제외한 입력된 정수 출력하기
		while(true) {
			int number = scan.nextInt();
			if(number!=0) System.out.println(number);
			else break;
		}
	}
}
