package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1092 {
	// 1092 : [기초-종합] 함께 문제 푸는 날
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 정수 3개 입력받기
		int visiterOne = scan.nextInt();
		int visiterTwo = scan.nextInt();
		int visiterThree = scan.nextInt();
		scan.close();
		
		// for문을 활용해서 등비수열의 n번째 수 출력
		int day = 1;
		while(day%visiterOne != 0 || day%visiterTwo != 0 ||day%visiterThree != 0) {
			day++;
		}
		System.out.println(day);
	}
}