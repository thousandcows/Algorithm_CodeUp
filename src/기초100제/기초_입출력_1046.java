package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1046 {
	// 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// long형 정수 3개 입력받기
		long longNum1 = scan.nextLong();
		long longNum2 = scan.nextLong();
		long longNum3 = scan.nextLong();
		
		// 합 출력하기
		long total = longNum1 + longNum2 + longNum3;
		System.out.println(total);
		
		// 평균 출력하기
		float avg = (float)(total)/3;
		System.out.printf("%.1f", avg);
		
		
	}
}
