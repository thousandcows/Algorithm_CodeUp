package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1095 {
	// 1095 : [기초-1차원배열] 이상한 출석 번호 부르기3
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 출석 횟수 정수n 입력받기
		int countNum = scan.nextInt();
		
		// 크기가 countNum인 int형 배열 생성
		int [] countArray = new int[countNum];
		
		// for문 활용하여 부른 번호를 배열에 저장
		for(int i = 0; i < countArray.length; i++) {
			countArray[i] = scan.nextInt();
		}
		
		// 저장된 배열 중 가장 빠른 번호를 출력
		int min = countArray[0];
		for(int i = 1; i < countArray.length; i++) {
			if(min > countArray[i]) min = countArray[i];
		}
		System.out.println(min);
	}
}