package main.java.ssafy.im.hongwoong;

import java.util.Scanner;

public class Main {
	static int[] deltaRow = { 0, 1, 1 };
	static int[] deltaCol = { 1, 0, 1 };
	static int maxKill = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// 1. 입력을 받자 !
		Scanner sc = new Scanner(System.in);

		// 2. testCase를 입력 받자
		int testCase = sc.nextInt();

		for (int idx = 1; idx <= testCase; idx++) {
			// 3. mapsize를 입력 받고, 배열을 생성하자
			int mapSize = sc.nextInt();
			int[][] map = new int[mapSize][mapSize];

			// 4. 파리채 크기를 입력 받자
			int flySize = sc.nextInt();

			// 5. 맵 정보를 입력 받자
			for (int i = 0; i < mapSize; i++) {
				for (int j = 0; j < mapSize; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			// 6. 파리를 잡자 !
			for (int row = 0; row < mapSize; row++) { // map의 모든 row, col을 확인한다.
				for (int col = 0; col < mapSize; col++) {
					int kill = 0; // 잡은 파리의 수를 더해줄 변수
					kill += map[row][col]; // 현재 위치의 파리 잡자
					for (int d = 0; d < 3; d++) { // 오른쪽, 아래, 오른쪽 대각 아래를 탐색하자
						for (int m = 1; m < flySize; m++) { // 방향마다 m의 크기만큼탐색
							int newRow = row + deltaRow[d] * m; // 탐색할 row !
							int newCol = col + deltaCol[d] * m; // 탐색할 col !
							if(newRow>=0 && newRow <= mapSize-1 && newCol >=0 && newCol<= mapSize-1){
								kill += map[newRow][newCol]; // 범위 안넘어가면 더해주기
							}
						}
					}
					System.out.println("kill : " + kill);
					if (maxKill < kill) { // 최대로 죽인 파리
						maxKill = kill;
					}
				}
			}
			System.out.println("#" + idx + " " + maxKill);
		}

	}
}


