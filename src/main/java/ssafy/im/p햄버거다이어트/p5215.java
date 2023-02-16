package main.java.ssafy.im.p햄버거다이어트;

import java.util.Scanner;

public class p5215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt(); // 테스트 케이스 입력

		for (int idx = 1; idx <= testCase; idx++) { // 테스트 케이스만큼 반복
			int num = sc.nextInt(); // 재료 개수
			int cal = sc.nextInt(); // 칼로리 제한

			int[][] tasteCal = new int[num][2]; // 재료 정보 입력받을 배열

			for (int j = 0; j < num; j++) {
				for (int k = 0; k < 2; k++) {
					tasteCal[j][k] = sc.nextInt();
				}
			}

			long nowCal = 0; // 현재 칼로리 !
			long nowtaste = 0; // 현재 맛 !

			for (int j = 0; j < num; j++) {
				nowtaste += tasteCal[j][0]; // 최고의 맛 ! 하지만 칼로리 계산 해줘야함.
			}
			for (int j = 0; j < num; j++) {
				nowCal += tasteCal[j][1]; // 최고의 칼로리 ! 하지만 제한이 있음
			}

			long mintaste = Integer.MAX_VALUE; // 제일 맛 없는 재료를 빼자
			long mintasteCal = 0;
			while (nowCal >= cal) { // 칼로리의 제한

				for (int j = 0; j < num; j++) { // 제일 맛 없는 재료를 찾자
					if ((mintaste >= tasteCal[j][0]) && (tasteCal[j][0] != -1)) {
						mintaste = tasteCal[j][0];
						mintasteCal = tasteCal[j][1];
						tasteCal[j][0] = -1; // 이미 뺀 재료를 명시
					}
				}

				nowtaste -= mintaste; // 최고의 맛을 조금 빼자
				nowCal -= mintasteCal; // 맛을 뺀만큼 칼로리도 빠져야지
			}

			System.out.println("#" + idx + " " + nowtaste);

		}
	}
}