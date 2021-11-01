package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1078 {
	// 1078 : [기초-종합] 짝수 합 구하기
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 1개 입력받기
		int endNum = scan.nextInt();	
		
		int total = 0;
		
		// for문으로 1부터 endNum까지 짝수의 합 구하기
		for(int i = 0; i <= endNum; i++) {
			if(i%2 == 0) total += i;
		}
		
		// 짝수의 합 출력
		System.out.println(total);
	}
}
