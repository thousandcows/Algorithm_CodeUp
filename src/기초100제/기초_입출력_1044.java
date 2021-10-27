package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1044 {
	// 1044 : [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// long형 정수 1개 입력받기
		long longNum1 = scan.nextLong();
		
		// 정수에 1 더하기
		long total = longNum1 + 1;
		
		// 더한 값 출력하기
		System.out.println(total);
	}
}
