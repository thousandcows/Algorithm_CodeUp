package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1039 {
	// 1039 : [기초-산술연산] 정수 2개 입력받아 합 출력하기2
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// long형으로 정수 2개 입력받기
		long longNum1 = scan.nextLong();
		long longNum2 = scan.nextLong();
		
		// 정수 2개의 합 계산하기
		long total = longNum1 + longNum2;
		
		// 정수 2개의 합 출력하기
		System.out.println(total);
	}
}
