package main.java.algorithm.baekjun.ssafy.im.p2527_직사각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 4; i++) {
			// 직사각형 위치
			int[] recs = new int[8];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < 8; j++) {
				recs[j] = Integer.parseInt(st.nextToken());
			}
			int x = 0, y = 0, p = 0, q = 0, x1 = 0, y1 = 0, p1 = 0, q1 = 0;

			boolean areTheyEquals = false;

			if (recs[0] > recs[4]) {

				x = recs[0];
				y = recs[1];
				p = recs[2];
				q = recs[3];
				x1 = recs[4];
				y1 = recs[5];
				p1 = recs[6];
				q1 = recs[7];

			} else if (recs[0] < recs[4]) {

				x1 = recs[0];
				y1 = recs[1];
				p1 = recs[2];
				q1 = recs[3];
				x = recs[4];
				y = recs[5];
				p = recs[6];
				q = recs[7];
			} else {
				x1 = recs[0];
				y1 = recs[1];
				p1 = recs[2];
				q1 = recs[3];
				x = recs[4];
				y = recs[5];
				p = recs[6];
				q = recs[7];
			}


			if (!areTheyEquals) {
				if (y < y1) {
					if (p < p1) {
						if (q < q1) {
							if (x1 < p) {
								if (y1 < q) {
									System.out.println("a");
								} else if (y1 == q) {
									System.out.println("b");
								} else {
									System.out.println("d");
								}
							} else if (x1 == p) {
								if (y1 < q) {
									System.out.println("d");
								} else if (y1 == q) {
									System.out.println("c");
								} else {
									System.out.println("d");
								}
							} else {
								System.out.println("d");
							}
						} else if (q == q1) {
							if (x1 < p) {
								System.out.println("a");
							} else if (x1 == p) {
								System.out.println("b");
							} else {
								System.out.println("d");
							}
						} else {
							if (x1 < p) {
								System.out.println("a");
							} else if (x1 == p) {
								System.out.println("b");
							} else {
								System.out.println("d");
							}
						}
					} else if (p == p1) {
						if (q < q1) {
							if (x1 < p) {
								if (y1 < q) {
									System.out.println("a");
								} else if (y1 == q) {
									System.out.println("b");
								} else {
									System.out.println("d");
								}
							} else if (x1 > p) {
								System.out.println("d");
							} else {
								System.out.println("Something's strange!!");
							}
						} else if (q == q1) {
							if (x1 < p) {
								System.out.println("a");
							} else {
								System.out.println("Something's strange!! + aaaaaa");
							}
						} else {
							System.out.println("a");
						}
					} else {
						if (q < q1) {
							if (x1 < p) {
								System.out.println("a");
							} else if (x1 == p) {
								System.out.println("b");
							} else {
								System.out.println("d");
							}
						} else {
							System.out.println("a");
						}

					}

				} else if (y == y1) {
					System.out.println("a");
				} else {
					if (p < p1) {
						if (q < q1) {
							if (x1 < p) {
								System.out.println("a");
							} else if (x1 == p) {
								System.out.println("b");
							} else {
								System.out.println("d");
							}
						} else if (q == q1) {
							if (x1 < p) {
								System.out.println("a");
							} else if (x1 == p) {
								System.out.println("b");
							} else {
								System.out.println("d");
							}
						} else {
							if (q1 < y) {
								System.out.println("d");
							} else if (q1 == y) {
								if (x1 < p) {
									System.out.println("b");
								} else if (x1 == p) {
									System.out.println("c");
								} else {
									System.out.println("d");
								}
							} else {
								if (x1 < p) {
									System.out.println("a");
								} else if (x1 == p) {
									System.out.println("b");
								} else {
									System.out.println("d");
								}
							}
						}
					} else if(p==p1) {

					}

				}
			}

		}


		// 좌표평면
//			int[][] coo = new int[601][601];
//			// 사방탐색
//			int[] dr = {-1, 1, 0, 0};
//			int[] dc = {0, 0, -1, 1};
//
//			for (int j = 0; j < 8; j++) {
//				recs[j] = Integer.parseInt(st.nextToken());
//			}
//
//			boolean isThatOverlapped = false;
//			// 좌표평면에 직사각형 위치 저장 ( 첫번째 직사각형 1 두번째 직사각형 2 겹치면 3 )
//			for (int j = 0; j < coo.length; j++) {
//				for (int k = 0; k < coo.length; k++) {
//					for (int l = recs[0]; l < recs[2]; l++) {
//						for (int m = recs[1]; m < recs[3]; m++) {
//							coo[l][m] = 1;
//						}
//					}
//					for (int l = recs[4]; l < recs[6]; l++) {
//						for (int m = recs[5]; m < recs[7]; m++) {
//							if (coo[l][m] == 1) {
//								coo[l][m] = 3;
//								isThatOverlapped = true;
//								break;
//							} else {
//								coo[l][m] = 2;
//							}
//						}
//					}
//				}
//			}
//
////			for (int j = 0; j < coo.length; j++) {
////				for (int k = 0; k < coo.length; k++) {
////					System.out.print(coo[j][k]);
////				}
////				System.out.println();
////			}
//			// 겹치면 바로 출력
//			if (isThatOverlapped) {
//				System.out.println("a");
//			} else {
//				boolean isTherePoint = false;
//				boolean areTheySided = false;
//				for (int j = 0; j < coo.length; j++) {
//					for (int k = 0; k < coo.length; k++) {
//						// sided 먼저 찾기
//						for (int l = 0; l < dr.length; l++) {
//							int nr = j + dr[l];
//							int nc = k + dc[l];
//							if (nr >= 0 && nr <= coo.length - 1 && nc >= 0 && nc <= coo.length-1) {
//								if (coo[nr][nc] + coo[j][k] == 3) {
//									areTheySided = true;
//								}
//							}
//						}
//					}
//				}
//
//				if (!areTheySided) {
//					// 점으로 접할 때
//
//				}else{
//					System.out.println("b");
//				}
//
//			}
//
//
//		}

	}
}
