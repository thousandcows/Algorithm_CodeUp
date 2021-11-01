package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1088 {
	// 1088 : [기초-종합] 3의 배수는 통과?
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// int형 정수 1개 입력받기
		int endNum = scan.nextInt();
		scan.close();
		
		// for문을 활용해서 3의 베수를 제외하고 출력
		for(int i = 1; i <= endNum; i ++) {
			if(i % 3 != 0)System.out.print(i + " ");
		}
		
	}
}