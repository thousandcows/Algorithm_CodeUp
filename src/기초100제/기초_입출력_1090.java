package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1090 {
	// 1090 : [기초-종합] 수 나열하기2
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 정수 3개 입력받기
		long startNum = scan.nextInt();
		int multiplyNum = scan.nextInt();
		int nthNum = scan.nextInt();
		scan.close();
		
		long targetNum = 0;
		// for문을 활용해서 등비수열의 n번째 수 출력
		for(int i = 1; i < nthNum; i ++) {
			startNum *= multiplyNum;
			targetNum = startNum;
		}
		System.out.println(targetNum);
	}
}