package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1086 {
	// 1086 : [기초-종합] 그림 파일 저장용량 계산하기
	public static void main(String[] args) throws IOException {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// double형 정수 3개 입력받기(곱했을 때 int형 변수 범위 고려)
		double w = scan.nextInt();
		double h = scan.nextInt();
		double b = scan.nextInt();
		
		// 저장 공간을 MB 단위로 변환하기
		double bitSize = w*h*b;
		long divNum = 8*1024*1024;
		double mbSize = bitSize/divNum;
		
		// 소수점 셋째 자리에서 반올림하여 출력하기
		System.out.printf("%.2f MB", mbSize);
	}
}