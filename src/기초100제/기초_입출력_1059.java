package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1059 {
	// 1059 : [기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int intNum = scan.nextInt();

		// 비트 단위로 NOT하기
		int reverseNum = ~intNum;

		// 출력하기
		System.out.println(reverseNum);
	}
}