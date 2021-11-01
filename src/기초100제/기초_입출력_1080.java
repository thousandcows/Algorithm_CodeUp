package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1080 {
	// 1080 : [기초-종합] 언제까지 더해야 할까?
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 1개 입력받기
		int targetNum = scan.nextInt();
		
		int compareNum = 0;
		int i;
		// for문으로 계속 더하기
		for(i = 1; compareNum <= targetNum; i++) {
			compareNum += i;
			if(compareNum >= targetNum) {
				System.out.println(i);
				break;
			}
		}
	}
}
