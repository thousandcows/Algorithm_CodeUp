package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1081 {
	// 1081 : [기초-종합] 주사위를 2개 던지면?
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);
		
		// 정수 2개 받기
		int firstDice = scan.nextInt();
		int secondDice = scan.nextInt();
		
		// 중첩 for문으로 경우의 수 모두 출력하기
		for(int i = 1; i <= firstDice; i++)
			for(int j = 1; j <= secondDice; j++)
				System.out.println(i +" "+ j);
	}
}
