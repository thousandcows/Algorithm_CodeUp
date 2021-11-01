package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1087 {
	// 1087 : [기초-종합] 여기까지! 이제 그만~
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int endNum = scan.nextInt();
		scan.close();
		// for문을 활용해서 합 출력
		int total = 0;
		for(int i = 1; total < endNum; i ++) {
			total+=i;
		}
		System.out.println(total);
		
	}
}