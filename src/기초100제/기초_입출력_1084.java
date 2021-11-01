package 기초100제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 기초_입출력_1084 {
	// 1084 : [기초-종합] 빛 섞어 색 만들기
	public static void main(String[] args) throws IOException {

		// java.util.Scanner 불러오기
		Scanner scan = new Scanner(System.in);

		// 정수 3개 입력받기
		int redInt = scan.nextInt();
		int greenInt = scan.nextInt();
		int blueInt = scan.nextInt();
		
		// Buffer중첩 for문으로 rgb 경우의 수 조합 및 개수 출력하기
		int count = 0;
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<redInt; i++) {
			for(int j=0; j<greenInt; j++) {
				String str="";
				for(int k=0; k<blueInt;k++) {
					str += i+" "+j+" "+k+"\n";	
				}
				bf.write(str);
				bf.flush();
			}
		}
		System.out.println(redInt*greenInt*blueInt);
	}
}