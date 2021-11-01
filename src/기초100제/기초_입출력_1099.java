package 기초100제;

import java.util.Scanner;

public class 기초_입출력_1099 {
	// 1099 : [기초-2차원배열] 성실한 개미

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        int[][] arr = new int[10][10];

	        // 배열 생성
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }

	        int flag = 1; // y값
	        int end = 0; // 종료

	        // 반복
	        for (int i = 1; i < arr.length; i++) {
	            if (end != 1) {
	                for (int j = flag; j < arr.length; j++) {
	                    if (arr[i][j] == 0) {
	                        arr[i][j] = 9;
	                    } else if (arr[i][j] == 2) {
	                        arr[i][j] = 9;
	                        end = 1;
	                        break;
	                    } else {
	                        flag = j - 1;
	                        break;
	                    }
	                }
	            } else {
	                break;
	            }
	        }

	        // 배열 출력
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	}
}
