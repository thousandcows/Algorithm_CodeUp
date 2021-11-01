package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1089 {
	// 1089 : [기초-종합] 수 나열하기1
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 3개 입력받기
		int startNum = scan.nextInt();
		int addNum = scan.nextInt();
		int nthNum = scan.nextInt();
		scan.close();
		
		int targetNum = 0;
		// for문을 활용해서 등차수열의 n번째 수 출력
		for(int i = 1; i < nthNum; i ++) {
			startNum += addNum;
			targetNum = startNum;
		}
		System.out.println(targetNum);
	}
}