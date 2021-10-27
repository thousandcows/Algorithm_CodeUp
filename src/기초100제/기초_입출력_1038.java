package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1038 {
	// 1038 : [기초-산술연산] 정수 2개 입력받아 합 출력하기1
	public static void main(String[] args) {
		
		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// long형 정수 2개 입력받기
		long long1 = scan.nextLong();
		long long2 = scan.nextLong();
		
		// long형 정수의 합 출력하기
		long total = long1 + long2;
		System.out.println(total);
	}
}
