package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1093 {
	// 1093 : [기초-1차원배열] 이상한 출석 번호 부르기1
	public static void main(String[] args) {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 출석 횟수 정수n 입력받기
		int countNum = scan.nextInt();
		
		// 개수가 12인 int형 배열 생성
		int [] attendArray = new int[23];
		
		// 각 배열의 초기값 0으로 설정
		for(int i = 0; i < attendArray.length; i++) {
			attendArray[i] = 0;
		}
		
		// 출석 횟수만큼 반복문 실행하기
		for(int c = 0; c < countNum; c++) {
			int callNum = scan.nextInt();
			// if문 활용해서 출석 부른 횟수 입력(break로 불필요한 계산 줄이기)
			for(int i = 0; i < attendArray.length; i++) {
				if (callNum == i+1 ) {
					attendArray[i] += 1;
					break;
				}
			}
		}
		scan.close();
		
		// 출석 현황 출력
		for(int i = 0; i < attendArray.length; i++) {
			System.out.print(attendArray[i] + " ");
		}
		
	}
}